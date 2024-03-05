/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2herencia.entidades;

/**
 *
 * @author pguid
 */
public class Televisor extends Electrodomestico{
     private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

   

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
//    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
//    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("indique resolucion");
        this.resolucion=leer.nextInt();
        System.out.println("tiene sintonizador?s/n");
String op=leer.next();
if(op=="s"){
    this.sintonizador=true;
}else{
    this.sintonizador=false;
}
    }
    
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    
    public void precioFinal(){
        super.precioFinal();
        int precioR=0;
        int precioS=0;
        if(resolucion>40){
            precioR=((precio*30)/100)+precio;       
        }
        if(sintonizador==true){
            precioS=500;
        }
      this.precio=precioR+precioS;
        System.out.println("el precio final del televisor seria: "+precio);
    }
}
