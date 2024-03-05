/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3exeptions;

import ejercicio3exeptions.entidad.numeros;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio3exeptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        numeros nums= new numeros();
        System.out.println("ingrese num1");
        nums.setNum1(leer.next());
        System.out.println("ingrese num2");
        nums.setNum2(leer.next());
        
        int num1,num2;
        num1=parseInt(nums.getNum1());
        num2=parseInt(nums.getNum2());
        
        try{
         int resultado=num1/num2; 
            System.out.println("el resultafo es: "+resultado);
        }catch(ArithmeticException AE){
            System.out.println("el error es de aritmetica");
            System.out.println(AE.getMessage());
            System.out.println(Arrays.toString(AE.getStackTrace()));
    }
    }
    
}
//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.