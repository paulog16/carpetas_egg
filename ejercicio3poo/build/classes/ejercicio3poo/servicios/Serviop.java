/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo.servicios;

import ejercicio3poo.Operacion;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Serviop {
    Scanner leer = new Scanner(System.in);
    Operacion o1= new Operacion();
    public void crearOperacion(){
        System.out.println("ingrese los numeros");
        o1.setNum1(leer.nextDouble());
        o1.setNum2(leer.nextDuble());
    }
    public void sumarRestar(){
    double suma= o1.getNum1()+o1.getNum2();
    double resta= o1.getNum1()-o1.getNum2();
        System.out.println("la suma de los numeros es: "+suma);
        System.out.println("la resta de los numeros es: "+resta);
    }
    public void multiplicar(){
       double multiplicar= o1.getNum1()*o1.getNum2();
        if(multiplicar==0){
            System.out.println("error, el resultado da 0");
        }else{
            System.out.println("el resultado es : "+multiplicar);
        }
    }
    public void division(){
        double division= o1.getNum1()/o1.getNum2();
        if(o1.getNum1()==0 || o1.getNum2()==0){
            System.out.println("error, el resultado da cero");
        }else{
            System.out.println("el resultado da: "+division);
        }
    }
    
}
//3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.