/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class practicacondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IMPORTAMOS EL SCANNER: PARA INGRESAR DATOS
        Scanner leer= new Scanner(System.in);
        //declaramos variables
        int num;
        //PEDIMOS QUE SE INGRESE EL NUMERO
        System.out.println("ingrese el numero");
        //ingresamos el nunmero
        num=leer.nextInt();
        //hacemos la condicion
        //si
        if(num%2==0){
            //hacer
            System.out.println("el numero es par");
        //sino
        }else{
            //hacer
            System.out.println("el numero no es par");
        }
    }
    
}
// Programa Java que lea un número entero por teclado y calcule si es par o impar.