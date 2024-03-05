/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.Servicios;

import ejerciciointegrador.Componentes.Bota;
import ejerciciointegrador.Componentes.Consola;
import ejerciciointegrador.Componentes.Guante;
import ejerciciointegrador.Componentes.Sintetizador;
import ejerciciointegrador.entidades.Armadura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class crearArmadura {

    //  ArrayList<Armadura> listaArmadura = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Armadura crearAr() {
        Armadura a = new Armadura();
        Bota botas = new Bota();

        Guante guantes = new Guante();

        Sintetizador st = new Sintetizador();
      
        Consola c = new Consola();
        try {
            System.out.println("ingrese el color primario");
            a.setColorPrimario(leer.next());
            System.out.println("ingrese el color secundario");
            a.setColorSecundario(leer.next());
            a.setNivelSalud(100);

            do {
                System.out.println("ingrese el material de la armadura ALUMINIO/VIBRANIO/HIERRO/TITANIO");
                a.setMaterial(leer.next());
            } while (a.getMaterial().equalsIgnoreCase("aluminio") && a.getMaterial().equalsIgnoreCase("vibranio") && a.getMaterial().equalsIgnoreCase("hierro") && a.getMaterial().equalsIgnoreCase("titanio"));
            a.setResistencia(100);
            switch (a.getMaterial()) {
                case "aluminio":
                    a.setResistencia((int) (a.getResistencia() * 0.1) + a.getResistencia());
                    break;
                case "vibranio":
                    a.setResistencia((int) (a.getResistencia() * 0.6) + a.getResistencia());
                    break;
                case "hierro":
                    a.setResistencia((int) (a.getResistencia() * 0.3) + a.getResistencia());
                    break;
                case "titanio":
                    a.setResistencia((int) (a.getResistencia() * 0.45) + a.getResistencia());
                    break;
            }

            botas.setConsumoenergetico(5000);
       
            guantes.setConsumoenergetico(3000);
           
            c.setConsumoenergetico(15000);
            st.setConsumoenergetico(10000);
          a.setGenerador(Float.MAX_VALUE);
            a.setBotas(botas);
          a.setGuantes(guantes);
            a.setConsola(c);
        
            a.setSintetizador(st);
//listaArmadura.add(a);
        } catch (InputMismatchException IME) {
            System.out.println("error en la carga de datos");
            System.out.println(IME.getMessage());
            System.out.println(Arrays.toString(IME.getStackTrace()));
        }
return a;
    }
}
