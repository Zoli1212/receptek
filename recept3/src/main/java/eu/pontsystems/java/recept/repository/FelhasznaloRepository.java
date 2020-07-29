package eu.pontsystems.java.recept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.java.recept.entity.Felhasznalo;

@Repository
public interface FelhasznaloRepository extends JpaRepository<Felhasznalo, Long> {

	Felhasznalo findByNameAndPassword(String name, String password);
	
	
}
