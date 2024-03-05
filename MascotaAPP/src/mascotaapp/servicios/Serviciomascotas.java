/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author pguid
 */
public class Serviciomascotas {

    private final Scanner leer = new Scanner(System.in);

    public Mascota crearMascota() {

        System.out.println("introducir nombre");
        String nombre = leer.next();
        System.out.println("introducir apodo");
        String apodo = leer.next();
        System.out.println("introducir tipo");
        String tipo = leer.next();
        return new Mascota(nombre, apodo, tipo);

    }
}
