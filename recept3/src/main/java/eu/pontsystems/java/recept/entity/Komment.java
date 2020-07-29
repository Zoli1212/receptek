package eu.pontsystems.java.recept.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Komment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String msg;

	@OneToOne(mappedBy = "komment")
	private Recept recept;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Recept getRecipe() {
		return recept;
	}

	public void setRecipe(Recept recipe) {
		this.recept = recipe;
	}

	@Override
	public String toString() {
		return "Komment [id=" + id + ", msg=" + msg + "]";
	}

	
}
