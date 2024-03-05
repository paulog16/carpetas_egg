/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.libro;

/**
 *
 * @author pguid
 */
public class libroDAO extends DAO<libro> {

    @Override
    public void guardar(libro libro) {

        super.guardar(libro);

    }

    public void modificar(libro libro) {   
      
        super.editar(libro);

    }

    public void eliminar(String id) {
        libro libroEliminado = busquedaPorCodigo(id);
        super.eliminar(libroEliminado);
    }

    public libro busquedaPorCodigo(String id) {

        super.conectar();
        libro libro = em.find(libro.class, id);
        super.desconectar();
        return libro;
    }

    public libro buscarLibroPorIsbn(String isbn) {
        conectar();
   
        libro libro = em.createQuery("SELECT l FROM libro l where l.isbn= :isbn ",libro.class)
                .setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }

    public List<libro> buscarLibroPorTitulo(String titulo) {
        conectar();
   
        List<libro> libros = em.createQuery("SELECT t FROM libro t where t.titulo= :titulo ")
                .setParameter("titulo", titulo).getResultList();
        desconectar();
        return libros;

    }
    public List<libro> buscarLibroPorNombreAutor(String nombre) {
        conectar();
       
        List<libro> libros = em.createQuery("SELECT l FROM libro l join l.autor a where a.nombre= :nombre ")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;

    }
     public List<libro> buscarLibroPorNombreEditorial(String nombre) {
        conectar();
       
        List<libro> libros = em.createQuery("SELECT l FROM libro l join l.editorial e where e.nombre= :nombre ")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;

    }

  
    
    
    
}
