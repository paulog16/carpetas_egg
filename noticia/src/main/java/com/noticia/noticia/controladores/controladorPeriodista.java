/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.controladores;

import com.noticia.noticia.entidades.periodista;
import com.noticia.noticia.entidades.usuario;
import com.noticia.noticia.exception.miException;
import com.noticia.noticia.servicios.periodistaService;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pguid
 */
@Controller
@RequestMapping("/periodista")
public class controladorPeriodista {

    @Autowired
    private periodistaService perServ;

    @GetMapping("/registrar")
    public String registrar() {
        return "periodista.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) String nombre,
            @RequestParam(required = false) String password,
            // @RequestParam(required = false) ArrayList<Noticia> noticias,
            @RequestParam(required = false) Integer sueldoMensual,
            @RequestParam(required = false) Boolean actividad,
            ModelMap modelo) {

        try {
            perServ.crearPeriodista(nombre, password, sueldoMensual, actividad);
            modelo.put("exito", "Usuario registrado exitosamente.");

            return "index";
        } catch (miException e) {
            modelo.put("error", e.getMessage());
            return "periodista";
        }
    }

    @PreAuthorize("hasAnyRole('ROLE_PERIODISTA')")
    @GetMapping("/inicio")
    public String inicio() {
        return "inicioNR.html";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "Usuario o contraseña invalidos.");
        }
        return "login";
    }

}
