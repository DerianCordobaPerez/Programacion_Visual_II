package practica_04;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Imagenes {
    private final JLabel visor, nombre;
    private final JButton boton;
    private final JCheckBox mostrarDescripcion;
    private final JRadioButton radioButtonGris;
    private final ArrayList<Imagen> imagenes;
    private final int ANCHO, ALTO;
    private final ValidacionImagen validacionImagen; 
    private int posicionActual = -1;
    
    public Imagenes(JLabel visor, JLabel nombre, JButton boton, JCheckBox mostrarDescripcion, JRadioButton radioButtonGris) {
        this.visor = visor;
        this.nombre = nombre;
        this.boton = boton;
        this.mostrarDescripcion = mostrarDescripcion;
        this.radioButtonGris = radioButtonGris;
        this.imagenes = new ArrayList<>();
        this.ANCHO = this.visor.getWidth();
        this.ALTO = this.visor.getHeight();
        this.validacionImagen = new ValidacionImagen();
    }
    
    public void agregarImagen(String nombre, String descripcion) {
        if(!this.validacionImagen.existeImagen(nombre)) {
            JOptionPane.showMessageDialog(null, "La imagen solicitada no se encuentra.");
            return;
        }
        
        if(this.existeImagenDuplicada(nombre)) {
            JOptionPane.showMessageDialog(null, "La imagen solicitada ya se encuentra dentro de las imagenes.");
            return;
        }
        
        this.imagenes.add(new Imagen(nombre, descripcion, this.ANCHO, this.ALTO));
        this.posicionActual = this.imagenes.size() - 1;
        this.obtenerImagen();
        this.cambiarInformacionImagen();
        this.boton.setEnabled(!this.imagenes.isEmpty());
        JOptionPane.showMessageDialog(null, "Imagen agregada correctamente.");
    }
    
    public boolean existeImagenDuplicada(String nombre) {
        return this.imagenes.stream().anyMatch((imagen) -> (imagen.getNombre().equalsIgnoreCase(nombre)));
    }
    
    public void obtenerImagen() {
        this.visor.setIcon(this.imagenes.get(this.posicionActual).obtenerImagen(this.radioButtonGris.isSelected()));
    }
    
    private void cambiarNombreImagen() {
         this.nombre.setText(
             this.posicionActual >= 0
                 ? this.imagenes.get(this.posicionActual).getNombre()
                 : "Nombre de la foto"
         );
    }
    
    private void cambiarDescripcionImagen() {
        this.nombre.setText(
            this.posicionActual >= 0
                ? this.imagenes.get(this.posicionActual).getDescripcion()
                : "Descripcion de la foto"
        );
    }
    
    public void cambiarInformacionImagen() {
        if(this.mostrarDescripcion.isSelected()) {
            this.cambiarDescripcionImagen();
        } else {
            this.cambiarNombreImagen();
        }
    }
    
    private void imagenPredeterminada() {
        this.visor.setIcon(null);
        this.cambiarInformacionImagen();
    }
    
    public void eliminarImagen() {
        if(!this.imagenes.isEmpty()) {
            this.imagenes.remove(this.posicionActual);
            this.boton.setEnabled(!this.imagenes.isEmpty());
            
            if(this.imagenes.isEmpty()) {
                this.posicionActual = -1;
                this.imagenPredeterminada();
            } else {
                this.posicionActual = this.imagenes.size() - 1;
                this.obtenerImagen();
                this.cambiarInformacionImagen();
            }
            
            JOptionPane.showMessageDialog(null, "Imagen eliminada correctamente");
        }
    }
    
    public void cambiarImagen(int accion) {
        int posicion = this.posicionActual + accion;
        
        if(posicion < 0 || posicion > this.imagenes.size() - 1) {
            JOptionPane.showMessageDialog(null, "No hay mas imagenes por mostrar.");
            return;
        }
        
        this.posicionActual = posicion;
        this.obtenerImagen();
        this.cambiarInformacionImagen();
    }
    
    public void retrocederTodo() {
        this.retrocederAdelantarTodo(0);
    }
    
    public void adelantarTodo() {
        this.retrocederAdelantarTodo(this.imagenes.size() - 1);
    }
    
    private void retrocederAdelantarTodo(int cantidad) {
        if(this.imagenes.isEmpty() || this.posicionActual == cantidad) {
            JOptionPane.showMessageDialog(null, "No hay mas imagenes por mostrar.");
            return;
        }
        
        this.posicionActual = cantidad;
        this.obtenerImagen();
        this.cambiarInformacionImagen();
    }
    
    public boolean esVacia() {
        return this.imagenes.isEmpty();
    }
}
