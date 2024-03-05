/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Prestamo;
import libreria.entidades.autor;
import libreria.entidades.editorial;
import libreria.entidades.libro;
import persistence.autorDAO;
import persistence.clienteDAO;
import persistence.editorialDAO;
import persistence.libroDAO;
import persistence.prestamoDAO;

/**
 *
 * @author pguid
 */
public class LibreriaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final libroDAO dao;
    private final autorDAO dao2;
    private final editorialDAO dao3;
    private final clienteDAO dao4;
    private prestamoDAO dao5;

    public LibreriaServicio() {

        this.dao = new libroDAO();
        this.dao2 = new autorDAO();
        this.dao3 = new editorialDAO();
        this.dao4 = new clienteDAO();
        this.dao5 = new prestamoDAO();
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
            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
            System.out.println("los ejemplares restantes son: " + libro.getEjemplaresRestantes());
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

    public void guardarCliente() throws Exception {
        try {
            Cliente cliente = new Cliente();
            System.out.println("ingrese documento");
            Integer dc = leer.nextInt();
            System.out.println("ingrese nombre");
            String nombre = leer.next();
            System.out.println("ingrese apellido");
            String apellido = leer.next();
            System.out.println("ingrese telefono");
            String telefono = leer.next();
            if (dc < 2) {
                throw new Exception("el documento no puede ser menor de 2");
            }

            if (nombre == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            if (apellido.length() < 0) {
                throw new Exception("el apellido no puede ser negativo ");
            }
            if (telefono == null) {
                throw new Exception("el telefono no puede ser nulo");
            }
            cliente.setDocumento(dc);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            dao4.guardar(cliente);

        } catch (Exception e) {
            throw e;

        }
    }

    public void modificarCliente() throws Exception {
        try {
            Cliente clienteModificado = buscarClientePorId();
            System.out.println("INGRESE LOS NUEVOS DATOS");
            System.out.println("ingrese nombre nuevo");
            String nombreNuevo = leer.next();
            if (nombreNuevo.length() < 0) {
                throw new Exception("el nombre tiene que tener mas de 0 caracteres");
            }
            System.out.println("ingrese el apellido nuevo");
            String apellidoNuevo = leer.next();
            if (apellidoNuevo.length() < 0) {
                throw new Exception("el nombre tiene que tener mas de 0 caracteres");
            }
            System.out.println("ingrese el DNI nuevo");
            Integer dniNuevo = leer.nextInt();

            if (dniNuevo == null) {
                throw new Exception("el documento no puede ser nulo ");
            }
            System.out.println("ingrese el telefono nuevo");
            String telefonoNuevo = leer.next();
            if (telefonoNuevo == null) {
                throw new Exception("el telefono no puede ser nulo ");
            }
            clienteModificado.setNombre(nombreNuevo);
            clienteModificado.setApellido(apellidoNuevo);
            clienteModificado.setDocumento(dniNuevo);
            clienteModificado.setTelefono(apellidoNuevo);
            dao4.modificar(clienteModificado);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarCliente() throws Exception {
        try {
            System.out.println("ingrese codigo del autor a eliminar");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            dao4.eliminar(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public Cliente buscarClientePorId() throws Exception {
        try {
            System.out.println("ingrese el codigo a buscar del autor  buscar");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            Cliente c1 = dao4.buscarClientePorId(id);
            c1.setId(id);
            return c1;
        } catch (Exception e) {
            throw e;
        }
    }

    public void BusquedaClienteXnombre() throws Exception {
        try {
            System.out.println("ingrese el nombre que desea buscar");
            String Nombre = leer.next();
            if (Nombre == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            Cliente cliente = dao4.buscarClientePorNombre(Nombre);
            System.out.println("----buscando los libros ----");

            System.out.println("id: " + cliente.getId());
            System.out.println("nombre: " + cliente.getNombre());
        } catch (Exception e) {
            throw e;
        }
    }

    public void BusquedaClienteXid() throws Exception {
        try {
            System.out.println("ingrese el id del cliente que desea buscar");
            String ID = leer.next();
            if (ID == null) {
                throw new Exception("el id no puede ser nulo");
            }
            Cliente cliente = dao4.buscarClientePorId(ID);
            System.out.println("----buscando los libros ----");

            System.out.println("id: " + cliente.getId());
            System.out.println("nombre: " + cliente.getNombre());
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

    //registro de un libro 
//    public void cargarlibro() {
//
//        do {
//            l1 = new Libro();
//
//            System.out.println("Ingrese el nombre del Libro ");
//            l1.setTituloLibro(leer.next());
//            System.out.println("Ingrese el autor del Libro ");
//            l1.setAutor(leer.next());
//
//            System.out.println("Ingrese los numeros de ejemplares del Libro ");
//            l1.setNumEjemplares(leer.nextInt());
//            System.out.println("Ingrese los numeros de ejemplares prestados ");
//            l1.setNumEjemplaresPrestados(leer.nextInt());
//
//            libros.add(l1);
//            System.out.println("Desea crear otro Libro ? (s/n)");
//
//        } while (leer.next().equalsIgnoreCase("s"));
//
//    }
    public void crearPrestamo() throws Exception {
        try {

            SimpleDateFormat fechas = new SimpleDateFormat("dd/mm/yyyy");
            Prestamo pres = new Prestamo();
            System.out.println("ingrese fecha de prestamo");
            String fecha = leer.next();
            System.out.println("ingrese la fecha de devolucion");
            String fecha2 = leer.next();
            System.out.println("indique el id de libro");
            String id = leer.next();
            System.out.println("ingrese el id de cliente");
            String idC = leer.next();

            if (fecha == null) {
                throw new Exception("la fecha no puede ser nula");
            }
            if (fecha2 == null) {
                throw new Exception("la fecha de devolucion no puede ser nulo");
            }

            Date fechaInicio = fechas.parse(fecha);
            Date fechaDevolucion = fechas.parse(fecha2);

            libro libro = dao.busquedaPorCodigo(id);
            Cliente cliente = dao4.buscarClientePorId(idC);
            pres.setFechaPrestamo(fechaInicio);
            pres.setFechaDevolucion(fechaDevolucion);
            pres.setCliente(cliente);
            pres.setLibro(libro);
            dao5.guardar(pres);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrestamo() throws Exception {

        try {
            System.out.println("Ingrese el id del prestamo que desea modificar");
            String prestamoBusqueda = leer.next();
            if (prestamoBusqueda == null) {
                throw new Exception("el id no puede ser nulo");
            }
            Prestamo prestamoModificado = dao5.busquedaPorCodigo(prestamoBusqueda);
            if (prestamoModificado == null) {
                throw new Exception("el id no se encuentra en la base de datos");
            }
            int opcion = 0;
            do {
                System.out.println("--------------------------");
                System.out.println("|   MENU DE MODIFICACION  |");
                System.out.println("--------------------------");
                System.out.println("");
                System.out.println("1- Modificar fecha de prestamo");
                System.out.println("2- Modificar fecha de devolucion");
                System.out.println("3- modificar Libro");
                System.out.println("4- modificar Cliente");
                System.out.println("5- SALIR");
                System.out.println("");
                System.out.println("Elija una opcion: ");

                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("ingrese la nueva fecha del prestamo");
                        String fechaNueva = leer.next();
                        if (fechaNueva == null) {
                            throw new Exception("la fecha no puede ser nula ");
                        }
                        SimpleDateFormat fecha = new SimpleDateFormat();

                        Date fechaInicio = fecha.parse(fechaNueva);
                        prestamoModificado.setFechaPrestamo(fechaInicio);
                        if (fechaInicio.compareTo(prestamoModificado.getFechaPrestamo()) < 0) {
                            throw new Exception("Error al asignar fechas, la fecha final debe ser posterior a la fecha inicio.");
                        }
                        break;
                    case 2:
                        System.out.println("ingrese la nueva fecha de devolucion");
                        String FechaNueva = leer.next();
                        if (FechaNueva == null) {
                            throw new Exception("la fecha no puede ser nula ");
                        }
                        SimpleDateFormat fecha2 = new SimpleDateFormat("dd/mm/yyyy");

                        Date fechaDevolucion = fecha2.parse(FechaNueva);
                        prestamoModificado.setFechaPrestamo(fechaDevolucion);
                        if (fechaDevolucion.compareTo(prestamoModificado.getFechaDevolucion()) < 0) {
                            throw new Exception("Error al asignar fechas, la fecha final debe ser posterior a la fecha inicio.");
                        }
                        break;
                    case 3:
                        System.out.println("ingrese el ISBN del nuevo libro");
                        String LibroBusqueda = leer.next();
                        if (LibroBusqueda == null) {
                            throw new Exception("el isbn no puede ser nulo");
                        }
                        libro libroNuevo = dao.buscarLibroPorIsbn(LibroBusqueda);
                        if (libroNuevo == null) {
                            throw new Exception("el isbn no puede ser nulo");
                        }
                        prestamoModificado.setLibro(libroNuevo);
                        break;
                    case 4:
                        System.out.println("ingrese el id del nuevo cliente");
                        String clienteBusqueda = leer.next();
                        if (clienteBusqueda == null) {
                            throw new Exception("el id no puede ser nulo");
                        }
                        Cliente clienteNuevo = dao4.buscarClientePorId(clienteBusqueda);
                        if (clienteNuevo == null) {
                            throw new Exception("el id no puede ser nulo");
                        }
                        prestamoModificado.setCliente(clienteNuevo);
                }
                dao5.modificar(prestamoModificado);
            } while (opcion != 5);

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarPrestamo() throws Exception {
        try {

            Prestamo prestamo1 = buscarPrestamoPorId();
            if (prestamo1 == null) {
                throw new Exception("no se encontro el prestamo ");
            }

            String id = prestamo1.getId();

            libro l = prestamo1.getLibro();

            Integer result = l.getEjemplaresRestantes() + 1;
            Integer result2 = l.getEjemplaresPrestados() - 1;

            l.setEjemplaresRestantes(result);
            l.setEjemplaresPrestados(result2);

            dao5.eliminar(id);

        } catch (Exception e) {
            throw e;

        }
    }

    public Prestamo buscarPrestamoPorId() throws Exception {
        try {
            System.out.println("ingrese el codigo del prestamo a buscar");
            String id = leer.next();
            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }
            Prestamo p1 = dao5.busquedaPorCodigo(id);

            return p1;
        } catch (Exception e) {
            throw e;
        }
    }

//consultas prestamo
    public void buscarPrestamoPorCliente() {
        try {
            System.out.println("ingrese numero de id");
            String id = leer.next();

            if (id == null) {
                throw new Exception("el id no puede ser nulo");
            }

            Prestamo prestamo = dao5.buscarPrestamoXcliente(id);
            System.out.println("id cliente: " + prestamo.getCliente().getId());
            System.out.println("id de prestamo: " + prestamo.getId());
            System.out.println("fecha entrega: " + prestamo.getFechaPrestamo());
            System.out.println("fecha de devolucion: " + prestamo.getFechaDevolucion());

            System.out.println("");

        } catch (Exception e) {
        }
    }

    public void buscarPrestamoPorLibro() throws Exception {

        try {
            System.out.println("ingrese nombre del Libro");
            String titulo = leer.next();
            if (titulo == null) {
                throw new Exception("el nombre no puede ser nulo");
            }
            Collection<Prestamo> listaPorTitulo = dao5.buscarPrestamoXlibro(titulo);
            if (listaPorTitulo.isEmpty()) {
                throw new Exception("la lista esta vacia");
            } else {
                for (Prestamo aux : listaPorTitulo) {
                    System.out.println("id cliente: " + aux.getCliente().getId());
                    System.out.println("id de prestamo: " + aux.getId());
                    System.out.println("fecha entrega: " + aux.getFechaPrestamo());
                    System.out.println("fecha de devolucion: " + aux.getFechaDevolucion());

                    System.out.println("");

                }
            }

        } catch (Exception e) {
            throw e;
        }

    }
}
