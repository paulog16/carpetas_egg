/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

/**
 *
 * @author pguid
 */
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=1;
        for (int i = 2; i < 128; i+=2) {
            cont++;
            System.out.println("i = "+i);
        }
        System.out.println(cont);
    }
    
}
