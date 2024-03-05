/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasojava;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class RepasoJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero 1");
        int num=leer.nextInt();
        System.out.println("ingrese numero 2");
        int num2=leer.nextInt();
        int suma=num+num2;
        System.out.println("el resultado es "+suma);
        
    }
}
