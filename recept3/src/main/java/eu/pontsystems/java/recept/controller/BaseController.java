package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import eu.pontsystems.java.recept.session.FelhasznaloSessionBean;

public class BaseController {
	
	@Autowired
	protected FelhasznaloSessionBean fsb;
	
	
	protected boolean authSzukseges(Model model, String redirectUrl) {
		if (fsb.getFelhasznalo() == null) {
			
			
			model.addAttribute("redirectUrl", redirectUrl);
			model.addAttribute("errorMsg", "A kért oldal megjelenítéséhez belépés szükséges"+redirectUrl);
			
			return true;
		} else {
			return false;
		}
		
		
	}

}
