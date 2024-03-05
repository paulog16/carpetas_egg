/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6collcetions;

import ejercicio6collcetions.servicios.serviciosApp;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio6collcetions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        serviciosApp serv= new serviciosApp();
        int res;
        serv.cargarApp();
               do{
        System.out.println("LISTA DE OPCIONES");
        System.out.println("1-MOSTRAR");
        System.out.println("2-ELIMINAR");
                   System.out.println("3-MODIFICAR PRECIO");
                   System.out.println("4-SALIR");
        res=leer.nextInt();
        switch(res){
            case 1:
                serv.mostrar();
                break;
            case 2:
                serv.eliminar1();
                break;
            case 3:
                serv.modificarPrecio();
                break;
            case 4:
                System.out.println("saliendo....");
                break;
            default:
                System.out.println("opcion no valida");
        }
               }while(res!=4);
               System.out.println("el programa finalizo");
    }
    
}
//      serv.cargarApp();
//        serv.mostrar();
//    serv.eliminar1();