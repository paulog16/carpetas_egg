/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extracollections.servicios;


import ejercicio4extracollections.Mapas;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class ServiciosMapas {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Mapas m1=new Mapas();
public void cargarCiudades(){
    for (int i = 0; i < 3; i++) {
     
        System.out.println("ingrese codigo postal");
        Integer codigo=leer.nextInt();
        System.out.println("ingrese ciudad a la que corresponde");
        String Ciudad=leer.next();
        m1.getListaCiudades().put(codigo, Ciudad);
    }
    mostrar();
}
public void mostrar(){
  m1.getListaCiudades().entrySet().forEach((Ciudad)->{
      Integer key=Ciudad.getKey();
      String value=Ciudad.getValue();
      System.out.println("codigo: "+key+" | ciudad: "+value);
  });
   
    }
public void Buscar(){
    int codigo;
    boolean encontrado=false;
      System.out.println("ingrese codigo postal para buscar");
        codigo=leer.nextInt();
    for (Map.Entry<Integer, String> entry :m1.getListaCiudades().entrySet()) {
        Integer key = entry.getKey();
        String value = entry.getValue();
     
        if(codigo==key){
            encontrado=true;
            System.out.println("el codigo corresponde a: "+value);
        }
    }
    if(encontrado==false){
        System.out.println("la ciudad no existe");
    }
}
public void agregarCiudad(){
    boolean encontrado;
    int agregar;
    String ciudad;
do{
    encontrado=false;
    System.out.println("ingrese codigo nuevo");
    agregar=leer.nextInt();
     
 
    
    if(m1.getListaCiudades().containsKey(agregar)){
        System.out.println("el codigo ya existe, ingrese otro");
        encontrado=true;
        continue;
    }
     System.out.println("ingrese ciudad nueva");
     ciudad=leer.next();
     m1.getListaCiudades().put(agregar, ciudad);
        }while(encontrado);
     mostrar();
}



public void eliminar(){
    boolean encontrado=false;
    int cod;
    int cont=0;
  do {
       
        System.out.println("ingrese codigo que desea eliminar");
        System.out.println("ciudad: "+cont);
        cod=leer.nextInt();
        Iterator<Map.Entry<Integer,String>> it= m1.getListaCiudades().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> its= it.next();
            if(its.getKey()==cod){
                it.remove();
                encontrado=true;
                 cont++;
            }
        }
    }while(cont!=3);
    if(encontrado==false){
        System.out.println("no se encontro el codigo");
    }
    System.out.println("las ciudades que quedan: ");
    mostrar();
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