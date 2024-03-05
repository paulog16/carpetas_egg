/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;


import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
 int [][]matriz= new int [4][4];
      System.out.println("matriz aleatoria de 4x4");
       
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz [i][j]= (int)(Math.random()*20);
                
                
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j= 0;j < 4;j++) {
                System.out.print("|"+matriz[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.println("la transpuesta es :");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|"+matriz[j][i]+ "\t");
                
                
            }
            System.out.println("");
            
        }
        
    }
    
}
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
//obtiene cambiando sus filas por columnas (o viceversa).