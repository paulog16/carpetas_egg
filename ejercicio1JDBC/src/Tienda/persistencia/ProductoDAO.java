/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.persistencia;

import Tienda.entidades.Fabricante;
import Tienda.entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author pguid
 */
public final class ProductoDAO extends DAO {

    Fabricante fabricante = new Fabricante();

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto incorrecto");

            }
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)"
                    + "VALUES ( " + producto.getCodigo() + ",'"
                    + producto.getNombre() + "'," + producto.getPrecio() + ","
                    + producto.getCodigoFabricante() + " );";
            modificarInsertarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("el producto que desea modificar no existe");
            }
            String sql = "UPDATE producto SET "
                    + "nombre='" + producto.getNombre() + "', "
                    + "precio=" + producto.getPrecio() + ", "
                    + "codigo_fabricante=" + producto.getCodigoFabricante()
                    + " WHERE codigo=" + producto.getCodigo() + ";";
            modificarInsertarEliminar(sql);
        } catch (Exception e) {
            throw e;

        } finally {
            desconectarBase();
        }

    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE codigo= " + codigo + "";
            modificarInsertarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarNombres() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto";

            consultar(sql);

            Producto producto = null;
            Collection<Producto> Productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                Productos.add(producto);

            }
            desconectarBase();
            return Productos;
        } catch (Exception e) {
            super.desconectarBase();
            throw e;
        }

    }

    public Collection<Producto> listarNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM Producto";
            super.consultar(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);

            }
            super.desconectarBase();
            return productos;
        } catch (Exception e) {
            super.desconectarBase();
            throw e;

        }
    }

    public Collection<Producto> ProductosPorRangos(int min,int max) throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM Producto WHERE precio between "+min+" and "+max+" ORDER BY PRECIO;";
            super.consultar(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);

            }
            super.desconectarBase();
            return productos;
        } catch (Exception e) {
            super.desconectarBase();
            throw e;

        }

    }

    public Collection<Producto> ListaPortatiles(String opcion) throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM Producto WHERE  nombre like '%"+opcion+"%';";
            super.consultar(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);

            }
            super.desconectarBase();
            return productos;
        } catch (Exception e) {
            super.desconectarBase();
            throw e;

        }
    }

    public Collection<Producto> ProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM Producto WHERE precio=(SELECT min(precio) from Producto)";
            super.consultar(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);

            }
            super.desconectarBase();
            return productos;
        } catch (Exception e) {
            super.desconectarBase();
            throw e;

        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {
            Producto pr = null;
            String sql = "SELECT * FROM producto WHERE codigo=" + codigo + " ";

            super.consultar(sql);
            while (resultado.next()) {
                pr = new Producto();
                pr.setNombre(resultado.getString(1));
                pr.setPrecio(resultado.getDouble(2));
                pr.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return pr;
        } catch (Exception e) {
            throw e;
        }

    }

}
