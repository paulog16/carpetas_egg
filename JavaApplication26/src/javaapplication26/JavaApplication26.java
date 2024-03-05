/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado = new Scanner(System.in);
       
        System.out.print("Por favor ingrese el tamaño del cuadrado: ");
        int n = teclado.nextInt();
       
       

            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
    }
    
}
