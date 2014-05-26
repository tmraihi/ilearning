package org.pfe.nadia.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.pfe.nadia.ilearning.service.AuthentificationService;
import org.pfe.nadia.ilearning.service.bean.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthentificationController extends GenericController
{
    @RequestMapping("/authentification")
    public String controleAuthentification (
	    HttpServletRequest request,
	    @RequestParam(value = "login") String login,
	    @RequestParam(value = "password") String password, Model model)
    {
	ApplicationContext ctx = getAppCtx();

	AuthentificationService auth = (AuthentificationService) ctx.getBean("authService");
	Utilisateur utilisateur = auth.chekConnection(login,password);
	if (null != utilisateur)
	{
	   request.getSession().setAttribute("utilisateur",utilisateur);
	    model.addAttribute("name", utilisateur.getName()); 
	    return "dashboard";
	}
	else
	{
	    model.addAttribute("error", "Login ou mot de passe invalide !");
	    return "login";
	}
	

	
    }

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;
	}
}
