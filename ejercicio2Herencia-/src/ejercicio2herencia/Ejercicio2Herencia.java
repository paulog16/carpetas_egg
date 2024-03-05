/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2herencia;

import ejercicio2herencia.entidades.Electrodomestico;
import ejercicio2herencia.entidades.Lavadora;
import ejercicio2herencia.entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Lavadora l1= new Lavadora();
        Televisor t1= new Televisor();
            Electrodomestico e1= new Electrodomestico();
//            e1.crearElectrodomestico();
//            e1.precioFinal();
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
      
           do{
                    System.out.println("MENU");
           System.out.println("QUE DESEA HACER?");
           System.out.println("1-CARGAR Y MOSTRAR DATOS DE LAVADORA");
           System.out.println("2-CARGAR Y MOSTRAR DATOS DE TELEVISOR");
           System.out.println("3-SALIR");
            op=leer.nextInt();
           switch(op){
               case 1:
                       l1.crearLavadora();
                       l1.precioFinal();
                       break;
               case 2:
                   t1.crearTelevisor();
                   t1.precioFinal();
                   break;
               case 3:
                    System.out.println("saliendo del programa;");
                   break;
 
    }
           }while(op!=3);
    
    }
}
