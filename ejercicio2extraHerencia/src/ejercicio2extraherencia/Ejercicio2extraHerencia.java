/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2extraherencia;


import ejercicio2extraherencia.entidades.Edificio;
import ejercicio2extraherencia.entidades.EdificioDeOficinas;
import ejercicio2extraherencia.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio2extraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Edificio> listaEdificios = new ArrayList();
        
     
        int op;

        do {
           Polideportivo p1 = new Polideportivo();
           EdificioDeOficinas e1 = new EdificioDeOficinas();
            System.out.println("menu");
            System.out.println("1-cargarPolideportivo");
            System.out.println("2-cargarOficinas");
            System.out.println("3-Mostrar");
            System.out.println("4-salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    p1.crearPolideportivo();
                    listaEdificios.add(p1);

                    break;
                case 2:
                    e1.crearOficina();
                    listaEdificios.add(e1);
                    break;
                case 3:
                    calcularTodo(listaEdificios);
                    break;
                case 4:
                    System.out.println("saliendo");
                    break;

            }
        } while (op != 4);

    }

    public static void calcularTodo(ArrayList<Edificio> listaEdificios) {
        int contTechados = 0;
        int contDestechados = 0;
        for (Edificio aux : listaEdificios) {

            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas var = (EdificioDeOficinas) aux;
                var.calcularSuperficie();
                var.calcularVolumen();
                var.cantPersonas();
                continue;

            }
            if (aux instanceof Polideportivo) {

                Polideportivo nose = (Polideportivo) aux;
                nose.calcularSuperficie();
                nose.calcularVolumen();
                if (nose.isTechado()) {
                    contTechados++;
                } else {
                    contDestechados++;
                }
                System.out.println("la cantida de polideportivos techados es: " + contTechados);
                System.out.println("la cantida de polideportivos destechados es: " + contDestechados);

                continue;
            }

        }
    }

}
