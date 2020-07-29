package eu.pontsystems.java.recept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import eu.pontsystems.java.recept.entity.Felhasznalo;
import eu.pontsystems.java.recept.entity.Hozzavalo;
import eu.pontsystems.java.recept.entity.Komment;
import eu.pontsystems.java.recept.entity.Recept;
import eu.pontsystems.java.recept.repository.FelhasznaloRepository;
import eu.pontsystems.java.recept.repository.ReceptRepository;

@Component
public class DataInicializalo implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ReceptRepository rr;
	
	@Autowired
	private FelhasznaloRepository fr;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Felhasznalo f1 = new Felhasznalo();
		f1.setName("user1");
		f1.setPassword("user1");
		
		fr.save(f1);
		
		Felhasznalo f2 = new Felhasznalo();
		f2.setName("user2");
		f2.setPassword("user2");
		
		fr.save(f2);
		
		
		
		Recept r1 = new Recept();
		r1.setName("Csípős bab");
		r1.setCookTime(10);
		r1.setPrepTime(5);
		
		Komment k1 = new Komment();
		k1.setMsg("Piedone kedvence");
		
		Hozzavalo h = new Hozzavalo();
		h.setName("bab");
		h.setRecept(r1);
		Hozzavalo h2 = new Hozzavalo();
		h2.setName("Pepperoni");
		h2.setRecept(r1);
		

		r1.getHozzavalok().add(h);
		r1.getHozzavalok().add(h2);
		r1.setKomment(k1);
		rr.save(r1);
		
		
//		---------------------------------------------------------------
		
		
		Recept r2 = new Recept();
		r2.setName("Palacsinta");
		r2.setCookTime(10);
		r2.setPrepTime(50);
		
		Komment k2 = new Komment();
		k2.setMsg("Csak nutellás");
		
		Hozzavalo h3 = new Hozzavalo();
		h3.setName("liszt");
		h3.setRecept(r2);
		Hozzavalo h4 = new Hozzavalo();
		h4.setName("tej");
		h4.setRecept(r2);
		

		r2.getHozzavalok().add(h3);
		r2.getHozzavalok().add(h4);
		
		r2.setKomment(k2);
		rr.save(r2);
		
		
		
		
		
		
//		---------------------------------------------------------------
		
		
		
		
		
		Recept r3 = new Recept();
		r3.setName("Rántott csirke");
		r3.setCookTime(20);
		r3.setPrepTime(30);
		
		rr.save(r3);
		
		
		
	}

}
