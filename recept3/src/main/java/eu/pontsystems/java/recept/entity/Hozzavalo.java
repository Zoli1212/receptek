package eu.pontsystems.java.recept.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Hozzavalo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@ManyToOne
	private Recept recept;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Recept getRecept() {
		return recept;
	}

	public void setRecept(Recept recept) {
		this.recept = recept;
	}

	@Override
	public String toString() {
		return "Hozzavalo [id=" + id + ", name=" + name + "]";
	}
	
}
