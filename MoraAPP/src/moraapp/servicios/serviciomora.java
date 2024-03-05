/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraapp.servicios;

import java.util.Scanner;
import moraapp.entidades.Mora;

/**
 *
 * @author pguid
 */
public class serviciomora {
    private Scanner leer= new Scanner(System.in);
    public Mora crearMora(){
        System.out.println("ingrese nombre");
        String nombre= leer.next();
        System.out.println("ingrese apodo");
        String apodo= leer.next();
        System.out.println("ingrese tipo");
        String tipo= leer.next();
        System.out.println("ingrese color");
        String color= leer.next();
        System.out.println("ingrese raza");
        String raza= leer.next();
        int edad= leer.nextInt();
        boolean cola= leer.nextBoolean();
                
      return new Mora(nombre, apodo, tipo, color, 0, true, raza);
       
    }
}
