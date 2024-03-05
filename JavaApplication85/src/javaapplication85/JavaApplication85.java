/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("ingrese una cant en grados C°");
        double c = leer.nextDouble();

        double r = c * 4 / 5;
        double k = c + 273.15;
        
        System.out.println("grados r°: "+r);
        System.out.println("grados k°: "+k);
    }

}
