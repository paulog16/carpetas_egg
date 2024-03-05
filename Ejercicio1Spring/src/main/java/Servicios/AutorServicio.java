/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Autor;
import excepciones.miException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import repositorios.AutorRepository;

/**
 *
 * @author pguid
 */
@Service
public class AutorServicio {

    AutorRepository autorR;

    @Transactional
    public void crearAutor(String nombre)throws miException {
        validacion(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorR.save(autor);
    }

    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorR.findAll();
        return autores;
    }
    public void modificarAutor(String nombre,String id){
     Optional<Autor>respuesta=autorR.findById(id);
     if(respuesta.isPresent()){
         Autor autor=respuesta.get();
         autor.setNombre(nombre);
         autorR.save(autor);
     }
    }
    private void validacion(String nombre) throws miException{
        if(nombre==null){
            throw new miException("el nombre no puede ser nulo");
        }
      
    }
}
