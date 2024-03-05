/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.servicios;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serarray {
    Scanner leer = new Scanner(System.in);
    public void crearArray(){
        double[]arrayA= new double[50];
        double[]arrayB= new double[20];
        for (int i = 0; i < 50; i++) {
            arrayA[i]=Math.round((double)Math.random()*30);
            System.out.print(" | "+arrayA[i]);
        }
        System.out.println("ordenar de mayor a menor");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA.length-1; j++) {
                if(arrayA[j]>arrayA[j-1]){
                    double aux;
                    aux= arrayA[j];
                    arrayA[j]=arrayA[j+1];
                    arrayA[j+1]=aux;
                }
            }
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(" | "+arrayA[i]);
        }
    }
  
}
//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.