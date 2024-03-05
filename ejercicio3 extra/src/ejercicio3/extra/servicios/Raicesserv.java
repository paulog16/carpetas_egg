/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.extra.servicios;

import ejercicio3.extra.Raices;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
/* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.

 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.*/
public class Raicesserv {
    Raices r1= new Raices();
    Scanner leer = new Scanner(System.in);
    public void llenar(){
          System.out.println("ingrese los numeros");
       r1.setA(leer.nextDouble());
r1.setB(leer.nextDouble());
r1.setC(leer.nextDouble());
    }
    public double getDiscriminante(){
double determinante;
      

determinante= (Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC()));
        
   return determinante;
    }
    public boolean tieneRaices(){
        boolean resp;
        double determinante= getDiscriminante();
     
        if(determinante>0){
            resp=true;
            
        }else{
            resp=false;
        }
        return resp;
    }
    public boolean tieneRaiz(){
      boolean resp;
     double determinante= getDiscriminante();
    
        if(determinante==0){
            resp=true;
            
        }else{
            resp=false;
        }
        return resp;
}
    public void obtenerRaices(){
        if(tieneRaices()){
            double x= (-r1.getB()+Math.sqrt(getDiscriminante())/(2*r1.getA()));
            double x2= (-r1.getB()-Math.sqrt(getDiscriminante())/(2*r1.getA()));
                    /*(-b±√((b^2)-(4*a*c)))/(2*a)*/
                  System.out.println("La primer raiz es : " + String.format("%.2f",(((r1.getB()*-1)+ Math.sqrt(getDiscriminante()))) / (2*r1.getA())));
                   System.out.println("La primer raiz es : " + String.format("%.2f",(((r1.getB()*-1)- Math.sqrt(getDiscriminante()))) / (2*r1.getA())));
            
        }
    }
      public void obtenerRaiz(){
        if(tieneRaiz()){
            double x= (-r1.getB()+Math.sqrt(getDiscriminante())/(2*r1.getA()));
          System.out.println("La primer raiz es : " + String.format("%.2f",(((r1.getB()*-1)+ Math.sqrt(getDiscriminante()))) / (2*r1.getA())));
          
                    /*(-b±√((b^2)-(4*a*c)))/(2*a)*/
            
        }
    }
      
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje*/
  public void Calcular(){
      if(tieneRaices()){
          obtenerRaices();
          
      }else if(tieneRaiz()){
          obtenerRaiz();
      }else{
          System.out.println("no tiene solucion");
      }
  }
    
}
