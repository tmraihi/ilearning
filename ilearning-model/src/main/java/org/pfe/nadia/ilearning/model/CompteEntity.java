/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author samsung
 */
@Entity
@Table(name = "compte")
public class CompteEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	
	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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


}
