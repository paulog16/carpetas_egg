/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_;

/**
 *
 * @author pguid
 */
public class POO_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno_ alu1= new Alumno_();
        Alumno_ alu2= new Alumno_(5,"Paulo", "Guidolin");
        System.out.println("la id del alumno 2 es "+alu2.getId());
    alu1.setId(6);
    alu1.setApellido("guidolin");
    alu1.setNombre("paulo");
        System.out.println("el nombre del alu1 es : "+alu1.getNombre() );
    }
    
}
