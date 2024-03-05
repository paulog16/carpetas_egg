/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejercicio1.entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String isbn;
    private String titulo;
    private String autor;
    private String paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void ingresarDatos() {
        System.out.println("ingrese isbn");
        this.isbn = leer.next();
        System.out.println("ingrese titulo");
        this.titulo = leer.next();
        System.out.println("ingrese autor");
        this.autor = leer.next();
        System.out.println("ingrese paginas");
        this.paginas = leer.next();
    }

    public void mostrar() {
        System.out.println("el isbn es: " + getIsbn());
        System.out.println("el titulo es: " + getTitulo());
        System.out.println("el autor del libro es: " + getAutor());
        System.out.println("la cantidad de paginas es de: " + getPaginas());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

}
