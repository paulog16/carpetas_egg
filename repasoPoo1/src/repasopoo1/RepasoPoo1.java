package repasopoo1;

import java.util.Scanner;
import repasopoo1.entidades.ClaseMascota;


public class RepasoPoo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ClaseMascota m1 = new ClaseMascota();
     
       
        System.out.println("ingrese edad del perro");
        m1.setEdad(leer.nextInt());
        System.out.println("ingrese la edad del perro mayor");
        int edadMayor=leer.nextInt();
        System.out.println("ingrese la cantidad de vueltas");
        int vueltas=leer.nextInt();
        System.out.println("queda: "+m1.restar(edadMayor, vueltas));
  
        

    }

}
