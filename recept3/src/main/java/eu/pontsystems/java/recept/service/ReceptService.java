package eu.pontsystems.java.recept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.java.recept.entity.Hozzavalo;
import eu.pontsystems.java.recept.entity.Recept;
import eu.pontsystems.java.recept.repository.ReceptRepository;

@Service
public class ReceptService {
	
	@Autowired
	private ReceptRepository rr;
	
	public List<Recept> getAll(){
		return rr.findAll();	
	}
	
	public Recept getOne(Long id){
		return rr.getOne(id);
	}

	public void saveRecipe(Recept r) {
		if (r.getId() != null) {
			Recept old = getOne(r.getId());
			old.setName(r.getName());
			old.setCookTime(r.getCookTime());
			old.setPrepTime(r.getPrepTime());
			old.getKomment().setMsg(r.getKomment().getMsg());
			r = old;
		}
		rr.save(r);
	}
	
	public void simpleSave(Recept r) {
		rr.save(r);
	}
	
	public void deleteReceptById(Long id) {
		rr.deleteById(id);
	}

	public void saveRecept(Long rid, String name) {
		Recept r = getOne(rid);
		Hozzavalo h = new Hozzavalo();
		h.setName(name);
		h.setRecept(r);
		
		r.getHozzavalok().add(h);
		
		simpleSave(r);
		
		
	}

	public void deleteHozzavalo(Long rid, Long hid) {
		Recept r = getOne(rid);
		
		for (Hozzavalo h : r.getHozzavalok()) {
			if (h.getId() == hid) {
				r.getHozzavalok().remove(h);
				h.setRecept(null);
				
				break;
			}
		}
		
		simpleSave(r);
		
	}

	public void editHozzavalo(Long rid, Hozzavalo h) {
		Recept r = getOne(rid);
		for (Hozzavalo old_h : r.getHozzavalok()) {
			if (h.getId() == old_h.getId()) {
				old_h.setName(h.getName());
				
				break;
			}
		}
		
		simpleSave(r);
		
		
	}
	
}
