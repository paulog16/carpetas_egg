/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.autor;

/**
 *
 * @author pguid
 */
public class autorDAO extends DAO {

    public void guardarAutor(autor autor) {

        super.guardar(autor);

    }

    public void modificarAutor(autor autor) {

        super.editar(autor);

    }

    public void eliminarAutor(String id) {
        autor autorEliminado = busquedaPorCodigoAutor(id);
        System.out.println(autorEliminado.getId());
        super.eliminar(autorEliminado);
    }

    public autor busquedaPorCodigoAutor(String id) {

        super.conectar();
        autor autor = em.find(autor.class, id);
        super.desconectar();
        return autor;
    }

    public autor buscarAutorPorNombre(String Nombre) {
        conectar();
 
        autor autores = em.createQuery("SELECT a FROM autor a where a.nombre = :nombre ", autor.class)
                .setParameter("nombre", Nombre).getSingleResult();
        desconectar();
        return autores;
    }

}
