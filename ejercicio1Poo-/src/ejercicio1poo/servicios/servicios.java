/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo.servicios;

import ejercicio1poo.clases.Libro;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro l1= new Libro();
    public void cargarUsuario(){
        System.out.println("ingrese nombre ");
        String nombre=leer.next();
        System.out.println("ingrese apellido");
        String apellido=leer.next();
       
    }

}
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.