/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.servicios;

import ejercicio13.Curso;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class servicur {
    Scanner leer= new Scanner(System.in);
    public String[] cargarAlumnos(){
        System.out.println("ingreso de alumnos");
        String [] arreglo= new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre del alumno"+(i+1));
            arreglo[i]= leer.next();
        }
        return arreglo;
    }
    public Curso crearCurso(){
        Curso c1= new Curso();
        System.out.println("nombre del curso: ");
        c1.setNombreCurso(leer.next());
        System.out.println("cantidad de horas por dia");
        c1.setCantHorasDias(leer.nextInt());
        System.out.println("cantidad de horas por semana");
        c1.setCantHorasSemanas(leer.nextInt());
        System.out.println("turno am o pm");
        c1.setTurno(leer.next());
        System.out.println("precio por hora");
        c1.setPrecioHora(leer.nextDouble());
        c1.setAlumnos(cargarAlumnos());
    return c1;    
    }
    public void ganancias(Curso Curso){
        double valor= Curso.getCantHorasDias()*Curso.getCantHorasSemanas()*Curso.getPrecioHora()*Curso.getAlumnos().length;
        System.out.println("las ganancias son de : "+valor);
    }
    
}
//13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.