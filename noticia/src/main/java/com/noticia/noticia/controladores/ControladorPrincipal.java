/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.controladores;

import com.noticia.noticia.entidades.Noticia;
import com.noticia.noticia.entidades.usuario;
import com.noticia.noticia.exception.miException;
import com.noticia.noticia.servicios.UsuarioService;
import com.noticia.noticia.servicios.noticiaServicio;
import java.util.List;
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
@RequestMapping("/")
public class ControladorPrincipal {

    @Autowired
    private noticiaServicio notiS;

    @GetMapping("/")
    public String index() {
//        List<Noticia> noticias = notiS.listarNoticias();
//        modelo.addAttribute("noticias", noticias);

        return "index.html";
    }
    @Autowired
    private UsuarioService userS;

    @GetMapping("/registrar")
    public String registrar() {
        return "user.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, String password, Boolean activo, ModelMap modelo) {

        try {
            userS.crearUsuario(nombre, password, activo);
        } catch (miException ex) {
            modelo.put("error", ex.getMessage());
            return "user.html";
        }
        return "index.html";

    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "usuario o contraseña incorrecta");
        }
        return "login.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN','ROLE_PERIODISTA')")
    @GetMapping("/inicio")
    public String inicio(HttpSession sesion) {
        usuario logueado = (usuario) sesion.getAttribute("usuariosession");
        if (logueado.getRol().toString().equals("ADMIN")) {
            return "inicioNR.html";
        }
        if (logueado.getRol().toString().equals("ADMIN")) {
            return "inicioNR.html";
        }
        if (logueado.getRol().toString().equals("PERIODISTA")) {
            return "inicioNR.html";
        }
        return "inicioNR.html";
    }

}
