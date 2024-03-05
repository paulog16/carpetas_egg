/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio82.servicios;

import ejercicio82.cadena;

import java.util.Scanner;



/**
 *
 * @author pguid
 */
public class cadenaservicios {
   Scanner leer= new Scanner(System.in);
   cadena c1= new cadena();
   public void mostrarVocales(){
       char[] vocales= {'a','e','i','o','u'};
       String voc= "";
       int n_voc=0;
       System.out.println("ingrese una frase");
    c1.setFrase(leer.next());
       for (int i = 0; i <c1.getFrase().length(); i++) {
           for (int j = 0; j <vocales.length; j++) {
               if(c1.getFrase().charAt(i)==vocales[j]){
                   n_voc++;
                   voc+=c1.getFrase().charAt(i);
                
               
           }
       }
           
       }
       System.out.println("Vocales: "+n_voc +"  "+voc );
}
   public void invertirCadena(){
    char[]invertir= c1.getFrase().toCharArray();
    int cont;
       for (cont=c1.getFrase().length()-1; cont >= 0; cont--) {
           System.out.print(""+invertir[cont]);
           
       }
       System.out.println("");
}
  public void repetido(){
      
  }
    
}
