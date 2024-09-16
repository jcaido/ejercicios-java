package Colecciones.Ejercicio02;

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
}
