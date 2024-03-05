/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author pguid
 */
public class practicaswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia=5;
        String nombredia;
        switch(dia){
            case 1: 
                nombredia="lunes" ;        
                    break;
            case 2: 
                nombredia="martes";
                break;
            case 3: nombredia="miercoles";
            
                    break;
            case 4: nombredia="jueves";
                    break;
            case 5: nombredia="viernes";
            break;
            default:nombredia="no es valido";
                    break;
          
        }
        System.out.println("el dia elegido es el "+nombredia);
                
    }
    
}
