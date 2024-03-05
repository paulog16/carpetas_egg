/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.Cliente;
import libreria.entidades.Prestamo;

/**
 *
 * @author pguid
 */
public class prestamoDAO extends DAO {

    public void guardar(Prestamo prestamo) {

        super.guardar(prestamo);

    }

    public void modificar(Prestamo prestamo) {

        super.editar(prestamo);

    }

    public void eliminar(String id) {
        Prestamo PrestamoEliminado = busquedaPorCodigo(id);
        super.eliminar(PrestamoEliminado);
    }

    public Prestamo busquedaPorCodigo(String id) {

        super.conectar();
        Prestamo prestamo = em.find(Prestamo.class, id);
        super.desconectar();
        return prestamo;
    }

    public Prestamo buscarPrestamoXcliente(String id) {
        conectar();

        Prestamo prestamo = em.createQuery("SELECT p FROM Prestamo p WHERE p.id=:id", Prestamo.class)
                .setParameter("id", id).getSingleResult();
        desconectar();
        return prestamo;
    }

    public List<Prestamo> buscarPrestamoXlibro(String Nombre) {
        conectar();

        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p  WHERE p.nombre like :nombre")
                .setParameter("nombre", Nombre).getResultList();
        desconectar();
        return prestamos;

    }

}
