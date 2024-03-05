/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import libreria.entidades.editorial;

/**
 *
 * @author pguid
 */
public class editorialDAO extends DAO{
    
    
    public void guardarEditorial(editorial editorial) {

        super.guardar(editorial);

    }

    public void modificarEditorial(editorial editorial) {
       
        super.editar(editorial);

    }

    public void eliminarEditorial(String id) {
        editorial editorialEliminado = busquedaPorCodigoEditorial(id);
        super.eliminar(editorialEliminado);
    }

    public editorial busquedaPorCodigoEditorial(String id) {

        super.conectar();
        editorial editorial = em.find(editorial.class, id);
        super.desconectar();
        return editorial;
    }
    
}
