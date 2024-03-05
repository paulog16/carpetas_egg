package moraapp;

import moraapp.entidades.Mora;

public class MoraAPP {

    
    public static void main(String[] args) {
    int a = 10;
  Mora mm= new Mora();
   
   modificador (a,mm);
        System.out.println(" a "+a);
        System.out.println(" mora "+mm);
    }
    public static void modificador(int num,Mora m){
   num=100;
   m.setApodo(" moraf ");
    }
      
//          public String nombre;
//    public String apodo;
//    //perro,gato,etc
//      public String tipo;
//      public String color;
//    public int edad;
//    public boolean cola;
//      public String raza

}
    
   
    

