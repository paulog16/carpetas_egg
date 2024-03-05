/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extrarelaciones.servicios;

import ejercicio3extrarelaciones.enumeradores.Color;
import ejercicio3extrarelaciones.enumeradores.Marca;
import ejercicio3extrarelaciones.enumeradores.Modelo;
import ejercicio3extrarelaciones.enumeradores.Tipo;
import ejercicio3extrarelaciones.vehiculo;
import java.util.ArrayList;

/**
 *
 * @author pguid
 */
public class serviciosVehiculo {
    vehiculo v1;
    ArrayList<vehiculo> listaVehiculos = new ArrayList();
    public ArrayList crearVehiculo() {
       
            v1 = new vehiculo();
            int min = 2000;
            int max = 2023;

            int marca =(int) (Math.random()*10);
            int modelos = (int) (Math.random()*9);
            int color = (int) (Math.random()*7);
            int tipo = (int) (Math.random()*8);
            v1.setMarca(Marca.values()[marca]);
           v1.setModelo(Modelo.values()[modelos]);
            v1.setColor(Color.values()[color]);
            v1.setTipo(Tipo.values()[tipo]);
            v1.setAnio((int) (Math.random() * (max - min) + min));
            v1.setChasis("ABCD" + v1.getAnio());
            v1.setNumMotor((int) (Math.random() * 1234567));
            listaVehiculos.add(v1);
    mostrarVehiculo();
return listaVehiculos;    
    }
 public void mostrarVehiculo(){
     for (vehiculo aux : listaVehiculos) {
         System.out.println(aux);
     }
 }    
}

