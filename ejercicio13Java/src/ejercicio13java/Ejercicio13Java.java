/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13java;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio13Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese fecha de su cumpleaños");
        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt();
        System.out.println("ingrese año");
        int year = leer.nextInt();

        int suma = dia + year + mes;

        String sumaString = Integer.toString(suma);
        int numSuerte = 0;
        for (int i = 0; i < sumaString.length(); i++) {
            char digit = sumaString.charAt(i);
            int digitInt = Character.getNumericValue(digit);
            numSuerte += digitInt;
        }
        
        System.out.println("el numero de la suerte es: "+numSuerte);

    }

}
