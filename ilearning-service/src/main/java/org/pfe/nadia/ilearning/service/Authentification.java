package org.pfe.nadia.ilearning.service;

import org.pfe.nadia.ilearning.service.bean.Utilisateur;
import org.springframework.stereotype.Service;

/**
 *
 * @author samsung
 */
public interface Authentification {
    
     public Utilisateur chekConnection(String login, String password);
     
}
