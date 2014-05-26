package org.pfe.nadia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "Nadia") String name, Model model) {
		model.addAttribute("name", name);
		return "pageName";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}
}
