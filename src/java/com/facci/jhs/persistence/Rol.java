package com.facci.jhs.persistence;
// Generated 15-jun-2015 14:57:13 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int id;
     private String nombre;
     private Set usuarios = new HashSet(0);
     private Set perfilrecursos = new HashSet(0);

    public Rol() {
    }

	
    public Rol(int id) {
        this.id = id;
    }
    public Rol(int id, String nombre, Set usuarios, Set perfilrecursos) {
       this.id = id;
       this.nombre = nombre;
       this.usuarios = usuarios;
       this.perfilrecursos = perfilrecursos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getPerfilrecursos() {
        return this.perfilrecursos;
    }
    
    public void setPerfilrecursos(Set perfilrecursos) {
        this.perfilrecursos = perfilrecursos;
    }




}


