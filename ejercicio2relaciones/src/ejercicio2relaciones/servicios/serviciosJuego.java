/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones.servicios;

import ejercicio2relaciones.Juego;
import ejercicio2relaciones.Jugador;

import ejercicio2relaciones.Revolver;
import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class serviciosJuego {
    Juego game= new Juego();
    public void llenarJuego(ArrayList<Jugador>jugadores,Revolver r){
       game.setJugadores(jugadores);
        game.setRevolver(r);
 
    }
    public  Jugador ronda(ArrayList<Jugador>jugadores,serviciosRevolver r, serviciosJugador j1){
        serviciosJugador jugadoraMojar=new serviciosJugador();
        Jugador jugadorMojado= new Jugador();
   
        System.out.println("arranca la ronda");
        
        
        for (Jugador jugador : jugadores) {
            System.out.println("el estado de la pistola es: ");
            r.mostrar();
            System.out.println("el jugador que se esta por disparar se llama: "+jugador.getNombre());
            jugadoraMojar.disparo(r, jugador);
 if(!jugador.isMojado()){
     System.out.println("el jugador: "+jugador.getNombre()+ " se salvo, ya que su estado es: "+jugador.isMojado());
     r.siguienteChorro();
 }else{
     jugadorMojado=jugador;
            System.out.println("ell jugador mojado es: "+jugador.getNombre());
        break;
        }
        System.out.println("");
    
    }
        System.out.println("---------------");
        System.out.println("juego terminado");
      return jugadorMojado;
    }
}
