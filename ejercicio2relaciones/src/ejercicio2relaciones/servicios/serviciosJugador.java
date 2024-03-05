/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones.servicios;

import ejercicio2relaciones.Jugador;


import java.util.ArrayList;

import java.util.Scanner;



/**
 *
 * @author pguid
 */
public class serviciosJugador {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
   ArrayList<Jugador> listaJugadores= new ArrayList();
    
  Jugador j1;
    public ArrayList cargarJugador(){
int id=0;
String res;
do{
    j1=new Jugador();
    id++;
    j1.setId(id);
    System.out.println("ingrese nombre");
    j1.setNombre(leer.next());
  j1.setNombrecompleto(j1.getId()+j1.getNombre());
    j1.setMojado(false);
    listaJugadores.add(j1);
    System.out.println("desea crear otro jugador's/n");
  res=leer.next();
  if(!res.equalsIgnoreCase("s")){
   break;
  }
}while(listaJugadores.size()<6);
        System.out.println("lista de jugadores:");
        mostrarRevolver();
        return listaJugadores;
    }
    
    public void disparo(serviciosRevolver r,Jugador j1){
        System.out.println("dentro del metodo disparo el jugador a dispararse se llama: "+j1.getNombre());
if(r.mojar()){
    j1.setMojado(true);
}
    }
  public void mostrarRevolver(){
      listaJugadores.forEach((aux) -> {
          System.out.println(aux);
        });
  }
}
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.