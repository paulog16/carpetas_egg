/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.Componentes;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public abstract class Componente {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected int consumoenergetico;


    public Componente() {
    }

    public Componente(int consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public int getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(int consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    @Override
    public String toString() {
        return "Componente{"  + ", consumoenergetico=" + consumoenergetico + '}';
    }

  
  
protected void asignarConsumo(){
    System.out.println("ingrese el valor de consum del componente");
    this.consumoenergetico=leer.nextInt();
}
public abstract int usar(int intensidad,int tiempo);
}
