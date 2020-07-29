package eu.pontsystems.java.recept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.java.recept.entity.Felhasznalo;
import eu.pontsystems.java.recept.repository.FelhasznaloRepository;

@Service
public class LoginService {

	
	@Autowired
	private FelhasznaloRepository fr;
	
	public Felhasznalo authenticate(String username, String password) {
		return fr.findByNameAndPassword(username, password);
	}
	
	
}
