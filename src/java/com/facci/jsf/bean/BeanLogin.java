/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.jsf.bean;

import com.facci.jhs.bo.LoginBO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC 18
 */
public class BeanLogin {
    private String mensaje;
    private Boolean status;
    private String username;
    private String password;
    private List<BeanLogin> listaUsuarios;
    private LoginBO loginBO;

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the listaUsuarios
     */
    public List<BeanLogin> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<BeanLogin> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    /**
     * @return the loginBO
     */
    public LoginBO getLoginBO() {
        return loginBO;
    }

    /**
     * @param loginBO the loginBO to set
     */
    public void setLoginBO(LoginBO loginBO) {
        this.loginBO = loginBO;
    }
    
    public String validarLogin() {
        System.out.println("Username " + getUsername());
        System.out.println("Password " + getPassword());
        
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
        
        if (this.getStatus()){
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<BeanLogin>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            return "alumnos/alumno";
        } else {
            return "login";
        }        
    }
}
