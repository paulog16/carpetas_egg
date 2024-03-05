/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegrador;

import ejerciciointegrador.Servicios.Accion;
import ejerciciointegrador.Servicios.crearArmadura;
import ejerciciointegrador.entidades.Armadura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Accion action= new Accion();
        crearArmadura cA= new crearArmadura();
      Armadura a= new Armadura();
   
        System.out.println("-------JARVIS--------");
        int op2;
        int opc;
        do{
            System.out.println("1-crear Armadura");
            System.out.println("2-acciones");
            System.out.println("3-mostrar estado");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                      a= cA.crearAr();
                      System.out.println("armadura creada correctamente tony");
                      break;
                case 2:
                    do{
                         System.out.println("1-caminar");
                    System.out.println("2-correr");
                    System.out.println("3-PROPULSARSE");
                    System.out.println("4-VOLAR");
                    System.out.println("5-ESCRIBIR");
                    System.out.println("6-DISPARAR");
                    System.out.println("7-SALIR");
                op2=leer.nextInt();
                switch(op2){
                    case 1:
                        action.caminar(a);
                        break;
                    case 2:
                        action.correr(a);
                        break;
                    case 3:
                        action.propulsarse(a);
                        break;
                    case 4:
                        action.volar(a);
                        break;
                    case 5:
                        action.escribir(a);
                        break;
                    case 6:
                        action.disparar(a);
                        break;
                    case 7:
                        System.out.println("volviendo al menu principal");
                        break;
                }
                    }while(op2!=7);
                   
                    
                    
                    
            }
        }while(opc!=2);
       
   
    }
    
}
