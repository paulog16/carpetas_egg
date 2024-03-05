/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.servicios;

import ejercicio9.Matematica;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servimate {
    Scanner leer = new Scanner(System.in);
    Matematica m1= new Matematica();

    public void crearNumeros(){
        System.out.println("INGRESO DE NUMEROS ALEATORIOS");
        System.out.println(" num 1: ");
        m1.setNum1(Math.round(Math.random()*10));
        
         System.out.println(""+m1.getNum1());
        System.out.println(" num 2: ");
        m1.setNum2(Math.round(Math.random()*10));
          System.out.println(""+m1.getNum2());
          System.out.println("------------------");
    }
    public void devolverMayor(){
        System.out.println("DEVOLVER MAYOR");
        if(m1.getNum1()>m1.getNum2()){
            System.out.println("el numero 1 es mayor");
        }else if( m1.getNum1()<m1.getNum2()){
            System.out.println("el numero 2 es mayor");
        }else{
            System.out.println("son iguales");
        }
        System.out.println("----------------");
    }
    public void calcularPotencia(){
        System.out.println("CALUCULAR POTENCIA");
          if(m1.getNum1()>m1.getNum2()){
            System.out.println("el numero 1 es mayor");
              System.out.println("resultado "+ Math.pow(m1.getNum1(), m1.getNum2()));
        }else if( m1.getNum1()<m1.getNum2()){
            System.out.println("el numero 2 es mayor");
              System.out.println("resultado "+ Math.pow(m1.getNum2(), m1.getNum1()));
        }
          System.out.println("--------------------");
    }
    public void calcularRaiz(){
        System.out.println("CALCULAR RAIZ");
          if(m1.getNum1()<m1.getNum2()){
            System.out.println("el numero 1 es menor");
              System.out.println("resultado "+ Math.sqrt(m1.getNum1()));
        }else if( m1.getNum1()>m1.getNum2()){
            System.out.println("el numero 2 es menor");
              System.out.println("resultado "+ Math.sqrt(m1.getNum2()));
        }
    }
}
//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
//
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.