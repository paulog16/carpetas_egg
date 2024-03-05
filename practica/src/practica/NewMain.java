package practica;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, resta;
        System.out.println("INGRESA DOS NUMEROS: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        System.out.println("el resultado de la suma es : " + suma);

        System.out.println("el resultado de la resta es : " + resta);

    }

}
// HAZ QUE EL USUARIO INGRESE 2 NUMEROS POR TECLADO Y QUE MUESTRE LA SUMA Y LA RESTA
