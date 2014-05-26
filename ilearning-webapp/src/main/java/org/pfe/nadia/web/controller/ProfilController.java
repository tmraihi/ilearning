package org.pfe.nadia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfilController
{
    
    @RequestMapping("/profil")
    public String controleAuthentification( Model model)
    {

	 model.addAttribute("monmessage", "coucou !!");
	    return "profil";
    }
    
}
