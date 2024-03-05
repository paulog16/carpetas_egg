/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1collectionsextra.servicios;

import ejercicio1collectionsextra.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviNums {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Numeros>numeros= new ArrayList();
   Numeros n1;
   public void cargarNums(){
     int num;
        do {
            n1=new Numeros();
            System.out.print("Introduce un número entero (-99 para terminar): ");
            n1.setNumeros(leer.nextInt());
            if (n1.getNumeros() != -99) {
                numeros.add(n1);
            }
        } while (n1.getNumeros() != -99);

        int sum = 0;
        for (int i = 0; i < numeros.size(); i++) {
           sum=sum+numeros.get(i).getNumeros();
        }

        int n = numeros.size();
        double media = (double) sum / n;

        System.out.println("Se han leído " + n + " valores.");
        System.out.println("La suma de los valores es: " + sum);
        System.out.println("La media de los valores es: " + media);
   }
  
}
//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).