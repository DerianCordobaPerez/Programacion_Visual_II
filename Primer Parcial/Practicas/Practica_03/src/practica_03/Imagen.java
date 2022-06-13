package practica_03;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Imagen {
    private final int ancho, alto, escala;
    private final String CARPETA = "Imagenes";
    
    public Imagen(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.escala = Image.SCALE_SMOOTH;
    }

    public URL buscarImagen(String imagen) {
        return this.getClass()
                .getResource(String.format("%s/%s", this.CARPETA, imagen));
    }
    
    public boolean existeImagen(String imagen) {
        return this.buscarImagen(imagen) != null;
    }
    
    public ImageIcon obtenerImagen(String imagen) {
        Image imagenIcono = new ImageIcon(this.buscarImagen(imagen))
                .getImage()
                .getScaledInstance(this.ancho, this.alto, this.escala);
        
        return new ImageIcon(imagenIcono);
    }
}
