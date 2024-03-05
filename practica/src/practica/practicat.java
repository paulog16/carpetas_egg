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
public class practicat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
          Scanner leer= new Scanner(System.in);
          int num;
          String puesto;
          double porcrepositor;
          double porcsuper;
          System.out.println("ingrese una categoria");
          num=leer.nextInt();
          switch(num){
              case 1: System.out.println("usted es repositor");
              porcrepositor=(15890*0.10);
                  System.out.println("el total a cobrar es: "+(15890+porcrepositor));
                  break;
              case 2: System.out.println("usted es cajero");
                  System.out.println("el total a cobrar es de 25600");
                  break;
              case 3: System.out.println("usted es supervisor");
              porcsuper= (35500*0.11);
                  System.out.println("el total a cobrar es de: "+(35000+porcsuper));
                  break;
              default: System.out.println("elija una opcion valida");
              break;
          }
          
          
    }
    
}
