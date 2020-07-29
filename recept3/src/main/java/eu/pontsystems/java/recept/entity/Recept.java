package eu.pontsystems.java.recept.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Recept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "")
	private String name;
	private Integer prepTime;
	private Integer cookTime;

	@OneToOne(cascade = CascadeType.ALL)
	private Komment komment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recept", orphanRemoval = true )
	private List<Hozzavalo> hozzavalok;
	
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

	public Integer getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	public Komment getKomment() {
		return komment;
	}

	public void setKomment(Komment komment) {
		this.komment = komment;
	}

	public List<Hozzavalo> getHozzavalok() {
		if (hozzavalok == null) {
			hozzavalok = new ArrayList<>();
		}
		return hozzavalok;
	}

	public void setHozzavalok(List<Hozzavalo> hozzavalok) {
		this.hozzavalok = hozzavalok;
	}

	@Override
	public String toString() {
		return "Recept [id=" + id + ", name=" + name + ", prepTime=" + prepTime + ", cookTime=" + cookTime
				+ ", komment=" + komment + ", hozzavalok=" + hozzavalok + "]";
	}

}
