
package ejercicio4extraherencia;

import ejercicio4extraherencia.entidades.Alumnos;
import ejercicio4extraherencia.entidades.Empleados;
import ejercicio4extraherencia.entidades.Persona;
import ejercicio4extraherencia.entidades.PersonalServicio;
import ejercicio4extraherencia.entidades.Profesores;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ejercicio4extraherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona= new Persona();
        Empleados empleados= new Empleados();
        ArrayList<Persona> listaPersonas = new ArrayList();
int opc;
        int op;
        Class<?> per=null;
        do{
                    Profesores profesores= new Profesores();
        PersonalServicio servicio=new PersonalServicio();
        Alumnos alumnos=new Alumnos();
            System.out.println("menu");
            System.out.println("1-crear Profesor");
            System.out.println("2-crear personal de Servicio");
            System.out.println("3-crear Alumno");
            System.out.println("4-Cambiar datos");
            System.out.println("5-mostrar Lista");
            System.out.println("6-Salir");
        op=leer.nextInt();
        switch(op){
            case 1:
                profesores.crearProfesor();
                listaPersonas.add(profesores);
                break;
            case 2:
                servicio.crearPersonalServicio();
                listaPersonas.add(servicio);
                break;
            case 3:
                alumnos.crearAlumno();
                listaPersonas.add(alumnos);
                break;
            case 4:
                System.out.println("que desea hacer?");
                System.out.println("1-cambiar estado civil");
                System.out.println("2-reasignar despacho a un empleado");
                System.out.println("3-asignar alumno a un nuevo curso");
                System.out.println("4-cambiar de materia a un proesor");
                System.out.println("5-trasladar a un personal de servicio");
             
        opc=leer.nextInt();
        switch(opc){
            case 1:
                per=Persona.class;
                Persona PersonaModificada= (Persona)buscarPersona(listaPersonas,per);
               PersonaModificada.cambiarEstado();
               mostrarPersona(PersonaModificada);
                break;
            case 2:
                
                per=Empleados.class;
                Empleados empleadoModificado= (Empleados)buscarPersona(listaPersonas,per);
                empleadoModificado.cambiarDespacho();
                 mostrarPersona(empleadoModificado);
                break;
            case 3:
                
                 per=Alumnos.class;
                 Alumnos alumnoModificado= (Alumnos)buscarPersona(listaPersonas,per);
                 alumnoModificado.nuevoCurso();
                  mostrarPersona(alumnoModificado);
                break;
            case 4:
                 per=Profesores.class;
                 Profesores profeModificado=(Profesores)buscarPersona(listaPersonas,per);
                 profeModificado.cambiarDepartamento();
                  mostrarPersona(profeModificado);
                break;
            case 5:
                 per=PersonalServicio.class;
                 PersonalServicio serModificado=(PersonalServicio)buscarPersona(listaPersonas,per);
                 serModificado.nuevaSeccion();
                  mostrarPersona(serModificado);
                break;
          
             
                
        }
        break;
            case 5:
                   mostrarLista(listaPersonas);
                break;
        }
        }while(op!=6);
    }
    public static Persona buscarPersona(ArrayList<Persona>listaPersonas,Class<?> per){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

Persona encontrado=null;
do{
    System.out.println("ingrese dni de la persona que quiera buscar");
  int id=leer.nextInt();
    encontrado=listaPersonas.stream()
                           .filter(per::isInstance)
                   .filter(pe->pe.getIdentificacion()==id)
                        .findFirst()
                        .orElse(null); 
    if(encontrado !=null){
        System.out.println("la persona encontrada es: "+encontrado.getNombre());
    }else{
        System.out.println("no se encontro la persona");
    }
    
}while(encontrado==null);
        return encontrado;
    }
public static void mostrarLista(ArrayList<Persona>listaPersonas){
    listaPersonas.forEach(aux -> {
        System.out.println(aux);
        });
}
public static void mostrarPersona(Persona pe){
    System.out.println("la persona modificada es:");
    System.out.println(pe);
}
    
}
