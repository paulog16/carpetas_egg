/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extrasrelaciones;

import ejercicio2extrasrelaciones.servicios.serviciosEspectador;
import ejercicio2extrasrelaciones.servicios.serviciosPelicula;
import ejercicio2extrasrelaciones.servicios.serviciosSala;
import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class Ejercicio2extrasrelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosSala serSala= new serviciosSala();
        serviciosPelicula serPeli= new serviciosPelicula();
        serviciosEspectador serEspe= new serviciosEspectador();
        ArrayList<Pelicula> ListPeli= serPeli.crearPeliculas();
          ArrayList<Espectador>ListEspect= serEspe.cargarEspectadores();
        
        serSala.crearSala(ListPeli,ListEspect);
                
    }
    
}
