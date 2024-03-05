/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import ejercicio1.Datos;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosdatos {
    Scanner leer = new Scanner (System.in);
    Datos d1= new Datos();
    public void cargarLibro (){
        String Nombre,Apellido;
        int dni;
        System.out.println("ingrese su nombre,apellido y dni");
        System.out.print("Nombre: " );
        Nombre= leer.nextLine();
        System.out.print("Apellido: ");
        Apellido= leer.nextLine();
        System.out.print("Dni: ");
        dni= leer.nextInt();
    }
    public void informar(){
        System.out.println("---------------------");
        System.out.println(" informe de libro ");
        d1.setIsbn(3);
        System.out.println("El isbn es : "+d1.getIsbn());
        d1.setAutor("paulo");
        System.out.println("el autor es: "+d1.getAutor());
        d1.setTitulo("hola mundo");
        System.out.println("titulo: "+d1.getTitulo());
      d1.setNpaginas(120);
        System.out.println("numero de paginas: "+d1.getNpaginas());
}
}
