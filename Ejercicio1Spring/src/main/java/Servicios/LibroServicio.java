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
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorios.AutorRepository;
import repositorios.EditorialRepositorio;
import repositorios.LibroRepositorio;

/**
 *
 * @author pguid
 */
@Service
public class LibroServicio {

    @Autowired
    LibroRepositorio libroR;
    @Autowired
    AutorRepository autorR;
    @Autowired
    EditorialRepositorio editorialR;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws miException {

        validacion(isbn, titulo, ejemplares, idAutor, idEditorial);
        Autor autor = autorR.findById(idAutor).get();
        Editorial editorial = editorialR.findById(idEditorial).get();
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libroR.save(libro);

    }

    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList();
        libros = libroR.findAll();
        return libros;
    }

    public void modificarLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws miException {
        validacion(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Libro> respuesta = libroR.findById(isbn);
        Optional<Autor> respuestaAutor = autorR.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialR.findById(idEditorial);

        Autor autor = new Autor();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        Editorial editorial = new Editorial();
        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libroR.save(libro);
        }

    }

    private void validacion(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws miException {
        if (isbn == null) {
            throw new miException("el isbn no puede ser nulo");
        }
        if (titulo == null) {
            throw new miException("el titulo no puede ser nulo");
        }
        if (ejemplares == null) {
            throw new miException("los ejemplares no puede ser nulo");
        }
        if (idAutor == null) {
            throw new miException("el idAutor no puede ser nulo");
        }
        if (idEditorial == null) {
            throw new miException("el idEditorial no puede ser nulo");
        }
    }

}
