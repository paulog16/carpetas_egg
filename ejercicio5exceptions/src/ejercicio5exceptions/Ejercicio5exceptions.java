/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio5exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num=(int)(Math.random()*10+1);
        try {
                  int numBuscar;
        int cont=0;
            do{
                     System.out.println("ingrese numero a buscar");
  numBuscar=leer.nextInt();
  if(numBuscar<num){
      System.out.println("el numero es menor al numero");
  }else if(numBuscar>num){
      System.out.println("el numero es mayor al numero");
  }
  cont++;
            }while(numBuscar!=num);
            System.out.println("adivinaste");
            System.out.println("el numero de intentos es: "+cont);
        
        } catch (InputMismatchException IME) {
            System.out.println("error");
            System.out.println(IME.getMessage());
            System.out.println(Arrays.toString(IME.getStackTrace()));
        }
       
    }
    
}
//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.