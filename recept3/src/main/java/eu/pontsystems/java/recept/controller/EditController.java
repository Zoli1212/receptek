package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.pontsystems.java.recept.entity.Hozzavalo;
import eu.pontsystems.java.recept.entity.Recept;
import eu.pontsystems.java.recept.service.HozzavaloService;
import eu.pontsystems.java.recept.service.ReceptService;

@Controller
public class EditController {

	@Autowired
	private ReceptService rs;
	
	@Autowired
	private HozzavaloService hs;
	
	@GetMapping("edit")
	public String viewEdit(Model model, @RequestParam("id") Long id) {
		model.addAttribute("recept", rs.getOne(id));
		return "edit";
	}
	
	@PostMapping("edit")
	public String edit(Recept r) {
		rs.saveRecipe(r);
		return "redirect:/list";
	}
	
	@GetMapping("edit-hozzavalo")
	public String viewEditHozzavalo(Model model, @RequestParam("hid") Long hid) {
		model.addAttribute("hozzavalo", hs.getOne(hid));
		return "edithozzavalo";
	}
	
	@PostMapping("edit-hozzavalo")
	public String editHozzavalo(Long rid, Hozzavalo h) {
		rs.editHozzavalo(rid, h);
		return "redirect:/list";
	}
	
}
