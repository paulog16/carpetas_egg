/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
Persona p1= new Persona();
   
        System.out.println("ingrese fecha de nacimiento");
        System.out.print("ingrese año: ");
        p1.setAño(leer.nextInt());
        System.out.print("ingrese mes: ");
        p1.setMes(leer.nextInt());
        System.out.print("ingrese dia: ");
        p1.setDia(leer.nextInt());
        Date fecha1= new Date((p1.getAño()-1900),(p1.getMes()-1),p1.getDia());
        System.out.println(fecha1.toString());
        
  
    }
    
}
