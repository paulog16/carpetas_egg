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
public class servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    cuenta c1= new cuenta();
    public void crear(){
    System.out.println("ingrese nombre");
    String nomnre=leer.next();
    System.out.println("ingrese apellido");
    String apellido=leer.next();
    System.out.println("ingrese numero de cuenta");
c1.setNumeroCuenta(leer.nextInt());
    System.out.println("dni");
 c1.setDni(leer.nextInt());
    System.out.println("saldo actual");
   c1.setSaldoActual(leer.nextInt());
}  
public void ingresar(){
  
    System.out.println("ingrese una cantidad de dinero al saldo");
     int dinero=leer.nextInt();
     c1.setSaldoActual(dinero+c1.getSaldoActual());
     System.out.println("ahora el saldo actual es: "+c1.getSaldoActual());
}
public void retirar(){
    System.out.println("ingrese dinero a retirar");
    int dinero=leer.nextInt();
    c1.setSaldoActual(c1.getSaldoActual()-dinero);
    if(c1.getSaldoActual()<0){
        c1.setSaldoActual(0);
    } else{
        System.out.println("el saldo actual ahora es: "+c1.getSaldoActual());
    }
    
}
public void extraccionRapida(){
    double porc;
    porc=c1.getSaldoActual()*0.20;
    System.out.println("ingrese monto a retirar");
    int dinero=leer.nextInt();
    if(dinero>porc){
        System.out.println("usted quiere sacar mas del 20%");
    }else{
        c1.setSaldoActual(c1.getSaldoActual()-dinero);
        System.out.println("el saldo ahora es de : "+c1.getSaldoActual());
    }
}
public void consultarSaldo(){
    System.out.println("el saldo actual es de: "+c1.getSaldoActual());
}
public void mostrarDatos(){
    System.out.println("datos");
    System.out.println(c1.toString()); 
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