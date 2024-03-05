/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.autor;
import libreria.entidades.editorial;
import libreria.entidades.libro;
import persistence.autorDAO;
import persistence.editorialDAO;
import persistence.libroDAO;

/**
 *
 * @author pguid
 */
public class LibreriaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final libroDAO dao;
    private final autorDAO dao2;
    private final editorialDAO dao3;

    public LibreriaServicio() {

        this.dao = new libroDAO();
        this.dao2 = new autorDAO();
        this.dao3 = new editorialDAO();

    }

    //GuardarModificarEliminar Libro
    public void guardarLibro() throws Exception {
      
        try {
              libro libro = new libro();
            System.out.println("ingrese el isbn del libro");
            libro.setIsbn(leer.next());
            System.out.println("ingrese el titulo del libro");
            libro.setTitulo(leer.next());
            System.out.println("ingrese el año del libro");
            libro.setAnio(leer.nextInt());
            System.out.println("ingrese el numero de ejemplares");
            libro.setEjemplares(leer.nextInt());
            System.out.println("ingrese el numero de ejemplares prestados");
            libro.setEjemplaresPrestados(leer.nextInt());
          libro.setEjemplaresRestantes(libro.getEjemplares()-libro.getEjemplaresPrestados());
            System.out.println("los ejemplares restantes son: "+libro.getEjemplaresRestantes());
            System.out.println("ingrese si esta alt, si ingresa s es true sino false");
            libro.setAlta(leer.next().equalsIgnoreCase("s"));
            System.out.println("ingrese id del autor");
            String idAutor = leer.next();
            System.out.println("ingresar id de la editorial");
            String idEditorial = leer.next();

            if (libro.getIsbn() == null) {
                throw new Exception("el isbn no puede ser nulo");

            }
            if (libro.getTitulo().length() < 3) {
                throw new Exception("el titulo no puede tener menos de 3 caracteres");
            }
            if (libro.getAnio() < 3) {
                throw new Exception("el año no puede ser menor de 3 ");
            }
//            if (libro.getEjemplares() < 3) {
//                throw new Exception("el numero de ejemplares no puede ser menos de 3");
//            }
//            if (libro.getEjemplaresPrestados() < 1) {
//                throw new Exception("el numero de ejemplares prestados no puede ser menor de 1");
//            }
//            if (libro.getEjemplaresRestantes() < 1) {
//                throw new Exception("el numero de ejemplares restantes no puede ser menor de 1");
//            }

            autor autor = dao2.busquedaPorCodigoAutor(idAutor);
            editorial editorial = dao3.busquedaPorCodigoEditorial(idEditorial);

            if (idAutor == null || !libro.isAlta()) {
                throw new Exception("el id no puede ser nulo");
            } else {
                libro.setAutor(autor);
            }
            if (idEditorial == null || !libro.isAlta()) {
                throw new Exception("el id no puede ser nulo y tinene que estar de alta");
            } else {
                libro.setEditorial(editorial);
            }

            dao.guardar(libro);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarLibro() {
        try {
            libro libr = buscarLibroPorId();

            System.out.println("ingrese el isbn del libro");
            String isbnNuevo = leer.next();
            System.out.println("ingrese el titulo del libro");
            String tituloNuevo = leer.next();
            System.out.println("ingrese el año del libro");
            Integer anioNuevo = leer.nextInt();
            System.out.println("ingrese el numero de ejemplares");
            Integer ejermplaresNuevo = leer.nextInt();
            System.out.println("ingrese el numero de ejemplares prestados");
            Integer ejermplaresPrestadosNuevo = leer.nextInt();
            System.out.println("ingrese el numero de ejemplares restantes");
            Integer ejemplaresRestantes = leer.nextInt();
            System.out.println("ingrese si esta alt, si ingresa s es true sino false");
            boolean altaNuevo = leer.next().equalsIgnoreCase("s");

            if (tituloNuevo.length() < 0) {
                throw new Exception("el nombre tiene que tener mas de un caracter");
            }

            libr.setIsbn(isbnNuevo);
            libr.setTitulo(tituloNuevo);
            libr.setAnio(anioNuevo);
            libr.setEjemplares(ejermplaresNuevo);
            libr.setEjemplaresPrestados(ejermplaresPrestadosNuevo);
            libr.setEjemplaresRestantes(ejemplaresRestantes);
            libr.setAlta(altaNuevo);

            dao.modificar(libr);

        } catch (Exception e) {
        }

    }

    public void eliminarLibro() throws Exception {
        try {
            System.out.println("ingrese codigo del libro a eliminar");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            dao.eliminar(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public libro buscarLibroPorId() throws Exception {

        try {
            System.out.println("ingrese el codigo a buscar del producto a buscar");
            String id = leer.next();

            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
//            libro libro = dao.busquedaPorCodigo(id);
//            libro.setId(id);
            return null;
        } catch (Exception e) {
            throw e;
        }

    }

//    GuardarmodificareliminarAutor
    public void guardarAutor() throws Exception {
        autor autor = new autor();

        try {

            System.out.println("ingrese nombre del autor");
            autor.setNombre(leer.next());
            System.out.println("ingrese si esta dado de alta: s(si)");
            autor.setAlta(leer.next().equalsIgnoreCase("s"));
            if (autor.getNombre().length() < 0) {
                throw new Exception("el nombre no puede ser negativo ");
            }
            dao2.guardarAutor(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarAutor() throws Exception {
        try {
            System.out.println("ingrese nombre nuevo");
            String nombreNuevo = leer.next();
            System.out.println("indique si esta de alta");
            boolean altaNuevo = leer.next().equalsIgnoreCase("s");

            if (nombreNuevo.length() < 0) {
                throw new Exception("el nombre tiene que tener mas de 0 caracteres");
            }
            autor autorModificado = buscarAutorPorId();
            autorModificado.setNombre(nombreNuevo);
            autorModificado.isAlta();
            dao2.modificarAutor(autorModificado);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean eliminarAutor() throws Exception {

        try {
            System.out.println("ingrese el codigo a buscar del autor");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");

            }
//           autor autor = buscarAutorPorId();
//            dao2.eliminarAutor(id);
            dao2.eliminarAutor(id);
            return true;

        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
    }

    public autor buscarAutorPorId() throws Exception {

        try {
            System.out.println("ingrese el codigo a buscar del autor");
            String id = leer.next();

            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            autor autor = dao2.busquedaPorCodigoAutor(id);
            autor.setId(id);
            return autor;
        } catch (Exception e) {
            throw e;
        }

    }

//    GuardarModificarEliminarEditorial
    public void guardarEditorial() {

        try {
            editorial editorial = new editorial();

            System.out.println("ingrese nombre de la editorial");
            editorial.setNombre(leer.next());
            System.out.println("ingrese si esta dado de alta: s(si)");
            editorial.setAlta(leer.next().equalsIgnoreCase("s"));
            if (editorial.getNombre().length() < 0) {
                throw new Exception("el nombre no puede ser negativo ");
            }
            dao3.guardarEditorial(editorial);
        } catch (Exception e) {
        }
    }

    public void modificarEditorial() throws Exception {
        try {
            System.out.println("ingrese nombre nuevo");
            String nombreNuevo = leer.next();
            System.out.println("indique si esta de alta");
            boolean altaNuevo = leer.next().equalsIgnoreCase("s");

            if (nombreNuevo.length() < 0) {
                throw new Exception("el nombre tiene que tener mas de 0 caracteres");
            }
            editorial editorial = buscarEditorialPorId();
            editorial.setNombre(nombreNuevo);
            editorial.isAlta();
            dao3.modificarEditorial(editorial);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarEditorial() throws Exception {

        try {
            System.out.println("ingrese id del autor a eliminar");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            dao3.eliminarEditorial(id);

        } catch (Exception e) {
            throw e;
        }
    }

    public editorial buscarEditorialPorId() throws Exception {

        try {
            System.out.println("ingrese el codigo a buscar de la editorial a buscar");
            String id = leer.next();

            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            editorial editorial = dao3.busquedaPorCodigoEditorial(id);
            editorial.setId(id);
            return editorial;
        } catch (Exception e) {
            throw e;
        }

    }

    //ConsultasLIbro
    public void buscarLibroPorAutor() {
        try {
            System.out.println("ingrese nombre del autor");
            String nombre = leer.next();
            if (nombre == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            Collection<libro> listaPorAutor = dao.buscarLibroPorNombreAutor(nombre);
            if (listaPorAutor.isEmpty()) {
                throw new Exception("la lista esta vacia");
            } else {
                for (libro aux : listaPorAutor) {

                    System.out.println("ID: " + aux.getId());
                    System.out.println("Titulo : " + aux.getTitulo());
                    System.out.println("Año : " + aux.getAnio());
                    System.out.println("Nombre Autor: " + aux.getAutor().getNombre());
                    System.out.println("Nombre Editorial: " + aux.getEditorial().getNombre());
                    System.out.println("Ejemplares: " + aux.getEjemplares());
                    System.out.println("Ejemplares Prestados: " + aux.getEjemplaresPrestados());
                    System.out.println("Ejemplares Restados : " + aux.getEjemplaresRestantes());
                    System.out.println("");
                }
            }
        } catch (Exception e) {
        }
    }

    public void buscarLibroPorIsbn() {
        try {
            System.out.println("ingrese numero de isbn");
            String isbn = leer.next();

            if (isbn == null) {
                throw new Exception("el isbn no puede ser nulo");
            }

            libro libro = dao.buscarLibroPorIsbn(isbn);

            System.out.println("ID: " + libro.getId());
            System.out.println("Titulo : " + libro.getTitulo());
            System.out.println("Año : " + libro.getAnio());
            System.out.println("Nombre Autor: " + libro.getAutor().getNombre());
            System.out.println("Nombre Editorial: " + libro.getEditorial().getNombre());
            System.out.println("Ejemplares: " + libro.getEjemplares());
            System.out.println("Ejemplares Prestados: " + libro.getEjemplaresPrestados());
            System.out.println("Ejemplares Restados : " + libro.getEjemplaresRestantes());
            System.out.println("");

        } catch (Exception e) {
        }
    }

    public void buscarLibroPorTitulo() throws Exception {
        try {
            System.out.println("ingrese nombre de titulo");
            String titulo = leer.next();
            if (titulo == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            Collection<libro> listaPorTitulo = dao.buscarLibroPorTitulo(titulo);
            if (listaPorTitulo.isEmpty()) {
                throw new Exception("la lista esta vacia");
            } else {
                for (libro aux : listaPorTitulo) {

                    System.out.println("ID: " + aux.getId());
                    System.out.println("Titulo : " + aux.getTitulo());
                    System.out.println("Año : " + aux.getAnio());
                    System.out.println("Nombre Autor: " + aux.getAutor().getNombre());
                    System.out.println("Nombre Editorial: " + aux.getEditorial().getNombre());
                    System.out.println("Ejemplares: " + aux.getEjemplares());
                    System.out.println("Ejemplares Prestados: " + aux.getEjemplaresPrestados());
                    System.out.println("Ejemplares Restados : " + aux.getEjemplaresRestantes());
                    System.out.println("");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroPorEditorial() throws Exception {
        try {
            System.out.println("ingrese nombre de editorial");
            String editorial = leer.next();
            if (editorial == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            Collection<libro> listaPorEditorial = dao.buscarLibroPorNombreEditorial(editorial);
            if (listaPorEditorial.isEmpty()) {
                throw new Exception("la lista esta vacia");
            } else {
                for (libro aux : listaPorEditorial) {

                    System.out.println("ID: " + aux.getId());
                    System.out.println("Titulo : " + aux.getTitulo());
                    System.out.println("Año : " + aux.getAnio());
                    System.out.println("Nombre Autor: " + aux.getAutor().getNombre());
                    System.out.println("Nombre Editorial: " + aux.getEditorial().getNombre());
                    System.out.println("Ejemplares: " + aux.getEjemplares());
                    System.out.println("Ejemplares Prestados: " + aux.getEjemplaresPrestados());
                    System.out.println("Ejemplares Restados : " + aux.getEjemplaresRestantes());
                    System.out.println("");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    //consultaAutor
    public void buscarAutorXNombre() {
        try {
            System.out.println("ingrese nombre Autor");
            String nombre = leer.next();
            if (nombre == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            autor autor = dao2.buscarAutorPorNombre(nombre);

            System.out.println("id: " + autor.getId());
            System.out.println("nombre: " + autor.getNombre());

        } catch (Exception e) {
        }
    }
}
