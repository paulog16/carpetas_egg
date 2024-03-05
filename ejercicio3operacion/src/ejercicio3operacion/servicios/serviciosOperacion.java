package ejercicio3operacion.servicios;

import ejercicio3operacion.Operacion;
import java.util.Scanner;

public class serviciosOperacion {

    Scanner leer = new Scanner(System.in);
    Operacion o1 = new Operacion();

    public void crearOperacion() {

        System.out.println("ingrese dos numeros");
        int num1 = leer.nextInt();
        o1.setNum1(num1);
        int num2 = leer.nextInt();
        o1.setNum2(num2);

    }

    public void crearSuma() {
        int suma;
        suma = o1.getNum1() + o1.getNum2();
        System.out.println("la suma entre num1 y num2 es: " + suma);

    }
    public void dividir(){
        int dividir;
        dividir = o1.getNum1()/o1.getNum2();
        if(dividir==0){
            System.out.println("incorrecto");
           
        } else{
            System.out.println("correcto");
         System.out.println(""+dividir);
                
    }

    }
}
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
