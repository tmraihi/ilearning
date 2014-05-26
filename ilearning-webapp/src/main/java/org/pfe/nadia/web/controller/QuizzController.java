package org.pfe.nadia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizzController
{
    
    @RequestMapping("/quizz/etudiant/display")
    public String AfficherTousLesQuizzEtudiant( Model model)
    {

	    return "quizz_etudiant";
    }
    
    @RequestMapping("/quizz/enseignant/display")
    public String AfficherTousLesQuizzEnseignant( Model model)
    {

	    return "quizz_enseignant";
    }
    
}
