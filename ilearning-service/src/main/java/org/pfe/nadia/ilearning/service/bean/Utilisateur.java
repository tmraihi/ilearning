/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.service.bean;

import org.pfe.nadia.ilearning.model.CompteEntity;

/**
 *
 * @author samsung
 */
public class Utilisateur {
    
    public Utilisateur() {
		super();
	}

	String login;
    String name;
    String lastName;

    public Utilisateur(CompteEntity compte) {
    	if (null != compte) {
    		this.name = compte.getName();
    		this.lastName = compte.getLastName();
		}
	}

	public String getLogin() {
        return login;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLogin(String login) {
        this.login = login;
    }
}
