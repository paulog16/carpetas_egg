/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticia.noticia.servicios;

import com.noticia.noticia.Repositorios.usuarioRepositorio;
import com.noticia.noticia.entidades.periodista;
import com.noticia.noticia.entidades.usuario;
import com.noticia.noticia.enumeradores.enumUsuario;
import com.noticia.noticia.exception.miException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author pguid
 */
@Service
public class UsuarioService implements UserDetailsService {


    @Autowired
    private usuarioRepositorio userR;

    @Transactional
    public void crearUsuario(String nombre, String password, Boolean activo) throws miException {
        validar(nombre, password);
        usuario user = new usuario();
        user.setNombre(nombre);
        user.setAlta(new Date());
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        user.setActivo(activo);
        user.setRol(enumUsuario.USER);
        userR.save(user);
    }

    public List<usuario> listarUsuario() {
        List<usuario> users = new ArrayList();
        users = userR.findAll();
        return users;
    }

    public void modificarUsuario(String nombre, String password, Integer id) throws miException {
        validar(nombre, password);
        Optional<usuario> respuesta = userR.findById(id);
        if (respuesta.isPresent()) {
            usuario user = respuesta.get();
            user.setNombre(nombre);
            user.setPassword(password);
            user.setActivo(Boolean.TRUE);
            userR.save(user);
        }
    }

    public void eliminar(Integer id) {
        userR.deleteById(id);
    }

    public usuario getOne(Integer id) {
        return userR.getOne(id);
    }

    private void validar(String nombre, String password) throws miException {
        if (nombre == null || nombre.isEmpty()) {
            throw new miException("el nombre no puede ser nulo");
        }
        if (password == null || password.isEmpty()) {
            throw new miException("la contraseña no puede ser nulo");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        usuario usuario = userR.buscarPorNombre(nombre);
        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession sesion = attr.getRequest().getSession(true);
            sesion.setAttribute("usuariosession", usuario);
            return new User(usuario.getNombre(), usuario.getPassword(), permisos);

        } else {
            return null;
        }
    }
}
