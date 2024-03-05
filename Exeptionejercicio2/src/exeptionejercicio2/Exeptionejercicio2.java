/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exeptionejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Exeptionejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
             int []vector= new int[5];
        for (int i = 0; i < 5; i++) {
            vector[i+1]=i+2;
        }
        
        }catch(ArrayIndexOutOfBoundsException AIOBE){
            System.out.println("esta fuera de rango");
            System.out.println(AIOBE.getMessage());
            System.out.println(Arrays.toString(AIOBE.getStackTrace()));
        }
       
    }
    
}
//2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).