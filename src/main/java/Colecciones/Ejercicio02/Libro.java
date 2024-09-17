package Colecciones.Ejercicio02;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private  int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos() {
        return "El titulo es: " + this.titulo + ". El autor es: " + this.autor + ". Y el ISBN es: " + this.ISBN;
    }

    /*public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro libro = (Libro) obj;
            if (libro.ISBN == this.ISBN)
                return true;
            return false;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return ISBN == libro.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
