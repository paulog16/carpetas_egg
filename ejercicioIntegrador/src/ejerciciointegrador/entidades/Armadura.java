/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador.entidades;

import ejerciciointegrador.Componentes.Bota;
import ejerciciointegrador.Componentes.Consola;
import ejerciciointegrador.Componentes.Guante;
import ejerciciointegrador.Componentes.Sintetizador;

/**
 *
 * @author pguid
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int nivelSalud;
    private int resistencia;
    private Bota botas;
 
    private Guante guantes;
   
    private Consola consola;
    private Sintetizador Sintetizador;
    private double generador;
    private String material;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int nivelSalud, int resistencia, Bota botas, Guante guantes, Consola consola, Sintetizador Sintetizador, double generador, String material) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelSalud = nivelSalud;
        this.resistencia = resistencia;
        this.botas = botas;
        this.guantes = guantes;
        this.consola = consola;
        this.Sintetizador = Sintetizador;
        this.generador = generador;
        this.material = material;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Bota getBotas() {
        return botas;
    }

    public void setBotas(Bota botas) {
        this.botas = botas;
    }

    public Guante getGuantes() {
        return guantes;
    }

    public void setGuantes(Guante guantes) {
        this.guantes = guantes;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return Sintetizador;
    }

    public void setSintetizador(Sintetizador Sintetizador) {
        this.Sintetizador = Sintetizador;
    }

    public double getGenerador() {
        return generador;
    }

    public void setGenerador(double generador) {
        this.generador = generador;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelSalud=" + nivelSalud + ", resistencia=" + resistencia + ", botas=" + botas + ", guantes=" + guantes + ", consola=" + consola + ", Sintetizador=" + Sintetizador + ", generador=" + generador + ", material=" + material + '}';
    }

  

   
}
