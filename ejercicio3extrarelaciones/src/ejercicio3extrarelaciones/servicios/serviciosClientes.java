/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones.servicios;

import ejercicio3extrarelaciones.Clientes;
import ejercicio3extrarelaciones.Cuota;
import ejercicio3extrarelaciones.Poliza;
import ejercicio3extrarelaciones.enumeradores.Apellidos;
import ejercicio3extrarelaciones.enumeradores.nombre;
import ejercicio3extrarelaciones.vehiculo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosClientes {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Clientes c1;
    vehiculo v1= new vehiculo();
    Poliza p1= new Poliza();
    Cuota cu1= new Cuota();
 ArrayList<Clientes> listaClientes;
    ArrayList<vehiculo> listaVehiculos = new ArrayList();
ArrayList<Poliza> poliza= new ArrayList();
       serviciosVehiculo serVehiculo= new serviciosVehiculo();
         ArrayList<vehiculo> nuevoVehiculo = serVehiculo.crearVehiculo();
    public ArrayList crearClientes(){
        
        int cantClientes=0;
        int pos=0;
        int pos2=0;
                
      do{
          c1= new Clientes();
         
          pos=(int) (Math.random()*8);
           pos2=(int) (Math.random()*8);
          
            c1.setNombre(nombre.values()[pos]);
            c1.setApellido(Apellidos.values()[pos2]);
           c1.setDni((int) (Math.random() * 12345678) + " ");
            c1.setDomicilio("jose scordo");
            c1.setNumTel((int) (Math.random()*156394540));
            c1.setEmail(c1.getNombre()+ "@gmail.com");
            
            c1.setPoliza(poliza);
            c1.setVehiculo(listaVehiculos);
           
            
            if(!listaClientes.contains(c1)){
                  listaClientes.add(c1);
            }
            cantClientes++;
           listaClientes.add(c1); 
      }while(cantClientes<20);
      
           
           
        
      
       return listaClientes;
    }
    public void mostrarLista(){
          for (Clientes aux : listaClientes) {
            System.out.println(aux);
        }
    }
    
}
