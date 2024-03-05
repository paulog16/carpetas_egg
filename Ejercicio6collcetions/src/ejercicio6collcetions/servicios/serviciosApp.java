/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6collcetions.servicios;

import ejercicio6collcetions.App;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author pguid
 */
public class serviciosApp {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    HashMap<String,Integer> ProductosPrecio= new HashMap();
    App a1;
    public App cargarApp(){
        a1=new App();
        String res;
        do{
        System.out.println("introduzca producto");
   a1.setProductos(leer.next());
        System.out.println("ingrese precio");
       a1.setPrecio(leer.nextInt());
        ProductosPrecio.put(a1.getProductos(),a1.getPrecio());
            System.out.println("desea agragar otro producto?s/n");
            res=leer.next();
    
        }while(res.equalsIgnoreCase("s"));
            return a1;
    }
    public void mostrar(){
        for (Map.Entry<String, Integer> entry : ProductosPrecio.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
          
            System.out.println(entry);
            
        }
    }
    public void modificarPrecio(){
        String aux1;
        String res;
        do{
            boolean encontrado=false;
            mostrar();
        System.out.println("de que producto desea cambiar el precio");
      aux1=leer.next();
            for (Map.Entry<String, Integer> entry : ProductosPrecio.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if(key.equals(aux1)){
                    System.out.println("cual es el precio nuevo?");
                    encontrado=true;
//            a1.setPrecio(leer.nextInt());
             ProductosPrecio.put(key, leer.nextInt());
         
        
                }
               
            }
             if(encontrado==false){
                    System.out.println("no se encuentra ese producto");
                }
            mostrar();
              System.out.println("desea cambiar otro precio?s/n");
        res=leer.next();
       
        }while(res.equalsIgnoreCase("s"));
        
    }
//    public static void cambiarPrecio( HashMap<String,Integer>ProductosPrecio,String aux1){
//        if(ProductosPrecio.containsKey(aux1)){
//            ProductosPrecio.put(aux1, a1.getPrecio());
//        }
//    }
  public void eliminar1(){
      String aux;
      String res;
      do{
         
          System.out.println("que producto desea eliminar");
          aux=leer.next();
        eliminarObjeto(ProductosPrecio,aux);
         
           System.out.println("desea eliminar otro producto?s/n");
          res=leer.next();
         mostrar();
        
      }while(res.equalsIgnoreCase("s"));
       
  }
    public static void eliminarObjeto( HashMap<String,Integer>ProductosPrecio,String aux){
  
      
           if(ProductosPrecio.containsKey(aux)){
              ProductosPrecio.remove(aux);
          
           }else{
               System.out.println("el producto no existe");
               
           }
            
       
    }
    
}
//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.