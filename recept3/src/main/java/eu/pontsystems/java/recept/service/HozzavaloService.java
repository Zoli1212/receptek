package eu.pontsystems.java.recept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.java.recept.entity.Hozzavalo;
import eu.pontsystems.java.recept.repository.HozzavaloRepository;

@Service
public class HozzavaloService {

	@Autowired
	private HozzavaloRepository hr;
	
	public Hozzavalo getOne(Long id) {
		return hr.getOne(id);
	}
}
