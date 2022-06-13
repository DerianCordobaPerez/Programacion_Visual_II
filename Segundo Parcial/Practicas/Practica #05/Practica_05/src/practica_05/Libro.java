package practica_05;

/**
 *
 * @author derian
 */
public class Libro {
    private String titulo, autor, editorial, prestado;
    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.editorial = "";
        this.prestado = "";
    }
    
    public Libro(String titulo, String autor, String editorial, String prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.prestado = prestado;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPrestado() {
        return this.prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }
}
