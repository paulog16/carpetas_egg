/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones.servicios;

import ejercicio3extrarelaciones.Clientes;
import ejercicio3extrarelaciones.Cuota;
import ejercicio3extrarelaciones.Poliza;
import ejercicio3extrarelaciones.vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class serviciosPoliza {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Poliza> poliza= new ArrayList();
    Poliza p1;
    Cuota cuota= new Cuota();
   serviciosClientes serCliente= new  serviciosClientes();
   serviciosVehiculo serVehiculo= new serviciosVehiculo();
   ArrayList<vehiculo> nuevoVehiculo = serVehiculo.crearVehiculo();
   ArrayList<Clientes>nuevaLista= serCliente.crearClientes();
   public void crearPoliza(){
       do{
           System.out.println("ingrese el dni del cliente");
           String dni= leer.next();
         ("ingrese el numero de chasis que quiere asegurar");
           String chasis=leer.next();
           mostrarLista(poliza);
           System.out.println("desea ingresar otro?s/n");
       }while(leer.next().equalsIgnoreCase("s"));
   
   }
   public void mostrarLista(ArrayList lista){
       lista.forEach(object -> {
           System.out.println(object);
        });
   }
   public Clientes buscarPersona(String dni){
       Clientes encontrado=new Clientes();
       for (Clientes aux : nuevaLista) {
           if(aux.getDni().equalsIgnoreCase(dni)){
               encontrado=aux;
               break;
           }else{
               encontrado=null;
           }
       }
       return encontrado;
   }
   public vehiculo buscarVehiculo(String chasis){
       vehiculo encontrado= new vehiculo();
       for (vehiculo aux: nuevoVehiculo) {
           if(aux.getChasis().equalsIgnoreCase(chasis)){
               encontrado=aux;
               break;
           }else{
               encontrado=null;
           }
       }
       return encontrado;
   }
}
