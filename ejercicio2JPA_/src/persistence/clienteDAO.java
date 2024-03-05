/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.Cliente;


/**
 *
 * @author pguid
 */
public class clienteDAO extends DAO {

    public void guardar(Cliente cliente) {

        super.guardar(cliente);

    }

    public void modificar(Cliente cliente) {

        super.editar(cliente);

    }

    public void eliminar(String id) {
        Cliente clienteEliminado = busquedaPorCodigo(id);
        super.eliminar(clienteEliminado);
    }

    public Cliente busquedaPorCodigo(String id) {

        super.conectar();
        Cliente cliente = em.find(Cliente.class, id);
        super.desconectar();
        return cliente;
    }

     public Cliente buscarClientePorNombre(String nombre) {
        conectar();
       
        Cliente clientes = em.createQuery("SELECT c FROM cliente c where c.nombre= :nombre ",Cliente.class)
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return clientes;

    }
     public Cliente buscarClientePorId(String id){
         conectar();
         Cliente cliente= em.createQuery("SELECT c FROM Cliente c where c.id=:id",Cliente.class)
                 .setParameter("id", id).getSingleResult();
         desconectar();
         return cliente;
     }
     
     
        public List<Cliente> buscarClientePorCoincidencia(String nombre) {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM cliente c where c.nombre like :nombre " )
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return clientes;

    }
      
     
     
     
      
}
