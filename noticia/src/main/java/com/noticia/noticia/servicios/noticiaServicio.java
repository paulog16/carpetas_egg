/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.servicios;

import com.noticia.noticia.Repositorios.noticiaRepositorio;
import com.noticia.noticia.entidades.Noticia;
import com.noticia.noticia.exception.miException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pguid
 */
@Service
public class noticiaServicio {

    @Autowired
    noticiaRepositorio noticiaR;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws miException {
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticiaR.save(noticia);

    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaR.findAll();
        return noticias;
    }

    @Transactional
    public void modificar(String titulo, String cuerpo) throws miException {
        validar(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaR.findById(titulo);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaR.save(noticia);
        }
    }

    public Noticia getOne(String titulo) {

        return noticiaR.getOne(titulo);

    }

    public void Eliminar(String titulo) {
        noticiaR.deleteById(titulo);
    }

    private void validar(String titulo, String cuerpo) throws miException {
        if (titulo == null) {
            throw new miException("el nombre no puede ser nulo");
        }
        if (cuerpo == null) {
            throw new miException("el cuerpo no puede ser nulo");
        }
    }
}
