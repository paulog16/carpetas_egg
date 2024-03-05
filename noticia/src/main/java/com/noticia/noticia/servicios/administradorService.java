/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.servicios;

import com.noticia.noticia.Repositorios.administradorRepositorio;
import com.noticia.noticia.Repositorios.usuarioRepositorio;
import com.noticia.noticia.entidades.Administrador;
import com.noticia.noticia.entidades.usuario;
import com.noticia.noticia.enumeradores.enumUsuario;
import com.noticia.noticia.exception.miException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author pguid
 */
@Service
public class administradorService {

    @Autowired
    private administradorRepositorio adminR;

    @Transactional
    public void crearAdmin(String nombre, String password) throws miException {
        validar(nombre, password);
        Administrador admin = new Administrador();
        admin.setNombre(nombre);
        admin.setPassword(new BCryptPasswordEncoder().encode(password));
        admin.setRol(enumUsuario.ADMIN);

        adminR.save(admin);
    }

    public List<Administrador> listarAdministradores() {
        List<Administrador> admins = new ArrayList();
        admins = adminR.findAll();
        return admins;
    }

    public void modificarAdministrador(String nombre, String password, Integer id) throws miException {
        validar(nombre, password);
        Optional<Administrador> respuesta = adminR.findById(id);
        if (respuesta.isPresent()) {
            Administrador admin = respuesta.get();
            admin.setNombre(nombre);
            adminR.save(admin);
        }
    }

    public void eliminar(Integer id) {
        adminR.deleteById(id);
    }

    public usuario getOne(Integer id) {
        return adminR.getOne(id);
    }

    private void validar(String nombre, String password) throws miException {
        if (nombre == null || nombre.isEmpty()) {
            throw new miException("el nombre no puede ser nulo");
        }
        if (password == null || password.isEmpty()) {
            throw new miException("la contraseña no puede ser nulo");
        }

    }
}
