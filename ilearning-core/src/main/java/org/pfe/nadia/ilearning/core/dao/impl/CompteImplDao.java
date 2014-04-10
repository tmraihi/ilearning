/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.core.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.pfe.nadia.ilearning.core.dao.BaseDAO;
import org.pfe.nadia.ilearning.core.dao.CompteDAO;
import org.pfe.nadia.ilearning.model.CompteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author samsung
 */
@Repository("compteDAO")
public class CompteImplDao extends BaseDAO implements CompteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<CompteEntity> getAllComptes() {

		return getSession().createQuery("from CompteEntity").list();

	}

	public List<CompteEntity> getAllEmployees() {
		// @TODO NADIA
		return null;
	}

	public CompteEntity getCompte(String login, String password) {
		CompteEntity compteEntity = (CompteEntity) getSession()
				.createCriteria(CompteEntity.class)
				.add(Restrictions.like("login", login))
				.add(Restrictions.like("password", password)).uniqueResult();
		return compteEntity;
	}

	public void supprimer(CompteEntity compte) {
		this.sessionFactory.getCurrentSession().delete(compte);

	}
}
