/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.service;

import junit.framework.TestCase;

import org.pfe.nadia.ilearning.service.bean.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author samsung
 */
public class AuthentificationTest extends TestCase {

	public AuthentificationTest(String testName) {
		super(testName);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test de la couche SERVICE / DAO / APPEL HIBERNATE
	 */
	public void testLogin() {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "conf/spring/spring-config.xml" });

		Authentification auth = (Authentification) ctx.getBean("authService");
		Utilisateur utilisateur = auth.chekConnection("loginTest",
				"passwordTest");

		assertEquals("nameTest", utilisateur.getName());
		assertEquals("lastNameTest", utilisateur.getLastName());
	}

}
