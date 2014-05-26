package org.pfe.nadia.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.pfe.nadia.ilearning.model.CoursEntity;
import org.pfe.nadia.ilearning.service.AuthentificationService;
import org.pfe.nadia.ilearning.service.CoursService;
import org.pfe.nadia.ilearning.service.bean.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursController extends GenericController
{

    @RequestMapping("/cours/etudiant")
    public String AfficherTousLesCoursEtudiant(HttpServletRequest request,
	    Model model)
    {
	ApplicationContext ctx = getAppCtx();

	Utilisateur utilisateur = (Utilisateur) request.getSession()
		.getAttribute("utilisateur");

	CoursService service = (CoursService) ctx.getBean("coursService");
	Collection<CoursEntity> cours = service.getCours(utilisateur);
	List<String> myList = new ArrayList<String>();
	
	for (CoursEntity coursEntity : cours)
	{
	    myList.add(coursEntity.getTitre());
		    
	}
	model.addAttribute("myList", myList);
	return "cours_etudiant";
    }

    @RequestMapping("/cours/enseignant")
    public String AfficherTousLesCoursEnseignant(HttpServletRequest request,
	    Model model)
    {
	ApplicationContext ctx = getAppCtx();


	Utilisateur utilisateur = (Utilisateur) request.getSession()
		.getAttribute("utilisateur");

	CoursService service = (CoursService) ctx.getBean("coursService");
	Collection<CoursEntity> cours = service.getCours(utilisateur);

	List<String> myList = new ArrayList<String>();
	
	for (CoursEntity coursEntity : cours)
	{
	    myList.add(coursEntity.getTitre());
		    
	}
	model.addAttribute("myList", myList);
	return "cours_enseignant";
    }
}
