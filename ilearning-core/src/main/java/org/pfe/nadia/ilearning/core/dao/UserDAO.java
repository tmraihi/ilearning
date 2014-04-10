/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pfe.nadia.ilearning.core.dao;

import java.util.List;

import org.pfe.nadia.ilearning.model.UserEntity;


/**
 *
 * @author samsung
 */
public class UserDAO {

    public interface EmployeeDAO {

        public void addUser(UserEntity employee);

        public List<UserEntity> getAllUser();

        public void deleteUser(Integer IdUser);
    }
}
