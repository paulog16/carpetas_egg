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
public class Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    //    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public void comprobarConsumoEnergetico(char letra){
       if( letra >= 65 && letra<=70){
            consumo=letra;
        }else{
           consumo='f';
       }
    }
    
    
    
    //    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    public void comprobarColor(String color){
        switch (color.toLowerCase()){
            case "blanco":
                this.color=color;
                break;
            case "negro":
                this.color=color;
                break;
            case "rojo":
                this.color=color;
                break;
            case "azul":
                this.color=color;
                break;
            case "gris":
                this.color=color;
                break;
            default:
                this.color="blanco";
                        
            }
    }
    
    
    
//Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
  public void crearElectrodomestico(){
      this.precio=1000;
      System.out.println("indique color");
      this.color=leer.next();
      comprobarColor(color);
      System.out.println("indique consumo");
      this.consumo=leer.next().toUpperCase().charAt(0);
      comprobarConsumoEnergetico(consumo);
      System.out.println("indique el peso del electrodomestico");
      this.peso=leer.nextInt();
  }
  
  
  
  //Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
public int precioFinal(){
    int precioLetra=0;
    int precioPeso=0;
    
    switch(consumo){
        case 'A':
            precioLetra=1000;
            break;
        case'B':
                precioLetra=800;
            break;
        case 'C':
            precioLetra=600;
            break;
        case 'D':
            precioLetra=500;
            break;
        case'E':
            precioLetra=300;
            break;
        case'F':
            precioLetra=100;
            break;
           
    }
    
    if (peso>1 && peso<19 ){
        precioPeso=100;
    }
    if(peso>20 && peso<49){
        precioPeso=500;
    }
    if(peso>50 && peso<79){
        precioPeso=800;
    }
    if(peso>80){
        precioPeso=1000;
    }
    this.precio=precioLetra+precioPeso;
    
   return precio;
}
protected void mostrarDatosElectrodomestico(){
        System.out.println("El color asignado es : " + this.color);
        System.out.println("El Consumo energetico : " + this.consumo);
        System.out.println("El peso : " + this.peso + "Kg");
        
    }

}
//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.






