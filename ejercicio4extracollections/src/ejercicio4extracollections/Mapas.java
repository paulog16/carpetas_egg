/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extracollections;

import java.util.HashMap;
import java.util.Objects;



/**
 *
 * @author pguid
 */
public class Mapas {
    
  HashMap<Integer,String>ListaCiudades=new HashMap();

    public Mapas() {
    }

    public HashMap<Integer, String> getListaCiudades() {
        return ListaCiudades;
    }

    public void setListaCiudades(HashMap<Integer, String> ListaCiudades) {
        this.ListaCiudades = ListaCiudades;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.ListaCiudades);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mapas other = (Mapas) obj;
        if (!Objects.equals(this.ListaCiudades, other.ListaCiudades)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mapas{" + "ListaCiudades=" + ListaCiudades + '}';
    }
  
}
   
//Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//numero.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//• Muestra por pantalla los datos