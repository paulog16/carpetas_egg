/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio82;

/**
 *
 * @author pguid
 */
public class cadena {
    String frase;
    int longitud;

    public cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public cadena() {
    }
    

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}
