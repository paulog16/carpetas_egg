/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio7;

import pooejercicio7.entidades.Persona;

/**
 *
 * @author pguid
 */
public class POOEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double imc = 0;
        int contDebajo = 0;
        int contIdeal = 0;
        int contSobre = 0;
        Persona p1 = new Persona();
        for (int i = 0; i < 4; i++) {

            p1.crearPersona();
            imc = p1.calcularIMC();
            p1.esMayor();
        }
        for (int i = 0; i < 10; i++) {
            if (imc == -1) {
                contDebajo++;
            }
            if (imc == 0) {
                contIdeal++;
            }
            if (imc == 1) {
                contSobre++;

            }
            System.out.println("personas debajo edl peso: " + contDebajo);
//       double imc;
//        boolean edad;
//        System.out.println("Persona 1");
//        Persona p1 = new Persona();
//        p1.crearPersona();
//        imc = p1.calcularIMC();
//        edad = p1.esMayor();
//
//        System.out.println("Persona 2");
//        Persona p2 = new Persona();
//        p2.crearPersona();
//        imc = p2.calcularIMC();
//        p2.esMayor();
//        edad = p2.esMayor();
//
//        System.out.println("Persona 3");
//        Persona p3 = new Persona();
//        p3.crearPersona();
//        imc = p3.calcularIMC();
//        edad = p3.esMayor();
//
//        System.out.println("Persona 4");
//        Persona p4 = new Persona();
//        p4.crearPersona();
//        imc = p4.calcularIMC();
//        edad = p4.esMayor();
//        int contDebajo = 0;
//        int contIdeal=0;
//        int contSobre=0; 

            System.out.println("personas por debajo de su peso: " + contDebajo);
        }

    }
