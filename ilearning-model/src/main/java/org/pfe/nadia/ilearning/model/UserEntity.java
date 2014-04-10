/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
/**
 *
 * @author samsung
 */
public class UserEntity {
    

private Integer IdUser;
private String nomUser;
private String prenomUser;
private Date datenaissUser;
private String email ;
private String passeword;
private String confirmpasseword;

    public UserEntity() {
    }
//Constructeur à paramétre
    public UserEntity(String nomUser, String prenomUser, Date datenaissUser, String email, String passeword, String confirmpasseword) {
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.datenaissUser = datenaissUser;
        this.email = email;
        this.passeword = passeword;
        this.confirmpasseword = confirmpasseword;
    }

    //getter et setter
    public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer IdUser) {
        this.IdUser = IdUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public Date getDatenaissUser() {
        return datenaissUser;
    }

    public void setDatenaissUser(Date datenaissUser) {
        this.datenaissUser = datenaissUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasseword() {
        return passeword;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword;
    }

    public String getConfirmpasseword() {
        return confirmpasseword;
    }

    public void setConfirmpasseword(String confirmpasseword) {
        this.confirmpasseword = confirmpasseword;
    }
    



}


