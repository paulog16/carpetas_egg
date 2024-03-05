/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extra;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);

        String array[] = new String[12];

        
        int intentos = 0;
        boolean bandera = false;
        
        array[0] = "Enero";
        array[1] = "Febrero";
        array[2] = "Marzo";
        array[3] = "Abril";
        array[4] = "Mayo";
        array[5] = "Junio";
        array[6] = "Julio";
        array[7] = "Agosto";
        array[8] = "Septiembre";
        array[9] = "Octubre";
        array[10] = "Noviembre";
        array[11] = "Diciembre";

        int aleatorio = (int)(Math.random()*11+1);
        
        String mesSecreto = array[(aleatorio)];

        do {
            
            System.out.println("Intente acertar el mes secreto : ");
            String op = leer.nextLine();

           
                if (array[aleatorio].equals(op)) {
                    System.out.println("Acertaste Felicidades!");
                    bandera = true;
                } else {
                    System.out.println("Lamentablemente la respuesta es erronea!");
                }
            
            intentos++;
            
        } while (intentos < 3 && bandera == false);

    }

}
    
    


