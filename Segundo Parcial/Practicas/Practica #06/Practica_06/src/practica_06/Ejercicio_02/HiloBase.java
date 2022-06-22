package practica_06.Ejercicio_02;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author derian-cordoba
 */
public abstract class HiloBase extends Thread {
    protected final JLabel etiqueta;
    protected final JTextArea contenido;
    
    public HiloBase(JLabel etiqueta, JTextArea contenido, String nombre) {
        super(nombre);
        this.etiqueta = etiqueta;
        this.contenido = contenido;
    }
    
    protected abstract void actualizarInformacion();
    protected abstract String obtenerInformacion();
    
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        try {
            while(true) {
                this.actualizarInformacion();
                this.sleep(100);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
