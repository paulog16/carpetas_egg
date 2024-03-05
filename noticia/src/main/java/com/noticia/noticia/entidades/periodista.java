/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.entidades;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author pguid
 */
@Entity
//@PrimaryKeyJoinColumn(name = "id")
public class periodista extends usuario{

    //private ArrayList<Noticia> misNoticias;
    private Integer sueldoMensual;

    public periodista() {
    }
    
    

    //public ArrayList<Noticia> getMisNoticias() {
      //  return misNoticias;
    //}

    //public void setMisNoticias(ArrayList<Noticia> misNoticias) {
      //  this.misNoticias = misNoticias;
    //}

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
