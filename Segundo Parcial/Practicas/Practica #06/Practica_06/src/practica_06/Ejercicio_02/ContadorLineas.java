package practica_06.Ejercicio_02;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author derian-cordoba
 */
public class ContadorLineas extends HiloBase {
    public ContadorLineas(JLabel etiqueta, JTextArea contenido, String nombre) {
        super(etiqueta, contenido, nombre);
    }

    @Override
    protected void actualizarInformacion() {
        String texto = String.format("Lineas: %s", this.obtenerInformacion());
        this.etiqueta.setText(texto);
    }
    
    @Override
    protected String obtenerInformacion() {
        String contenido = this.contenido.getText();
        
        if(contenido.length() == 0) {
            return "0";
        }
        
        int cantidadLineas = this.contenido
            .getLineCount();
                
        return String.format("%d", cantidadLineas);
    }
}
