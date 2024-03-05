//. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
//números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
package practica;

import java.util.Scanner;

public class practicar {

    public static void main(String[] args) {
Scanner leer= new Scanner (System.in);
int suma=0;
        System.out.println("ingrese un limite que se deba superar");
        int limite= leer.nextInt();
        do{
            System.out.println("ingrese un numero");
            int num=leer.nextInt();
            suma=suma+num;
            
        }while(suma<=limite);
}
}