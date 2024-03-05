/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1,num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void crearOperacion(){
        System.out.println("ingrese los 2 numeros");
        this.num1=leer.nextInt();
        this.num2=leer.nextInt();
    }
    public void sumar(){
        int suma;
        suma=num1+num2;
        System.out.println("la suma es: "+suma);
    }
      public void restar(){
        int resta;
        resta=num1-num2;
        System.out.println("la resta es: "+resta);
    }
        public void multiplicar(){
        int multiplicacion;
        multiplicacion=num1*num2;
        System.out.println("la multiplicacion es: "+multiplicacion);
    }
          public void dividir(){
        int division;
        division=num1/num2;
        System.out.println("la division es: "+division);
    }
    
}
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
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