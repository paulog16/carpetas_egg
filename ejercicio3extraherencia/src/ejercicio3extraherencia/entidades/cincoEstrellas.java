/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3extraherencia.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class cincoEstrellas extends CuatroEstrellas {
    private int cantSalones,cantSuites,cantLimosinas;

    public cincoEstrellas() {
    }

   

    public cincoEstrellas(int cantSalones, int cantSuites, int cantLimosinas, String gimnasio, String nombreResto, int capacidadResto, String nombre, String direccion, String localidad, String Gerente) {
        super(gimnasio, nombreResto, capacidadResto, nombre, direccion, localidad, Gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "cincoEstrellas{"+super.toString() + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

  public void crearCinco(){
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      super.crear();
      System.out.println("ingrese cantidad de salones");
      this.cantSalones=leer.nextInt();
      System.out.println("ingrese cantidad de suiets");
      this.cantSuites=leer.nextInt();
      System.out.println("ingrese cantidad de limosinas");
      this.cantLimosinas=leer.nextInt();
      calcularPrecios();
  }
    public int calcularPrecios(){
    precioHabitacion=super.calcularPrecio()+(15*cantLimosinas);
     return precioHabitacion;
   }

   
    
}
