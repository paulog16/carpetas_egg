/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12p.servicios;


import ejercicio12p.persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serperson {
    Scanner leer= new Scanner(System.in);
public persona crearPersona(){
    persona p1= new persona();
    System.out.print("ingrese nombre: ");
    p1.setNombre(leer.next());
    System.out.println("ingrese fecha de nacimiento");
    System.out.print("ingrese año: ");
    int anio= leer.nextInt()-1900;
    System.out.print("ingrese mes: ");
int mes= leer.nextInt()-1;
    System.out.print("ingrese dia: ");
    int dia= leer.nextInt();
    Date fecha= new Date(anio,mes,dia);
    p1.setFechaNacimiento(fecha);

    return p1;
}
public int calcularEdad(persona p1){
    Date fechaActual= new Date();
    int edad;
    int validadormes= p1.getFechaNacimiento().getMonth();
    if(validadormes<fechaActual.getMonth()){
        edad=(fechaActual.getYear())-(p1.getFechaNacimiento().getYear());
    }else{
           edad=(fechaActual.getYear())-(p1.getFechaNacimiento().getYear())-1;
    }
    System.out.println(edad);
    System.out.println("---------");
    return edad;
}
public void menorq(int edad){
    System.out.println("ingrese una nueva edad: ");
    int edad2= leer.nextInt();
    if(edad>edad2){
        System.out.println("verdadero");
    }else{
        System.out.println("falso");
    }
}
public void mostrar(persona p1){
    System.out.println("DATOS PERSONALES");
    System.out.println("nombre: "+p1.getNombre());
    System.out.println("fecha de nacimiento: "+p1.getFechaNacimiento());
}
}
//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
//métodos:
// Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.