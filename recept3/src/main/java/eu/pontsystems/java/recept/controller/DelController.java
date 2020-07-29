package eu.pontsystems.java.recept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.pontsystems.java.recept.service.ReceptService;

@Controller
public class DelController {

	@Autowired
	private ReceptService rs;
	
	@GetMapping("del")
	public String deleteRecept(@RequestParam("id") Long id) {
		rs.deleteReceptById(id);
		return "redirect:/list";
	}
	
	@GetMapping("del-hozzavalo")
	public String deleteHozzavalo(@RequestParam("rid") Long rid, @RequestParam("hid") Long hid) {
		rs.deleteHozzavalo(rid, hid);
		return "redirect:/list";
	}
	
	
}
