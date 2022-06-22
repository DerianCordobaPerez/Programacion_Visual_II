package practica_06.Ejercicio_02;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author derian-cordoba
 */
public class ContadorPalabras extends HiloBase {
    public ContadorPalabras(JLabel etiqueta, JTextArea contenido, String nombre) {
        super(etiqueta, contenido, nombre);
    }

    @Override
    protected void actualizarInformacion() {
        String texto = String.format("Palabras: %s", this.obtenerInformacion());
        this.etiqueta.setText(texto);
    }
    
    @Override
    protected String obtenerInformacion() {
        String contenido = this.contenido.getText();
        
        if(contenido.length() == 0) {
            return "0";
        }
        
        int cantidadPalabras = contenido
            .lines()
            .filter(linea -> !linea.isBlank())
            .map(linea -> linea.replaceAll("^\\s*",""))
            .map(linea -> linea.replaceAll("\\s{2,}", " "))
            .map(linea -> linea.split(" "))
            .flatMap(Stream::of)
            .collect(Collectors.toList())
            .size();
                
        return String.format("%d", cantidadPalabras);
    }
}
