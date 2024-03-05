/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota.servicios;

import java.util.Scanner;
import mascota.Mascota;

/**
 *
 * @author pguid
 */
public class sermasco {
    private Scanner leer= new Scanner(System.in);
    public Mascota crearMascota(){
            System.out.println("introducir nombre");
            String nombre= leer.next();
    return new Mascota(nombre);
}
}
