/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2herencia;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
     
        // TODO code application logic here
           Lavadora l1;
        Televisor t1= new Televisor();
            Electrodomestico e1= new Electrodomestico();
//            e1.crearElectrodomestico();
//            e1.precioFinal();
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        int sumaT=0;
        int sumatotal=0;
        int sumaL=0;
           do{
               l1=new Lavadora();
                    System.out.println("MENU");
           System.out.println("QUE DESEA HACER?");
           System.out.println("1-CARGAR Y MOSTRAR DATOS DE LAVADORA");
           System.out.println("2-CARGAR Y MOSTRAR DATOS DE TELEVISOR");
           System.out.println("3-MOSTRAR ELEMENTOS");
               System.out.println("4-SALIR");
            op=leer.nextInt();
             String opc;
           switch(op){
               case 1:
                   l1.crearLavadora();
                      listaElectrodomesticos.add(l1);
                       sumaL+=l1.precioFinal();
                     
                       break;
               case 2:                  
                      t1.crearTelevisor();                  
                       sumaT+=t1.precioFinal();
                        listaElectrodomesticos.add(e1);
               
                   break;
               case 3:
                   for (Electrodomestico aux : listaElectrodomesticos) {
                       System.out.println(aux);
                   }
                  break;
               case 4:
                   sumatotal=sumaT+sumaL;
                   System.out.println("la suma total de los electrodomesticos es de: "+sumatotal);
                    System.out.println("saliendo del programa");
                   break;
 
    }
           }while(op!=4);
    
    }
    
}
