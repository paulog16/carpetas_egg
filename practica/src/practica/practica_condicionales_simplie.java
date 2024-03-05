/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author pguid
 */
public class practica_condicionales_simplie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //le damos valor a las variables
        int num1 = 10;
        int num2 = 10;
        //si el numero 1 es mas grande que el 2
        if (num1 > num2) {
            //hacer
            System.out.println(num1 + " es mas grande que num1");
        //sino
        } else {
            if(num1==num2){
                System.out.println("los numeros son iguales");
            }else{
                 //hacer
                 System.out.println(num2 + " es mas grande que num1");
            }
           
           
        }

    }

}
