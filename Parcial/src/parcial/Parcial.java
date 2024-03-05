/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> adn = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        IsMutant funciones = new IsMutant(); // Suponiendo que tienes una clase con las funciones requeridas
        
        while (true) {
            System.out.println("MENU");
            System.out.println("QUE DESEA HACER?");
            System.out.println("1-INGRESAR LETRAS DE LOS GENES Y VERIFICAR SI ES MUTANTE");
            System.out.println("2-SALIR");

            String option = scanner.nextLine();

            if (option.equals("2")) {
                break;
            } else if (option.equals("1")) {
                llenarMatriz(adn);
                System.out.println(adn);
                boolean mutante = funciones.isMutant(adn);
                if (mutante) {
                    System.out.println("es mutante");
                } else {
                    System.out.println("no es mutante");
                }
            } else {
                System.out.println("opcion incorrecta");
            }
        }
        
        
        
    }

    public static void llenarMatriz(List<String> adn) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            boolean sequenceValid = true;

            while (true) {
                System.out.println("Ingrese secuencia de letras: ");
                String sequence = scanner.nextLine();

                if (sequence.length() == 6) {
                    for (int j = 0; j < sequence.length(); j++) {
                        char letter = sequence.charAt(j);
                        if ("ATGC".indexOf(Character.toUpperCase(letter)) == -1) {
                            sequenceValid = false;
                            System.out.println("Secuencia no válida");
                            break;
                        }
                    }

                    if (sequenceValid) {
                        adn.add(sequence.toUpperCase());
                        break;
                    }
                } else {
                    System.out.println("Longitud de secuencia incorrecta. Debe ser de longitud 6.");
                }
            }
        }
    }
}
