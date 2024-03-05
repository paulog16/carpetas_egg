/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.Servicios;

import ejerciciointegrador.entidades.Armadura;
import java.util.Scanner;





/**
 *
 * @author pguid
 */
public class Accion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void caminar(Armadura a) {

        System.out.println("cuanto tiempo va a caminar");
        int tiempo = leer.nextInt();
        double consumo = a.getBotas().usar(a.getBotas().getConsumoenergetico(), tiempo);

        a.setGenerador(a.getGenerador() - consumo);
mostrarestado(a,consumo);
    }

    public void correr(Armadura a) {
        System.out.println("cuanto tiempo va a correr");
        int tiempo = leer.nextInt();
        double consumo = a.getBotas().usar(a.getBotas().getConsumoenergetico() * 2, tiempo);
        a.setGenerador(a.getGenerador() - consumo);
        mostrarestado(a,consumo);
    }

    public void propulsarse(Armadura a) {
        System.out.println("cuanto tiempo va a propulsarse");
        int tiempo = leer.nextInt();
        double consumo = a.getBotas().usar(a.getBotas().getConsumoenergetico() * 3, tiempo);
        a.setGenerador(a.getGenerador() - consumo);
        mostrarestado(a,consumo);
    }

    public void volar(Armadura a) {
        System.out.println("cuanto tiempo va a volar");
        int tiempo = leer.nextInt();
        double consumoB = a.getBotas().usar(a.getBotas().getConsumoenergetico() * 3, tiempo);
        double consumoG = a.getGuantes().usar(a.getGuantes().getConsumoenergetico() * 3, tiempo);
        double consumoT = consumoB + consumoG;
        a.setGenerador(a.getGenerador() - consumoT);
        mostrarestado(a,consumo);
    }

    public void disparar(Armadura a) {
        System.out.println("cuanto tiempo va a disparar");
        int tiempo = leer.nextInt();
        double consumo = a.getGuantes().usar(a.getGuantes().getConsumoenergetico() * 3, tiempo);
        a.setGenerador(a.getGenerador() - consumo);
        mostrarestado(a,consumo);
    }
  public void escribir(Armadura a){
      System.out.println("cada cuanto teimpo escribe");
      int tiempo=leer.nextInt();
        double consumo = a.getSintetizador().usar(a.getSintetizador().getConsumoenergetico() , tiempo);
           a.setGenerador(a.getGenerador() - consumo);
           mostrarestado(a,consumo);
  }
  public void mostrarestado(Armadura a,double  consumo){
      double valor= (consumo*100)/a.getGenerador();
      System.out.println("la carga actual del generador es del "+valor+"%");
  }
    
}
