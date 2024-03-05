/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.entidades.Producto;
import Tienda.persistencia.DAO;
import Tienda.persistencia.FabricanteDAO;
import Tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class ProductoService extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ProductoDAO dao;
    private final FabricanteDAO dao2;

    public ProductoService() {

        this.dao = new ProductoDAO();
        this.dao2 = new FabricanteDAO();

    }

    public void crearProducto() throws Exception {

        Producto producto = new Producto();

        System.out.println("ingrese codigo");
        producto.setCodigo(leer.nextInt());

        System.out.println("ingrese nombre del producto");
        producto.setNombre(leer.next());

        System.out.println("ingrese precio del producto");
        producto.setPrecio(leer.nextDouble());

        System.out.println("ingrese codigo del fabricante");
        producto.setCodigoFabricante(leer.nextInt());

        try {

            //validacion de datos
            if (producto.getCodigo() < 0) {
                throw new Exception("el codigo debe ser positivo");
            }
            if (producto.getNombre().length() < 1) {
                throw new Exception("El nombre no puede tener menos de 1 caracter");
            }
            if (producto.getPrecio() < 0) {
                throw new Exception("el precio no puede ser negativo");
            }

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }

    }

    public void crearFabricante() throws Exception {
        Fabricante fabricante = new Fabricante();

        System.out.println("ingrese codigo");
        fabricante.setCodigo(leer.nextInt());

        System.out.println("ingrese nombre del fabricante");
        fabricante.setNombre(leer.next());

        try {
            //validacion de datos
            if (fabricante.getCodigo() < 0) {
                throw new Exception("el codigo debe ser positivo");
            }
            if (fabricante.getNombre().length() < 1) {
                throw new Exception("El nombre no puede tener menos de 1 caracter");
            }

            dao2.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarProducto() throws Exception {

        System.out.println("ingrese nombre nuevo");
        String nombreNuevo = leer.next();
        System.out.println("ingrese precio nuevo");
        Double precioNuevo = leer.nextDouble();
        System.out.println("ingrese codigo_fabricante");
        Integer nuevoCodigoF = leer.nextInt();
        try {
            if (nombreNuevo.length() < 1) {
                throw new Exception("el nombre tiene que tener mas de un caracter");

            }
            if (precioNuevo < 0) {
                throw new Exception("el precio tiene que ser positivo");
            }
            if (nuevoCodigoF == null) {
                throw new Exception("el codigo nuevo no puede ser nulo");
            }

            Producto prod = buscarProductoPorCodigo2();

            prod.setNombre(nombreNuevo);
            prod.setPrecio(precioNuevo);
            prod.setCodigoFabricante(nuevoCodigoF);
            dao.modificarProducto(prod);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto() throws Exception {
        System.out.println("ingrese codigo del producto a buscar para eliminar");
        int cod = leer.nextInt();
        try {
            if (cod < 0) {
                throw new Exception("el precio tiene que ser positivo");
            }
            dao.eliminarProducto(cod);
        } catch (Exception e) {
            throw e;
        }

    }

    public Producto buscarProductoPorCodigo2() throws Exception {

        System.out.println("ingrese codigo del producto a buscar");
        int cod = leer.nextInt();
        try {
            if (cod < 0) {
                throw new Exception("el codigo no puede ser negativo");
            }
            Producto producto = dao.buscarProductoPorCodigo(cod);
            producto.setCodigo(cod);
            return producto;

        } catch (Exception e) {
            throw e;
        }

    }

    public void listaNombresProductos() throws Exception {
        try {
            Collection<Producto> listarXnombres = dao.listarNombres();
            System.out.println("----buscando los productos de la lista----");
            if (listarXnombres.isEmpty()) {
                throw new Exception("La lista que desea no tiene ningun producto");
            } else {
                System.out.println("---Lista---");
                for (Producto aux : listarXnombres) {
                    System.out.println(aux.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void listaNombreYPrecio() throws Exception {
        try {
            Collection<Producto> listarXnombresyPrecio = dao.listarNombrePrecio();
            System.out.println("----buscando los productos de la lista----");
            if (listarXnombresyPrecio.isEmpty()) {
                throw new Exception("La lista que desea no tiene ningun producto");
            } else {
                System.out.println("---Lista---");
                for (Producto aux : listarXnombresyPrecio) {

                    System.out.println(aux.getNombre() + " | " + "$" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void listarNombrePorMinYMax() throws Exception {

        System.out.println("ingrese numMinimo");
        int numMinimo = leer.nextInt();
        System.out.println("ingrese numMax");
        int numMax = leer.nextInt();
        try {
           
            if (numMinimo < 0) {
                throw new Exception("el minimo no puede ser negativo");
            }
            if (numMax < 0) {
                throw new Exception("el maximo no puede ser negativo");
            }
 Collection<Producto> listarXRango = dao.ProductosPorRangos(numMinimo, numMax);
            if (listarXRango.isEmpty()) {
                throw new Exception("La lista que desea no tiene ningun producto");
            } else {
                System.out.println("---Lista---");
                for (Producto aux : listarXRango) {

                    System.out.println(aux.getNombre() + " | " + "$" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void listarNombrePorOpcion() throws Exception {

        System.out.println("ingrese producto por opcion");
        String opcion=leer.next();
        try {
     if(opcion.length()<0 ){
         System.out.println("la opcion debe tener mas de un caracter");
     }
 Collection<Producto> listarXOpcion = dao.ListaPortatiles(opcion);
            if (listarXOpcion.isEmpty()) {
                throw new Exception("La lista que desea no tiene ningun producto");
            } else {
                System.out.println("---Lista---");
                for (Producto aux : listarXOpcion) {

                    System.out.println(aux.getNombre() + " | " + "$" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
       public void listaNombreYPrecioMasBarato() throws Exception {
        try {
            Collection<Producto> listarXnombresyPrecioMasBarato = dao.ProductoMasBarato();
            System.out.println("----buscando los productos de la lista----");
            if (listarXnombresyPrecioMasBarato.isEmpty()) {
                throw new Exception("La lista que desea no tiene ningun producto");
            } else {
                System.out.println("---Lista---");
                for (Producto aux : listarXnombresyPrecioMasBarato) {

                    System.out.println(aux.getNombre() + " | " + "$" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
    
    
}
