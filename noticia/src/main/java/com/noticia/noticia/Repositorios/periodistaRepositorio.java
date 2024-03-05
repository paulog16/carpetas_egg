/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticia.noticia.Repositorios;

import com.noticia.noticia.entidades.periodista;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pguid
 */
@Repository
public interface periodistaRepositorio extends JpaRepository<periodista, Integer> {

    @Query("SELECT p FROM periodista p WHERE p.nombre=:nombre")
    public List<periodista> nombre(@Param("nombre") String nombre);

}
