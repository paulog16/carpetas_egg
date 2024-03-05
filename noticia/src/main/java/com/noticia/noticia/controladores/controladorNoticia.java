/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.controladores;

import com.noticia.noticia.entidades.Noticia;
import com.noticia.noticia.entidades.periodista;
import com.noticia.noticia.exception.miException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.noticia.noticia.servicios.noticiaServicio;
import com.noticia.noticia.servicios.periodistaService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author pguid
 */
@Controller
@RequestMapping("/noticia")
public class controladorNoticia {

    @Autowired
    private noticiaServicio notiS;
    private periodistaService perioS;

    @GetMapping("/Registrar")
    public String registrar(ModelMap modelo) {
        List<periodista> periodistas = perioS.listarPeriodista();
        modelo.addAttribute("periodistas", periodistas);
        return "noticia.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo, ModelMap modelo) {
        try {
            notiS.crearNoticia(titulo, cuerpo);
        } catch (miException ex) {
            modelo.put("error", ex.getMessage());
            List<periodista> periodistas = perioS.listarPeriodista();
            modelo.addAttribute("periodistas", periodistas);
        }

        return "noticiasList.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Noticia> noticias = notiS.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticiasList.html";
    }

    @GetMapping("/modificar/{titulo}")
    public String modificar(@PathVariable String titulo, ModelMap modelo) {
        modelo.put("noticia", notiS.getOne(titulo));
        return "noticiaModificar.html";
    }

    @PostMapping("/modificar/{titulo}")
    public String modificar(@PathVariable String titulo, String cuerpo, ModelMap modelo) {
        try {
            notiS.modificar(titulo, cuerpo);
            return "redirect:../lista";
        } catch (miException ex) {
            modelo.put("error", ex.getMessage());
            return "noticiaModificar.html";
        }
    }

    @GetMapping("/eliminar/{titulo}")
    public String eliminar(@PathVariable String titulo, ModelMap modelo) {
        notiS.Eliminar(titulo);
        return "redirect:../lista";
    }

//
//    @GetMapping("/lista")
//    public String listar(ModelMap modelo) {
//        List<Noticia> noticias = notiS.listarNoticias();
//        modelo.addAttribute("noticias", noticias);
//        return "noticiasList.html";
//    }
}
