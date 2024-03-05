/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3relaciones.servicios;

import ejercicio3relaciones.Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Servicios {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cartas> baraja = new ArrayList();
    ArrayList<Cartas> cartasDadas= new ArrayList();
String [] palos= {"espada","basto","oro","copa"};
   public void cargarCartas(){
       Cartas c1;
       for (int i = 0; i < 4; i++) {
           
       
       for (int j = 1; j < 13; j++) {
           if(j!=8 && j!=9){
            c1= new Cartas(j,palos[i]);   
           baraja.add(c1);
           }
        
       }
       }
       mostrar(baraja);
   }
   public void barajar(){
       Collections.shuffle(baraja);
       mostrar(baraja);
   }
   public void mostrar(ArrayList<Cartas>maso){
       maso.forEach(cartas -> {
           System.out.println(cartas);
        });
   }
   public Cartas siguienteCarta(){
       Cartas cd= new Cartas();
    if (!baraja.isEmpty()){
        cd=baraja.get(0);
        cartasDadas.add(cd);
        baraja.remove(0);
        return cd;
    }else{
        System.out.println("no quedan mas cartas para dar");
        return null;
    }
      
       
   }
   public int cartasDisponibles(){
   
      return baraja.size();
   }
   public void darCartas(){
       System.out.println("cuantas cartas quieres repartir");
       int cont=0;
       int cant= leer.nextInt();
       do{
           siguienteCarta();
           cont++;
       }while(cont<cant);
              System.out.println("la cantidad de cartas disponibles son: "+cartasDisponibles());

   }
   public void cartasMonton(){
       if(!cartasDadas.isEmpty()){
               mostrar(cartasDadas);
       }else{
           System.out.println("no se repartieron cartas");
           System.out.println("la baraja quedo asi");
           mostrar(baraja);
       }

   }
  public void mostrarBarajas(){
     
  }
}
//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.