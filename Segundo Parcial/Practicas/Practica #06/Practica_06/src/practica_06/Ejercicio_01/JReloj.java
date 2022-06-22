package practica_06.Ejercicio_01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingConstants;

/**
 *
 * @author derian-cordoba
 */
public class JReloj extends javax.swing.JFrame {
    private final Hilo hilo;
    
    public JReloj() {
        initComponents();
        this.hilo = new Hilo(this, "hilo de la fecha");
        this.hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelHoraReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reloj con hilo");
        setResizable(false);

        JLabelHoraReloj.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        JLabelHoraReloj.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        JLabelHoraReloj.setForeground(javax.swing.UIManager.getDefaults().getColor("Nb.ScrollPane.Border.color"));
        JLabelHoraReloj.setHorizontalAlignment(SwingConstants.CENTER);
        JLabelHoraReloj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLabelHoraReloj.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelHoraReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelHoraReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JReloj().setVisible(true);
        });
    }
    
    public void actualizarHora() {
        DateFormat formato = new SimpleDateFormat("hh:mm:ss aa");
        String fecha = formato.format(new Date()).toString();
        
        this.JLabelHoraReloj.setText(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelHoraReloj;
    // End of variables declaration//GEN-END:variables
}
