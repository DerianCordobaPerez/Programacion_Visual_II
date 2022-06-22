package practica_06.Ejercicio_01;

/**
 *
 * @author derian-cordoba
 */
public class Hilo extends Thread {
    private final JReloj frame;
    
    public Hilo(javax.swing.JFrame frame, String nombre) {
        super(nombre);
        this.frame = (JReloj) frame;
    }
    
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        try {
            while(true) {
                this.frame.actualizarHora();
                this.sleep(1000);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
