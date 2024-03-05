/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones.servicios;

import ejercicio1relaciones.Persona;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(){
Persona p1= new Persona("paulo","guidolin",20,44,null);
    }
    public serviciosPerro escogerMascota(){
        serviciosPerro sp= new serviciosPerro();
        return sp;
    }
}
