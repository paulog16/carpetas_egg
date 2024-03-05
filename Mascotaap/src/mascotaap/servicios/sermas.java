/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaap.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotaap.Mascota;

/**
 *
 * @author pguid
 */
public class sermas {
    private Scanner leer= new Scanner(System.in);
    private List<Mascota>mascotas;

    public sermas() {
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
        System.out.println("nombre: ");
        String nombre= leer.next();
        System.out.println("apodo");
        String apodo= leer.next();
        System.out.println("tipo:");
        String tipo= leer.next();
       String mascota=(nombre+" "+apodo+" "+tipo);
       Mascota m= new Mascota(nombre, apodo, tipo);
       mascotas.add(m);
return m;
        
    }
    public void mostrarMascotas(){
        System.out.println("las mascotas actuales de la lista mascota son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad= "+mascotas.size());
    }
    /**
     * crea mascotas todas paulo
     * @param cantidad equivale a la cantidad mascotas a crear y añadir a la lista
     */
    public void fabricaPaulo(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
   Mascota aux= new Mascota("Paulo", "pau", "ovejero");
   mascotas.add(aux);
            System.out.println(aux);
            
        }
       
    }
    /**
     * crea mascotas por teclados
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota creados= crearMascota();
            System.out.println(creados.toString());
        }
        
    }
}
