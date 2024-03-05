//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package liibroejercicio1poo;

import java.util.Scanner;


public class LIibroejercicio1poo {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       
        System.out.println("ingrese los datos del usuario para cargar el libro");
     Usuario u1= new Usuario(leer.next(),leer.next(),leer.nextInt());
          System.out.println("informe del libro");
          Libro L1= new Libro(23243241,"holamundo","josepepe",252);

       System.out.println(L1.toString());
    }
    
}
