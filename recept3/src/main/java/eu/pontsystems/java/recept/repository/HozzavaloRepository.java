package eu.pontsystems.java.recept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.java.recept.entity.Hozzavalo;

@Repository
public interface HozzavaloRepository extends JpaRepository<Hozzavalo, Long> {

}
