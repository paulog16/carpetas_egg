/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_practico_12labcomputacion;

import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class Trabajo_practico_12labComputacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cadena = "Paulo123";

        if (!cadena.matches(".*\\d$")) {
            System.out.println("La cadena no termina con un dígito.");
        } else {
            System.out.println("La cadena termina con un dígito.");
        }

        if (!cadena.matches("^\\D.*")) {
            System.out.println("La cadena no empieza con un dígito.");
        } else {
            System.out.println("La cadena empieza con un dígito.");
        }

        if (cadena.matches("^[A-Za-z]{5,10}$")) {
            System.out.println("La cadena cumple con el patrón de 5 a 10 letras mayúsculas o minúsculas.");
        } else {
            System.out.println("La cadena no cumple con el patrón de 5 a 10 letras mayúsculas o minúsculas.");
        }

        String dni = "44-841-460";

       
        if (dni.matches("^\\d{2}-\\d{3}-\\d{3}$")) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido. Debe seguir el formato xx-xxx-xxx.");
        }
        
        
         ArrayList<String> correosParaValidar = new ArrayList();
        correosParaValidar.add("paulo@gmail.com");
        correosParaValidar.add("sebas2@example."); 
        correosParaValidar.add("colobarco3@email.com");
        correosParaValidar.add("messi4@.comm");
        correosParaValidar.add("ronaldo5@hotmail.com");

        
        ArrayList<String> correosValidos = new ArrayList();

        // Expresión regular para validar un correo electrónico 
        String Email = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

        
        for (String correo : correosParaValidar) {
            if (correo.matches(Email)) {
                correosValidos.add(correo);
            }
        }

       
        System.out.println("Correos válidos:");
        for (String correoValido : correosValidos) {
            System.out.println(correoValido);
        }
    }

}
