package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.pontsystems.java.recept.entity.Recept;
import eu.pontsystems.java.recept.service.ReceptService;

@Controller
public class NewController extends BaseController {

	@Autowired
	private ReceptService rs;
	
	@GetMapping("new")
	public String viewNewRecipe(Model model) {
		if (authSzukseges(model, "new")) {
			return "login";
		}
		
		return "new";
	}
	
	@PostMapping("new")
	public String newRecipe(Recept r) {
		rs.saveRecipe(r);
		return "redirect:list";
	}
	
	@GetMapping("new-hozzavalo")
	public String viewNewHozzavalo(@RequestParam("rid") Long id, Model model) {
		model.addAttribute("rid", id);
		return "newhozzavalo";
	}
	
	@PostMapping("new-hozzavalo")
	public String newHozzavalo(Long rid, String name) {
		rs.saveRecept(rid, name);
		return "redirect:list";
	}
	
}
