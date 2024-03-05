
package practica;


public class Practica {

    
    
    //ejercicio logico
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 35;
        int x;

        System.out.println("valores sin intercambiar");
        System.out.println("" + num1);
        System.out.println("" + num2);
      //20  //20
        x = num2;
       //20  //35
        num2=num1;
       //35 //20
        num1=x;
        System.out.println("valores intercabiados");
        System.out.println("" + num1);
        System.out.println("" + num2);
    }

}
