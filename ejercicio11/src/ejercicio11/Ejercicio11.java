/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese una fecha pasada");
        System.out.print("ingrese año: ");
        int anio= leer.nextInt();
        System.out.print("ingrese mes: ");
        int mes= leer.nextInt();
        System.out.print("ingrese dia: ");
        int dia= leer.nextInt();
        Date fecha1= new Date((anio-1900),(mes-1),dia);
        System.out.println(fecha1.toString());
        System.out.println("fecha actual");
        Date fecha2= new Date();
        System.out.println(fecha2.toString());
        System.out.println("cuantos años hay de diferencia");
        if(fecha1.getMonth()>fecha2.getMonth()){
            System.out.println(fecha2.getYear()-fecha1.getYear()-1);
        }else{
               System.out.println(fecha2.getYear()-fecha1.getYear());
        }
    }
    
}
//11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();