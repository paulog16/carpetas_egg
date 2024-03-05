/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones.servicios;

import ejercicio2relaciones.Revolver;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosRevolver {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random ran= new Random();
    Revolver r1= new Revolver();
    public Revolver llenarRevolver(){
        new Revolver();
        System.out.println("cargando tambor");
    r1.setPosicionActual((int) (Math.random()*6+1));
 
        r1.setPosicionAgua((int) (Math.random()*6+1));
        return r1;
    }
    
    public boolean mojar(){
        boolean encontrado=false;
        if(r1.getPosicionActual()==r1.getPosicionAgua()){
           encontrado=true;
            System.out.println(encontrado);
        }else{
            encontrado=false;
            System.out.println(encontrado);
        }
        return encontrado;
    }
    public void siguienteChorro(){
    
    if (r1.getPosicionActual()<r1.getPosicionAgua()){
     r1.setPosicionActual(r1.getPosicionActual()+1);
    }else{
         r1.setPosicionActual(r1.getPosicionActual()-1);
    }
    
    }
    public void mostrar(){
        System.out.println(r1);
    }

}
