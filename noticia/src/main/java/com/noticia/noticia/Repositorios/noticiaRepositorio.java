/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticia.noticia.Repositorios;

import com.noticia.noticia.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pguid
 */
@Repository
public interface noticiaRepositorio extends JpaRepository <Noticia,String> {
    
}
