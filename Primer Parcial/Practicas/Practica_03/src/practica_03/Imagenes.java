package practica_03;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Imagenes {
    
    private final Imagen imagen;
    private final JLabel visor, etiqueta;
    private final JButton boton;
    private final ArrayList<String> imagenes;
    private int posicionActual = -1;
    
    public Imagenes(JLabel visor, JLabel etiqueta, JButton boton) {
        this.visor = visor;
        this.etiqueta = etiqueta;
        this.boton = boton;
        this.imagenes = new ArrayList<>();
        this.imagen = new Imagen(this.visor.getWidth(), this.visor.getHeight());
    }
    
    public void agregarImagen(String imagen) {
        if(!this.imagen.existeImagen(imagen)) {
            JOptionPane.showMessageDialog(null, "La imagen solicitada no se encuentra.");
            return;
        }
        
        if(this.buscarImagen(imagen)) {
            JOptionPane.showMessageDialog(null, "La imagen solicitada ya se encuentra dentro de las imagenes.");
            return;
        }
        
        this.imagenes.add(imagen);
        this.posicionActual = this.imagenes.size() - 1;
        this.obtenerImagen(imagen);
        this.cambiarNombreImagen();
        this.boton.setEnabled(!this.imagenes.isEmpty());
        JOptionPane.showMessageDialog(null, "Imagen agregada correctamente.");
    }
    
    public boolean buscarImagen(String imagen) {
        return this.imagenes.contains(imagen);
    }
    
    public void cambiarImagen(int accion) {
        int posicion = this.posicionActual + accion;
        
        if(posicion < 0 || posicion > this.imagenes.size() - 1) {
            JOptionPane.showMessageDialog(null, "No hay mas imagenes por mostrar.");
            return;
        }
        
        this.posicionActual = posicion;
        this.obtenerImagen(this.imagenes.get(this.posicionActual));
        this.cambiarNombreImagen();
    }
    
    public void retrocederTodo() {
        this.retrocederAdelantarTodo(0);
    }
    
    public void adelantarTodo() {
        this.retrocederAdelantarTodo(this.imagenes.size() - 1);
    }
    
    public void retrocederAdelantarTodo(int cantidad) {
        if(this.imagenes.isEmpty() || this.posicionActual == cantidad) {
            JOptionPane.showMessageDialog(null, "No hay mas imagenes por mostrar.");
            return;
        }
        
        this.posicionActual = cantidad;
        this.obtenerImagen(this.imagenes.get(this.posicionActual));
        this.cambiarNombreImagen();
    }
    
    public void cambiarNombreImagen() {
        if(this.posicionActual >= 0) {
            this.etiqueta.setText(this.imagenes.get(this.posicionActual));
        }
    }
    
    public void obtenerImagen(String imagen) {
        if(!this.buscarImagen(imagen)) {
            JOptionPane.showMessageDialog(null, "La imagen solicitada no se encuentra.");
            return;
        }
        
        this.visor.setIcon(this.imagen.obtenerImagen(imagen));
    }
    
    private void imagenPredeterminada() {
        this.visor.setIcon(null);
        this.etiqueta.setText("Nombre de la foto");
    }
    
    public void eliminarImagen() {
        if(!this.imagenes.isEmpty()) {
            this.imagenes.remove(this.posicionActual);
            this.boton.setEnabled(!this.imagenes.isEmpty());
            
            if(this.imagenes.isEmpty()) {
                this.imagenPredeterminada();
            } else {
                this.obtenerImagen(this.imagenes.get(this.imagenes.size() - 1));
            }
            
            JOptionPane.showMessageDialog(null, "Imagen eliminada correctamente");
        }
    }
}
