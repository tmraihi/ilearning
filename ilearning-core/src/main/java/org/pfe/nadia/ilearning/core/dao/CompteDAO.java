/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.core.dao;
import java.util.List;

import org.pfe.nadia.ilearning.model.CompteEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


/**
 *
 * @author samsung
 */


public interface CompteDAO
{   
    public List<CompteEntity> getAllEmployees();
    public CompteEntity getCompte(String login, String password);
}

    
 
  
    
 
    

    
