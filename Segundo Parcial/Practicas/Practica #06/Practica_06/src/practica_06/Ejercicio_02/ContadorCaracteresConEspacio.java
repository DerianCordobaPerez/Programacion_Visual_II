package practica_06.Ejercicio_02;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author derian-cordoba
 */
public class ContadorCaracteresConEspacio extends HiloBase {
    public ContadorCaracteresConEspacio(JLabel etiqueta, JTextArea contenido, String nombre) {
        super(etiqueta, contenido, nombre);
    }

    @Override
    protected void actualizarInformacion() {
        String texto = String.format("Caracteres (Con espacio): %s", this.obtenerInformacion());
        this.etiqueta.setText(texto);
    }

    @Override
    protected String establecerInformacion(String contenido) {
        int cantidadCaracteres = contenido
            .replaceAll("\\R", "")
            .length();
        
        return String.format("%d", cantidadCaracteres);
    }
}
