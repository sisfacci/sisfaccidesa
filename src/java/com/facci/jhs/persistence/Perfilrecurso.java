package com.facci.jhs.persistence;
// Generated 15-jun-2015 14:57:13 by Hibernate Tools 4.3.1



/**
 * Perfilrecurso generated by hbm2java
 */
public class Perfilrecurso  implements java.io.Serializable {


     private int id;
     private Perfil perfil;
     private Recurso recurso;
     private Rol rol;
     private Boolean activo;

    public Perfilrecurso() {
    }

	
    public Perfilrecurso(int id) {
        this.id = id;
    }
    public Perfilrecurso(int id, Perfil perfil, Recurso recurso, Rol rol, Boolean activo) {
       this.id = id;
       this.perfil = perfil;
       this.recurso = recurso;
       this.rol = rol;
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
    public Recurso getRecurso() {
        return this.recurso;
    }
    
    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }




}


