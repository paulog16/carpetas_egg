/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo.servicios;

import ejercicio8poo.Cadena;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Cadenaserv {

    Scanner leer = new Scanner(System.in);
    Cadena c1 = new Cadena();

    public void crearCadena() {
        System.out.println("CREAR FRASE");
        System.out.println("------------");
        System.out.println("ingrese frase");
        String frase = leer.next().toLowerCase();
        c1.setFrase(frase);
    }

    public void mostrarVocales() {
        System.out.println("MOSTRAR VOCALES");
        System.out.println("------------------");
        int vocal, otro, consonante;
        vocal = 0;

        String frase;
        frase = c1.getFrase();
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                vocal++;
            }

        }
        System.out.println("la frase tiene " + vocal + " vocales");

    }
public void invertirFrase(){
    System.out.println("INVERTIR FRASE");
    System.out.println("-------------");
   String frase;
   frase= c1.getFrase();
   char []invertir=frase.toCharArray();
   
    for (int i = frase.length()-1; i >= 0; i--) {
        System.out.print(""+invertir[i]);
        
    }
    System.out.println("");
}
public void vecesRepetido(){
    System.out.println("LETRA REPETIDA");
    System.out.println("--------------");
    String letra="a";
    int letra1=0;
    String frase= c1.getFrase();
    for (int i = 0; i <frase.length(); i++) {
        if(frase.charAt(i)=='a'){
            letra1++;
        }
            
        
    }
       System.out.println("el caracter a se repite "+letra1+" veces");     
}
public void compararLongitud(){
    System.out.println("COMPARAR LONGITUD");
    System.out.println("-----------------");
    String frase2;
    System.out.println("ingrese otra frase");
    frase2= leer.next();
    if(c1.getFrase().length()>frase2.length()){
        System.out.println("la frase 1 es mas larga");
    }else if(c1.getFrase().length()<frase2.length()){
        System.out.println("la frase 2 es mas larga");
    }else{
        System.out.println("las frases son inguales");
    }
}
public void unirFrases(){
    System.out.println("UNIR FRASES");
    System.out.println("----------");
    System.out.println("frase");
    String frase2= leer.next();
    String fraseunida= c1.getFrase()+frase2;
    System.out.println(""+fraseunida);
    
}
public void Reemplazar(){
    System.out.println("REEMPLAZAR CARACTERES");
    System.out.println("---------------------");
    String frase= c1.getFrase();
    System.out.println(""+frase.replace('a','o'));
}
public void contiene(){
    System.out.println("DECIR SI CONTIENE UNA LETRA");
    System.out.println("-----------------------");
    boolean resp;
    String frase=c1.getFrase();
  
    for (int i = 0; i <c1.getFrase().length(); i++) {
        if(frase.charAt(i)=='a'){
            resp=true;
            System.out.println(""+resp);
        }else{
            resp=false;
            System.out.println(""+resp);
        }
    }
}
}
