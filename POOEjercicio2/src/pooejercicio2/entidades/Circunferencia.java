/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejercicio2.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1, num2;

    public Circunferencia() {
    }

    public Circunferencia(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void ingresarNumero() {
        System.out.println("ingrese num1");
        this.num1 = leer.nextInt();
        System.out.println("ingrese num2");
        this.num2 = leer.nextInt();
    }

    public void sumar() {
        System.out.println("la suma es: " + num1 + num2);
    }

    public void restar() {
        System.out.println("la resta es: " + (num1 - num2));
    }

    public void multiplicar() {
        if (num2 == 0) {
            int resultado = 0;
            System.out.println(resultado);
            System.out.println("no se puede multiplicar por 0");
        } else {
            System.out.println("la multiplicacion es: " + (num1 * num2));
        }

    }

    public void dividir() {
        if (num2 == 0) {
            int resultado = 0;
            System.out.println(resultado);
            System.out.println("no se puede dividir por 0");
        } else {
            System.out.println("la division es: " + (num1 / num2));
        }

    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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

}
