/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico7v2;

/**
 *
 * @author Guido Caballero
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia() {
        this.idMateria=0;
        this.nombre = "";
        this.anio = 0;
    }

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    } 
    
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getIdMateria() {
        return idMateria;
    }
    public int getAnio() {
        return anio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idMateria;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return nombre;
    }
    
}
