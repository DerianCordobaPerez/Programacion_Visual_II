package practica_06.Ejercicio_02;

import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author derian-cordoba
 */
public class ContadorParrafos extends HiloBase {
    public ContadorParrafos(JLabel etiqueta, JTextArea contenido, String nombre) {
        super(etiqueta, contenido, nombre);
    }

    @Override
    protected void actualizarInformacion() {
        String texto = String.format("Parrafos: %s", this.obtenerInformacion());
        this.etiqueta.setText(texto);
    }

    @Override
    protected String establecerInformacion(String contenido) {
        int cantidadParrafos = contenido
            .lines()
            .filter(linea -> !linea.isBlank())
            .collect(Collectors.toList())
            .size();

        
        return String.format("%d", cantidadParrafos);
    }
}
