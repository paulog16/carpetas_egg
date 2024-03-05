/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejercicio7.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private String Sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String Sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.println("ingrese nombre");
        this.nombre = leer.next();
        System.out.println("ingrese edad");
        this.edad = leer.nextInt();
        System.out.println("ingrese sexo: M,F,O");
        this.Sexo = leer.next();
        if (Sexo.equalsIgnoreCase("M") || Sexo.equalsIgnoreCase("F") || Sexo.equalsIgnoreCase("O")) {
            System.out.println("Sexo correcto");
        }else{
            System.out.println("sexo incorrecto");
        }
        System.out.println("ingrese peso");
        this.peso = leer.nextDouble();
        System.out.println("ingrese altura");
        this.altura = leer.nextDouble();
    }

    public double calcularIMC() {
        double imc;
        if ((peso / (altura * altura)) < 20) {
            imc = -1;
            System.out.println("esta debajo de su peso ideal");
        } else if ((peso / (altura * altura)) >= 20 && ((peso / (altura * altura)) <= 25)) {
            imc = 0;
            System.out.println("esta en su peso ideal");
        } else {
            imc = 1;
            System.out.println("esta por arriba de su peso ideal");
        }
        return imc;
    }

    public boolean esMayor() {
        boolean mayor;
        if (edad > 18) {
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
