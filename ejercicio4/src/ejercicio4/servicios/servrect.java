/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicios;

import ejercicio4.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servrect {
    Scanner leer = new Scanner(System.in);
    Rectangulo r1= new Rectangulo();
    public void crearRect(){
        System.out.print("ingrese la base: ");
        r1.setBase(leer.nextDouble());
        System.out.print("ingrese la altura: ");
        r1.setAltura(leer.nextDouble());
    
    }
    public void calcularSuperficieYperimetro(){
        double superficie= r1.getAltura()*r1.getBase();
        double perimetro= (r1.getAltura()+r1.getBase())*2;
        System.out.println("la superficie es: "+superficie);
        System.out.println("el perimetro es: "+perimetro);
    }
       public void mostrarAsteriscos(){
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) 
                System.out.print("*");
            System.out.println("");
            
            
            
        }
    }
    
}
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.