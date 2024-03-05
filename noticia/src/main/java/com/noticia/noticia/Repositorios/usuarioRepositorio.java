/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticia.noticia.Repositorios;


import com.noticia.noticia.entidades.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pguid
 */
@Repository
public interface usuarioRepositorio extends JpaRepository<usuario, Integer> {

    @Query("SELECT u FROM usuario u WHERE u.nombre=:nombre")
    public usuario buscarPorNombre(@Param("nombre") String nombre);

}