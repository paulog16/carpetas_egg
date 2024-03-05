/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio4exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
            System.out.println("ingrese un numero");
            int numero=leer.nextInt();
            
              System.out.println("ingrese cadena");
            String cadena=leer.next();
            int num;
            num=Integer.parseInt(cadena);
              System.out.println("ingrese dos numeros");
            int num1=leer.nextInt();
            int num2=leer.nextInt();
            double resultado=num1/num2;
            
            
        }catch(InputMismatchException IME){
            System.out.println("error");
            System.out.println(IME.getMessage());
            System.out.println(Arrays.toString(IME.getStackTrace()));
        }
       
          
        catch( NumberFormatException IME){
            System.out.println("error");
            System.out.println(IME.getMessage());
            System.out.println(Arrays.toString(IME.getStackTrace()));
        }
     
          
        catch( ArithmeticException AE){
            System.out.println("error");
            System.out.println(AE.getMessage());
            System.out.println(Arrays.toString(AE.getStackTrace()));
        }
      
    }
    
}
//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones