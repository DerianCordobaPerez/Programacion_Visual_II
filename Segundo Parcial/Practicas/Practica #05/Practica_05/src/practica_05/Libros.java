package practica_05;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author derian
 */
public class Libros {
    private ArrayList<Libro> libros = new ArrayList<>();
    private static Libros instancia = null;
    private JTextField JTextFieldTitulo, JTextFieldAutor, JTextFieldEditorial;
    private JTextArea JTextAreaPrestado;
    
    private Libros() {
    }
    
    public Libros(
        JTextField JTextFieldTitulo, 
        JTextField JTextFieldAutor, 
        JTextField JTextFieldEditorial, 
        JTextArea JTextAreaPrestado
    ) {
        this.JTextFieldTitulo = JTextFieldTitulo;
        this.JTextFieldAutor = JTextFieldAutor;
        this.JTextFieldEditorial = JTextFieldEditorial;
        this.JTextAreaPrestado = JTextAreaPrestado;
    }
    
    public static Libros obtenerInstancia() {
        if(instancia == null) {
            instancia = new Libros();
        }
        
        return instancia;
    }
    
    public static Libros obtenerInstancia(
        JTextField JTextFieldTitulo, 
        JTextField JTextFieldAutor, 
        JTextField JTextFieldEditorial, 
        JTextArea JTextAreaPrestado
    ) {
        if(instancia == null) {
            instancia = new Libros(
                JTextFieldTitulo,
                JTextFieldAutor,
                JTextFieldEditorial,
                JTextAreaPrestado
            );
        }
        
        return instancia;
    }
    
    public boolean existeLibro(String titulo) {
        return libros
            .stream()
            .anyMatch((libro) -> (libro.getTitulo().equalsIgnoreCase(titulo)));
    }
    
    public boolean agregarLibro(Libro libro) {
        if(this.existeLibro(libro.getTitulo())) {
            JOptionPane.showMessageDialog(null, "El titulo del libro que desea ingresar ya existe.");
            return false;
        }
        
        this.libros.add(libro);
        JOptionPane.showMessageDialog(null, "Libro agregado correctamente.");
        return true;
    }
    
    public Libro buscarLibro(String titulo) {
        return libros
            .stream()
            .filter((libro) -> libro.getTitulo().equalsIgnoreCase(titulo))
            .findFirst()
            .orElse(null);
    }
    
    public ArrayList<Libro> obtenerLibros() {
        return this.libros;
    }
    
    public boolean eliminarLibro(String titulo) {
        if(!this.existeLibro(titulo)) {
            JOptionPane.showMessageDialog(null, "El titulo del libro no existe.");
            return false;
        }
        
        this.libros = new ArrayList<>(
            this.libros
            .stream()
            .filter((libro) -> !libro.getTitulo().equalsIgnoreCase(titulo))
            .collect(Collectors.toList())
        );
        
        JOptionPane.showMessageDialog(null, "El libro ha sido elimando correctamente.");
        return true;
    }
    
    public void establecerLibro(String titulo) {
        Libro libro = this.buscarLibro(titulo);
        
        if(libro == null) {
            JOptionPane.showMessageDialog(null, "El titulo del libro no existe.");
            return;
        }
        
        this.JTextFieldTitulo.setText(libro.getTitulo());
        this.JTextFieldAutor.setText(libro.getAutor());
        this.JTextFieldEditorial.setText(libro.getEditorial());
        this.JTextAreaPrestado.setText(libro.getPrestado());
    }
    
    public boolean esVacia() {
        return this.libros.isEmpty();
    }
}
