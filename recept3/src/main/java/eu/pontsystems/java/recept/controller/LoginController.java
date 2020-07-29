package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.java.recept.entity.Felhasznalo;
import eu.pontsystems.java.recept.service.LoginService;
import eu.pontsystems.java.recept.session.FelhasznaloSessionBean;

@Controller
public class LoginController {

	@Autowired
	private LoginService ls;
	
	@Autowired
	private FelhasznaloSessionBean fsb;
	
	@GetMapping("login")
	public String viewLogin() {
		return "login";
	}
	
	@PostMapping("login")
	public String doLogin(String name, String password, String redirectUrl, Model model) {
		Felhasznalo f = ls.authenticate(name, password);
		if (f != null) {
			fsb.setFelhasznalo(f);
			System.out.println(redirectUrl);
			return redirectUrl != null ? String.format("redirect:%s", redirectUrl) : "redirect:/list";
		} else {
			model.addAttribute("redirectUrl", redirectUrl);
			model.addAttribute("errorMsg", "Hibás felhasználó név vagy jelszó!");
			return "login";
		}
		
	}
	
	
	
}
