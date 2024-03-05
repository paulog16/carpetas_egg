/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Lavadora extends Electrodomestico {
    Electrodomestico e1= new Electrodomestico();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int carga;

    public Lavadora() {
    }

   

    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

//   Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public void crearLavadora(){
super.crearElectrodomestico();
        System.out.println("ingrese carga");
        this.carga=leer.nextInt();
    }
    
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    public int precioFinal(){
      
        if(carga>30){
          this.precio=precio+500;
          
        }
            
       mostrarDatosElectrodomestico();
   return precio;
    }
   @Override
   public void mostrarDatosElectrodomestico(){
       super.mostrarDatosElectrodomestico();
       System.out.println("La capacidad de carga es : " + getCarga());
       System.out.println("El precio final de la lavadora es  : $" + getPrecio());

   }
    
    
}
