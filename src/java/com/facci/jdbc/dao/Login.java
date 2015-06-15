/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.jdbc.dao;

import com.facci.jhs.persistence.Usuario;

/**
 *
 * @author PC 18
 */
public class Login implements IfaceLogin{

    @Override
    public Usuario validaLogin(Usuario obj) {        
        return obj;
    }
    
}
