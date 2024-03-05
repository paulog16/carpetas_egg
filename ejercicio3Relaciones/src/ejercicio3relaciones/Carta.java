/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3relaciones;

/**
 *
 * @author pguid
 */
public class Carta {
    private int num;
    private String palo;

  

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }
    
}
