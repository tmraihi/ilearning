/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.service.impl;

import org.pfe.nadia.ilearning.core.dao.CompteDAO;
import org.pfe.nadia.ilearning.model.CompteEntity;
import org.pfe.nadia.ilearning.service.Authentification;
import org.pfe.nadia.ilearning.service.bean.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("authService")
public class AuthentificationImpl implements Authentification {

	@Autowired
	CompteDAO compteDao;

	public AuthentificationImpl() {
	}

	public Utilisateur chekConnection(String login, String password) {

		// si un utilisateur alors il construit Utilisateur(Compte).
		CompteEntity compte = compteDao.getCompte(login, password);

		return new Utilisateur(compte);
	}

	public void setCompteDao(CompteDAO compteDao) {
		this.compteDao = compteDao;
	}
}
