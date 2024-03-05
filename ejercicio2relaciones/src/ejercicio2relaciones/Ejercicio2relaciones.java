/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

import ejercicio2relaciones.servicios.serviciosJuego;
import ejercicio2relaciones.servicios.serviciosJugador;
import ejercicio2relaciones.servicios.serviciosRevolver;
import java.util.ArrayList;


/**
 *
 * @author pguid
 */
public class Ejercicio2relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosJugador sj= new serviciosJugador();
          ArrayList<Jugador> jugadores= sj.cargarJugador();
                serviciosRevolver sp= new serviciosRevolver();
    
          Revolver r = sp.llenarRevolver();
                serviciosJuego game= new serviciosJuego();
                game.llenarJuego(jugadores, r);
                Jugador jugadorMojado= game.ronda(jugadores, sp, sj);
                System.out.println("el jugador que se mojo es "+jugadorMojado);
    }
    
}
