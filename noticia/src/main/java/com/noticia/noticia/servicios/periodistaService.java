/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.servicios;

import com.noticia.noticia.Repositorios.periodistaRepositorio;


import com.noticia.noticia.entidades.periodista;

import com.noticia.noticia.enumeradores.enumUsuario;
import com.noticia.noticia.exception.miException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author pguid
 */
@Service
public class periodistaService {

    @Autowired
    private periodistaRepositorio periodistR;

    @Transactional
    public void crearPeriodista(String nombre, String password,Integer sueldoMensual,Boolean actividad) throws miException {
        validar(nombre, password, sueldoMensual);
        periodista periodist = new periodista();

        periodist.setNombre(nombre);
        periodist.setSueldoMensual(sueldoMensual);
        periodist.setAlta(new Date());
        periodist.setActivo(actividad);
       // periodist.setMisNoticias(listaNoticias);
        periodist.setPassword(new BCryptPasswordEncoder().encode(password));
        periodist.setRol(enumUsuario.PERIODISTA);
        periodistR.save(periodist);
    }

    public List<periodista> listarPeriodista() {
        List<periodista> periodist = new ArrayList();
        periodist = periodistR.findAll();
        return periodist;
    }

//    public void modificarPeriodista(String nombre, String password, ArrayList<Noticia> listaNoticias, Integer sueldoMensual, Integer id) throws miException {
//        validar(nombre, password, listaNoticias, sueldoMensual);
//        Optional<periodista> respuesta = periodistR.findById(id);
//        if (respuesta.isPresent()) {
//            periodista periodist = respuesta.get();
//            periodist.setNombre(nombre);
//            periodist.setMisNoticias(listaNoticias);
//            periodist.setPassword(password);
//            periodist.setSueldoMensual(sueldoMensual);
//            periodistR.save(periodist);
//        }
//    }

    public void eliminar(Integer id) {
        periodistR.deleteById(id);
    }

    public periodista getOne(Integer id) {
        return periodistR.getOne(id);
    }

    private void validar(String nombre, String password, Integer sueldoMensual) throws miException {
        if (nombre == null || nombre.isEmpty()) {
            throw new miException("el nombre no puede ser nulo");
        }
        if (password == null || password.isEmpty()) {
            throw new miException("la contraseña no puede ser nulo");
        }
        //if (listaNoticias == null) {
          //  throw new miException("la lista no puede estar vacia");
        //}
        if (sueldoMensual == null) {
            throw new miException("el sueldo mensual no puede ser nulo");
        }

    }
}
