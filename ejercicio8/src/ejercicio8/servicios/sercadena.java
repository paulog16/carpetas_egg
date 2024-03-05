/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.servicios;

import ejercicio8.Cadena;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class sercadena {
    Cadena c1= new Cadena();
    Scanner leer = new Scanner(System.in);
    public void ingresarcadena(){
        System.out.print("ingrese frase: ");
        c1.setFrase(leer.nextLine());
    }
    public void mostrarVocales(){
        char[]vocales= {'a','e','i','o','u'};
        String voc="";
        int nvoc=0;
             for (int i = 0; i < c1.getFrase().length(); i++) {
                 for (int j = 0; j < vocales.length; j++) {
                     if(c1.getFrase().charAt(i)==vocales[j]){
                       nvoc++;
                   voc+=c1.getFrase().charAt(i);  
                     }
                   
                 }
        }
             System.out.println("vocales: "+nvoc+" "+voc);
    }
    public void invertirfrase(){
         char[]invertir= c1.getFrase().toCharArray();
         int cont;
         for (cont=c1.getFrase().length()-1; cont >= 0; cont--) {
             System.out.println(""+invertir[cont]);
        }
    }
    public void letraRepetida(){
        String letra="";
        System.out.print("ingrese letra: ");
        letra= leer.nextLine();
        int nletras=0;
        for (int i = 0; i < letra.length(); i++) {
            if(Character.isLetter(letra.charAt(i))){
                nletras++;
                
            }
        }
        System.out.println("la letra: "+letra+" se repite "+nletras+" ves");
    }
    public void comparar(){
        
        System.out.println("ingrese nueva frase");
        c1.setFrase2(leer.nextLine());
        if(c1.getFrase().length()>c1.getFrase2().length()){
            System.out.println("la frase original es mas larga");
        }else if(c1.getFrase().length()<c1.getFrase2().length()){
            System.out.println("la frase 2 es mas larga");
        }else{
            System.out.println("las frases son iguales");
        }
    }
    public void unirfrase(){
        System.out.println(""+c1.getFrase()+c1.getFrase2());
    }
    public void reemplazar(){
        System.out.println(""+c1.getFrase().replace("a","e" ));
    }
    public void contieneLetra(){
   String letra;

        System.out.println("ingrese letra");
        letra= leer.nextLine();
        for (int i = 0; i <c1.getFrase().length(); i++) {
            if(letra.equals(letra)){
               
                System.out.println("verdadero");
            }else{
               
                System.out.println("falso");
            }
        }
    }
}
//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos:
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.