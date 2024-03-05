/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.entidades;

import com.noticia.noticia.enumeradores.enumUsuario;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author pguid
 */
@Entity
public class Noticia {

    @Id
    private String titulo;
    private String cuerpo;
    @OneToOne
    private periodista periodista;

    public Noticia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public periodista getPeriodista() {
        return periodista;
    }

    public void setPeriodista(periodista periodista) {
        this.periodista = periodista;
    }

}
