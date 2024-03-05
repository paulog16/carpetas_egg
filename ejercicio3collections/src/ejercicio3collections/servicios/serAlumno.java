/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3collections.servicios;

import ejercicio3collections.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




/**
 *
 * @author pguid
 */
public class serAlumno {
    Scanner leer= new Scanner(System.in);
    ArrayList <Alumno> Alumnos=new ArrayList();
    
    //--------------------------------------------
    //crear alumno
    
  public Alumno crearAlumno(){
      Alumno alu;
      String opcion;
      double prom=0,suma=0;
      do{
         alu= new Alumno();
          System.out.print("ingrese nombre del alumno: ");
          alu.setNombre(leer.next());
          System.out.println("ingrese las 3 notas del alumno");
          for (int i = 0; i < 3; i++) {
              System.out.print("nota"+(i+1)+": ");
              int nota=leer.nextInt();
                      alu.getNotas().add(nota);
                    
          }
     
        
          Alumnos.add(alu);
          System.out.println("desea cargar otro alumno?s/n");
      opcion=leer.next();
      }while(opcion.equalsIgnoreCase("s"));
      
     
      return alu;
     
  }
  //------------------------------------
   //mostrar alumno
  
 public void mostrar(){
 Alumnos.forEach((aux)->{
     System.out.println(aux.toString());
 });
 }
  public void buscar(){
      String aux1;
      Alumno alumnoEncontrado;
      boolean encontrado=false;
      System.out.println("ingrese alumno a promediar");
      aux1=leer.next();
      for (Alumno Alumno : Alumnos) {
          if(Alumno.getNombre().equals(aux1)){
              System.out.println("alumno: "+aux1+" encontrado");
              encontrado=true;
              alumnoEncontrado=Alumno;
              prom(alumnoEncontrado);
          }
      }
      if(encontrado==false){
          System.out.println("alumno no encontrado");
      }
  }
  public double prom(Alumno notas){
      double prom=0,suma=0;
      for (Integer calificacion : notas.getNotas()) {
          suma=suma+calificacion;
      }
      prom=suma/3;
      System.out.println("la nota final del alumno es: "+prom);
     return prom;
  }

  }
  //----------------------------------
  //buscar y nota final
  
//  public void buscar(){
//      String alumnoBuscado;
//      Alumno alumnoEncontrado;
//      
//      boolean encontrado=false;
//      System.out.println("ingrese el alumno a promediar: ");
//      alumnoBuscado=leer.next();
//      for (Alumno Alumno : Alumnos) {
//          if(Alumno.getNombre().equals(alumnoBuscado)){
//              System.out.println("alumno: "+alumnoBuscado+" encontrado");
//              encontrado=true;
//              alumnoEncontrado=Alumno;
//              promedio(alumnoEncontrado);
//          }
//      }
//      if(encontrado==false){
//          System.out.println("el alumno no fue encontrado");
//      }
//  }
//  
//  //-------------------------------
//  //sacar promedio que despues va en el metodo buscar
//  
//  public double promedio(Alumno alumnoNota ){
//      double nota=0;
//      int suma=0;
//      System.out.println("calculando la nota final...");
//      for (Integer nota1 : alumnoNota.getNotas()) {
//          suma=nota1+suma;
//      }
//  
//      System.out.println("la nota final del alumno es: "+nota);
//  return nota;
//  }

      
  
  
//public double prom(Alumno alu){
//    float prom=0,suma=0;
//    for (int i = 0; i < 3; i++) {
//       alu.getNotas();
//       suma=suma+alu.getNotas().add(nota);
//        
//    }
//    return prom;
//}



//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
// 