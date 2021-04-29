/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballero.practico7v2;

/**
 *
 * @author Usuario
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia m1 = new Materia(1,"Ingles 1",1);
        Materia m2 = new Materia(2,"Matemáticas",1);
        Materia m3 = new Materia(3, "Laboratorio 1",1);
        Alumno a1 = new Alumno(1002,"Martín","López");
        Alumno a2 = new Alumno(1002,"Brenda","Martínez");
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        a1.agregarMateria(m1);
        
        System.out.println("Alumno: "+a1.getNombre()+", "+a1.getApellido() + " Inscripto en: "+a1.cantidadMaterias()+" materias");
        System.out.println("Alumno: "+a2.getNombre()+", "+a2.getApellido() + " Inscripto en: "+a2.cantidadMaterias()+" materias");
    }   
}
        