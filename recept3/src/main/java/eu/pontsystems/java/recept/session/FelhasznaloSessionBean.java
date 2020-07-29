package eu.pontsystems.java.recept.session;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import eu.pontsystems.java.recept.entity.Felhasznalo;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class FelhasznaloSessionBean {
	
	private Felhasznalo felhasznalo;

	public Felhasznalo getFelhasznalo() {
		return felhasznalo;
	}

	public void setFelhasznalo(Felhasznalo felhasznalo) {
		this.felhasznalo = felhasznalo;
	}

}
