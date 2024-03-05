/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Arrays;
import java.util.Scanner;
import libreria.servicios.LibreriaServicio;

/**
 *
 * @author pguid
 */
public class Ejercicio1JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibreriaServicio BS = new LibreriaServicio();

        int opciones = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("|          MENU          |");
            System.out.println("--------------------------");
            System.out.println("");
            System.out.println("1- Interactuar con Libro");
            System.out.println("2- Interactuar con Autor");
            System.out.println("3- Interactuar con Editorial");
            System.out.println("4- Interactuar Cliente");
            System.out.println("5- Interactuar con Prestamo");
            System.out.println("6- SALIR");
            System.out.println("Elija una opcion: ");

            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    int op2 = 0;
                    do {
                        System.out.println("");
                        System.out.println("1] Crear un libro nuevo");
                        System.out.println("2] Modificar libro");
                        System.out.println("3] Buscar libro por ISBN");
                        System.out.println("4] Buscar libro por titulo");
                        System.out.println("5] Listar libros por Nombre de Autor");
                        System.out.println("6] Listar libros por Nombre Editorial");
                        System.out.println("7] eliminar libro");
                        System.out.println("8] Salir al menu principal");
                        System.out.println("");

                        op2 = leer.nextInt();

                        switch (op2) {
                            case 1:
                                try {
                                    BS.guardarLibro();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nuevo libro.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;

                            case 2:
                                try {
                                    BS.modificarLibro();

                                } catch (Exception e) {
                                    System.out.println("Error al modidicar un libro.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;

                            case 3:
                                try {
                                    BS.buscarLibroPorIsbn();

                                } catch (Exception e) {
                                    System.out.println("Error al mostrar Libros buscados por ISBN.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;

                            case 4:
                                try {
                                    BS.buscarLibroPorTitulo();

                                } catch (Exception e) {
                                    System.out.println("Error al mostrar Libros buscados por Titulo.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;

                            case 5:
                                try {
                                    BS.buscarLibroPorAutor();

                                } catch (Exception e) {
                                    System.out.println("Error al listar libros por nombre de Autor");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;

                            case 6:
                                try {
                                    BS.buscarLibroPorEditorial();
                                } catch (Exception e) {
                                    System.out.println("Error al listar libros por nombre de Editorial");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 7:
                                try {
                                    BS.eliminarLibro();
                                } catch (Exception e) {
                                    System.out.println("Error al eliminar libro");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                        }

                    } while (op2 != 8);
                    break;

                case 2:
                    int op3 = 0;
                    do {
                        System.out.println("1] Crear un Autor nuevo");
                        System.out.println("2] Modificar Autor");
                        System.out.println("3] Eliminar Autor");
                        System.out.println("4] Mostrar Autor por Nombre");
                        System.out.println("5] salir al menu");

                        op3 = leer.nextInt();

                        switch (op3) {

                            case 1:
                                try {
                                    BS.guardarAutor();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nuevo Autor.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }

                                break;

                            case 2:
                                try {
                                    BS.modificarAutor();

                                } catch (Exception e) {
                                    System.out.println("Error al modificar ");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 3:
                                try {
                                    BS.eliminarAutor();

                                } catch (Exception e) {
//                                    System.out.println("Error al eliminar autor");
//                                    System.out.println(e);
//                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                try {
                                    BS.buscarAutorXNombre();

                                } catch (Exception e) {
                                    System.out.println("Error al mostrar autor por nombre");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                        }

                    } while (op3 != 5);
                    break;

                case 3:
                    int op4 = 0;
                    do {
                        System.out.println("1] Crear una Editorial nueva");
                        System.out.println("2] modificar editorial-");
                        System.out.println("3] Salir al menu principal");

                        op4 = leer.nextInt();

                        switch (op4) {
                            case 1:
                                try {
                                    BS.guardarEditorial();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nueva Editorial.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }

                                break;
                            case 2:
                                try {
                                    BS.modificarEditorial();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                        }

                    } while (op4 != 3);
                    break;

                case 4:
                    int op5 = 0;
                    do {
                        System.out.println("1] Crear un cliente Nuevo");
                        System.out.println("2] Modificar Cliente-");
                        System.out.println("3] Eliminar cliente");
                        System.out.println("4] salir");

                        op5 = leer.nextInt();

                        switch (op5) {
                            case 1:
                                try {
                                    BS.guardarCliente();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nueva Editorial.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }

                                break;
                            case 2:
                                try {
                                    BS.modificarCliente();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 3:
                                try {
                                    BS.eliminarCliente();
                                } catch (Exception e) {
                                    System.out.println("Error al eliminar.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                        }

                    } while (op5 != 4);
                    break;
                case 5:
                    int op6 = 0;
                    do {
                        System.out.println("1] Crear un Prestamo Nuevo");
                        System.out.println("2] Modificar Prestamo-");
                        System.out.println("3] Eliminar");
                        System.out.println("4] salir al menu");

                        op6 = leer.nextInt();

                        switch (op6) {
                            case 1:
                                try {
                                    BS.crearPrestamo();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nuevo prestamo.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }

                                break;
                            case 2:
                                try {
                                    BS.modificarPrestamo();
                                } catch (Exception e) {
                                    System.out.println("Error al modificar.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 3:
                                try {
                                    BS.eliminarPrestamo();
                                } catch (Exception e) {
                                    System.out.println("Error al eliminar.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                        }

                    } while (op6 != 4);
                    break;
            }

        } while (opciones != 6);

        System.out.println("");
        System.out.println("Finalizado.");
    }
}
