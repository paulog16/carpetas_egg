package mascotaapp;

import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.Serviciomascotas;

public class MascotaAPP {
    
    public static void main(String[] args) {
        
        int num = 10;
        Mascota mm = new Mascota();
        modificador(num, mm);
        System.out.println("a " + num);
        System.out.println("Mascota " + mm);
        
    }

    public static void modificador(int num, Mascota m) {
        num = 100;
        m.setApodo("morita");
        System.out.println(m.toString());
        System.out.println(m.getEdad());
    }
    
}
