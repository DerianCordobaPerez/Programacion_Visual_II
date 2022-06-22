package practica_04;

import java.net.URL;

public class ValidacionImagen {
    private final String CARPETA = "Imagenes";
    
    public URL buscarImagen(String nombre) {
        return this.getClass().getResource(String.format("%s/%s", this.CARPETA, nombre));
    }
    
    public boolean existeImagen(String nombre) {
        return this.buscarImagen(nombre) != null;
    }
}
