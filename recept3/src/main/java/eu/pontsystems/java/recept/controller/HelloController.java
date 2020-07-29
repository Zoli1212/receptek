package eu.pontsystems.java.recept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String helloEndpoint(Model model) {
		
		model.addAttribute("name", "Attila");
		
		return "hello";
	}
}
