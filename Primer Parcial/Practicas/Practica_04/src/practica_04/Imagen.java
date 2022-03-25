package practica_04;

import java.awt.Image;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;

public final class Imagen {
    private String nombre, descripcion;
    private final int ancho, alto, escala;
    private final ValidacionImagen validacionImagen;
    
    public Imagen(String nombre, String descripcion, int ancho, int alto) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.ancho = ancho;
        this.alto = alto;
        this.escala = Image.SCALE_SMOOTH;
        this.validacionImagen = new ValidacionImagen();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public ImageIcon obtenerImagen(boolean esGris) {
        Image imagenIcono = new ImageIcon(this.validacionImagen.buscarImagen(this.nombre))
                .getImage();
        
        if(esGris) {
            imagenIcono = new ImageIcon(GrayFilter.createDisabledImage(imagenIcono)).getImage();
        }
        
        imagenIcono = imagenIcono.getScaledInstance(this.ancho, this.alto, this.escala);
        
        return new ImageIcon(imagenIcono);
    }
}
