/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author pguid
 */
public class Datos {
    int isbn,npaginas;
    String Titulo,Autor;

    public Datos(int isbn, int npaginas, String Titulo, String Autor) {
        this.isbn = isbn;
        this.npaginas = npaginas;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public Datos() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
}
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.