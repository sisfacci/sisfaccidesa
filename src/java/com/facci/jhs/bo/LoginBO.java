/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.jhs.bo;

import com.facci.jdbc.dao.Login;
import com.facci.jhs.persistence.Usuario;
import com.facci.jsf.bean.BeanLogin;

/**
 *
 * @author PC 18
 */
public class LoginBO implements IloginBo{
    private Login loginDAO;    

    /**
     * @return the loginDAO
     */
    public Login getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(Login loginDAO) {
        this.loginDAO = loginDAO;
    }
    
    @Override
    public void validaLogin(BeanLogin obj) {
        Usuario login = new Usuario();
        login.setAlias(obj.getUsername());
        login.setClave(obj.getPassword());
        
        login = getLoginDAO().validaLogin(login);
        
        if (login != null) {
            obj.setStatus(true);
            obj.setMensaje("Encontrado");
        } else {
            obj.setStatus(false);
            obj.setMensaje("Usuario/Contraseña incorrectos");
        }
    }
}
