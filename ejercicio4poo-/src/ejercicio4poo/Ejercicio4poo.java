/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio4poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      servicios s1= new servicios();
              s1.crear();
        String op;
        do{
            System.out.println("MENU");
            System.out.println("1-INGRESAR");
            System.out.println("2-RETIRAR");
            System.out.println("3-EXTRACCION RAPIDA");
            System.out.println("4-CONSULTAR SALDO");
            System.out.println("5-CONSULTAR DATOS");
            op=leer.next();
            switch (op) {
                case "1":
       s1.ingresar();
                    break;
                case"2":
                 s1.retirar();
                   break;
                case "3":
                  s1.extraccionRapida();
                   break;
                case "4":
                    s1.consultarSaldo();
                    break;
                case "5":
                  s1.mostrarDatos();
                  break;
                case "6":
                    System.out.println("salir");
                    break;
                    
            }
        }while(op!="6");
    }
    
}
//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta