package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.java.recept.service.ReceptService;

@Controller
public class ListController extends BaseController {

	@Autowired
	private ReceptService rs;
	
	@GetMapping("list")
	public String viewAllRecipes(Model model) {
		if (authSzukseges(model, "list")) {
			return "login";
		}
		
		model.addAttribute("receptek", rs.getAll());
		return "list";
	}
}
