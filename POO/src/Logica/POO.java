package Logica;

public class POO {

    public static void main(String[] args) {

        Novia n1 = new Novia();
        Novia n2 = new Novia("cami", "malisani", 18);
        System.out.println("el nombre de mi novia es : " + n2.getNombre());
        System.out.println("el apellido de mi novia es : " + n2.getApellido());
        System.out.println("mi novia tiene : " + n2.getEdad() + "años");
        System.out.println("-----------");
        //cambio de valor con setter
        n2.setEdad(20);
        System.out.println("------------");
        System.out.println("el nombre de mi novia es : " + n2.getNombre());
        System.out.println("el apellido de mi novia es : " + n2.getApellido());
        System.out.println("mi novia tiene : " + n2.getEdad() + "años");
    }

}
