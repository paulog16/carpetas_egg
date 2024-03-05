/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import excepciones.miException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import repositorios.EditorialRepositorio;

/**
 *
 * @author pguid
 */
@Service
public class EditorialServicio {

    EditorialRepositorio editorialR;

    @Transactional
    public void crearEditorial(String nombre) throws miException {
        validacion(nombre);
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorialR.save(editorial);
    }

    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialR.findAll();
        return editoriales;
    }

    public void modificarAutor(String nombre, String id) {
        Optional<Editorial> respuesta = editorialR.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialR.save(editorial);
        }
    }

    private void validacion(String nombre) throws miException {
        if (nombre == null) {
            throw new miException("el nombre no puede ser nulo");
        }

    }
}
