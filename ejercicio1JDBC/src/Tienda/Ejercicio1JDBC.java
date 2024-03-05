/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Tienda.entidades.Producto;
import Tienda.servicios.ProductoService;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio1JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ser = new ProductoService();
        Producto p1 = new Producto();

        int opciones = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("|          MENU          |");
            System.out.println("--------------------------");
            System.out.println("");
            System.out.println("1- Interactuar con Producto");
            System.out.println("2- Interactuar con Fabricante");
            System.out.println("3- SALIR");
            System.out.println("");
            System.out.println("Elija una opcion: ");

            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    int op2 = 0;
                    do {
                        System.out.println("1] Crear Producto Nuevo ");
                        System.out.println("2] modificar Producto");
                        System.out.println("3] eliminar");
                        System.out.println("4] listar nombre");
                        System.out.println("5] listar nombre y precio");
                        System.out.println("6] listar nombre y precio por rango");
                        System.out.println("7] listar nombre y precio por opcion");
                        System.out.println("8] listar producto mas barato ");
                        System.out.println("9] salir ");

                        op2 = leer.nextInt();

                        switch (op2) {
                            case 1:
                                try {
                                    ser.crearProducto();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nuevo producto.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 2:
                                try {
                                    ser.modificarProducto();

                                } catch (Exception e) {
                                    System.out.println("Error al modificar datos");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 3:
                                try {
                                    ser.eliminarProducto();

                                } catch (Exception e) {
                                    System.out.println("Error al eliminar datos");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                            case 4:
                                try {
                                    ser.listaNombresProductos();
                                } catch (Exception e) {
                                    System.out.println("error al mostrar nombres");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                            case 5:
                                try {
                                    ser.listaNombreYPrecio();
                                } catch (Exception e) {
                                       System.out.println("error al mostrar nombres y precios");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                   case 6:
                                try {
                                    ser.listarNombrePorMinYMax();
                                } catch (Exception e) {
                                       System.out.println("error al mostrar nombres y precios por rango");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                break;
                                   case 7:
                                   try {
                                    ser.listarNombrePorOpcion();
                                } catch (Exception e) {
                                      System.out.println("error al mostrar nombres y precios por opcion");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                    break;
                                   case 8:
                                       
                                   try {
                                    ser.listaNombreYPrecioMasBarato();
                                } catch (Exception e) {
                                       System.out.println("error al mostrar nombres y precios mas barato");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }
                                
                        }

                    } while (op2 != 9);
                    break;

                case 2:
                    int op3 = 0;
                    do {
                        System.out.println("1] Crear un Fabricante nuevo");
                        System.out.println("2] ");
                        System.out.println("3] Salir al menu principal");

                        op3 = leer.nextInt();

                        switch (op3) {
                            case 1:
                                try {
                                    ser.crearFabricante();

                                } catch (Exception e) {
                                    System.out.println("Error al cargar nuevo fabricante.");
                                    System.out.println(e);
                                    System.out.println(Arrays.toString(e.getStackTrace()));
                                }

                                break;
                        }

                    } while (op3 != 3);
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta.");
            }

        } while (opciones != 3);

        System.out.println("");
        System.out.println("Finalizado.");

    }

}
