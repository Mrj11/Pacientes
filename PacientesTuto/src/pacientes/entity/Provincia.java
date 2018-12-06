package pacientes.entity;
// Generated 06-dic-2018 4:24:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Provincia generated by hbm2java
 */
public class Provincia  implements java.io.Serializable {


     private int idprovincia;
     private String nombre;
     private Set domicilios = new HashSet(0);
     private Set localidads = new HashSet(0);

    public Provincia() {
    }

	
    public Provincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }
    public Provincia(int idprovincia, String nombre, Set domicilios, Set localidads) {
       this.idprovincia = idprovincia;
       this.nombre = nombre;
       this.domicilios = domicilios;
       this.localidads = localidads;
    }
   
    public int getIdprovincia() {
        return this.idprovincia;
    }
    
    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set domicilios) {
        this.domicilios = domicilios;
    }
    public Set getLocalidads() {
        return this.localidads;
    }
    
    public void setLocalidads(Set localidads) {
        this.localidads = localidads;
    }




}


