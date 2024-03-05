/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo.servicios;

import ejercicio1poo.Perro;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author pguid
 */
public class RazaServicios {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro>listaPerro = new ArrayList();

    public void ingresoRaza() {
        String opc;
        do {
            Perro objeto = new Perro();
            System.out.println("Ingrese la raza del perro");
            objeto.setRaza(leer.next());
          listaPerro.add(objeto);
            System.out.println("Presione S para continuar ingresando otro valor");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        //return new Perro();
    }

    public void mostrarRazas() {
        for (Perro var : listaPerro) {
            System.out.println(var);
        }
    }
  
}
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.