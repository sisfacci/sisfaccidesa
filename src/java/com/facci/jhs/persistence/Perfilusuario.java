package com.facci.jhs.persistence;
// Generated 15-jun-2015 14:57:13 by Hibernate Tools 4.3.1



/**
 * Perfilusuario generated by hbm2java
 */
public class Perfilusuario  implements java.io.Serializable {


     private int id;
     private Perfil perfil;
     private Usuario usuario;
     private Boolean activo;

    public Perfilusuario() {
    }

	
    public Perfilusuario(int id) {
        this.id = id;
    }
    public Perfilusuario(int id, Perfil perfil, Usuario usuario, Boolean activo) {
       this.id = id;
       this.perfil = perfil;
       this.usuario = usuario;
       this.activo = activo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }




}


