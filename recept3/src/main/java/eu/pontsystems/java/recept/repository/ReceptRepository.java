package eu.pontsystems.java.recept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.java.recept.entity.Recept;

@Repository
public interface ReceptRepository extends JpaRepository<Recept, Long> {

	
}
