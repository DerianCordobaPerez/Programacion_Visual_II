package practica_02;

import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JTextField;

public class JCambioGrados extends javax.swing.JFrame {

    public JCambioGrados() {
        initComponents();
        this.JLabelFechaActual.setText(new Date().toString());
    }
    
    public static void main(String... args) {
        java.awt.EventQueue.invokeLater(() -> {
            new JCambioGrados().setVisible(true);
        });
    }
    
    private void gradosCentigradosFarenheit() {
        try {
            double centigrados = Double.parseDouble(this.JTextFieldGradosCentigrados.getText());      
            this.JTextFieldGradosFarenheit.setText(String.format("%.1f", (centigrados * 9 / 5) + 32));
        } catch(NumberFormatException e) {
            this.reestablecerCampos();
        }
    }
    
    private void gradosFarenheitCentigrados() {
        try {
            double farenheit = Double.parseDouble(this.JTextFieldGradosFarenheit.getText());
            this.JTextFieldGradosCentigrados.setText(String.format("%.1f", (farenheit - 32) * 5 / 9));
        } catch(NumberFormatException e) {
            this.reestablecerCampos();
        }
    }
    
    private void incrementarGrados(JTextField caja) {
        try {
            double grados = Double.parseDouble(caja.getText());
            caja.setText(String.format("%.1f", grados + 1));
        } catch(NumberFormatException e) {
            this.reestablecerCampos();
        }
    }
    
    private void reestablecerCampos() {
        this.JTextFieldGradosCentigrados.setText("0.0");
        this.JTextFieldGradosFarenheit.setText("32.0");
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLabelFechaActual = new javax.swing.JLabel();
        JTextFieldGradosCentigrados = new javax.swing.JTextField();
        JTextFieldGradosFarenheit = new javax.swing.JTextField();
        JButtonMasGradosCentigrados = new javax.swing.JButton();
        JButtonMasGradosFarenheit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 400, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel2.setText("Grados Farenheit");

        jLabel3.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel3.setText("Grados Centigraods");

        JLabelFechaActual.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelFechaActual.setText("Fecha actual");
        JLabelFechaActual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTextFieldGradosCentigrados.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldGradosCentigrados.setText("0.0");
        JTextFieldGradosCentigrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldGradosCentigradosKeyPressed(evt);
            }
        });

        JTextFieldGradosFarenheit.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldGradosFarenheit.setText("32.0");
        JTextFieldGradosFarenheit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldGradosFarenheitKeyPressed(evt);
            }
        });

        JButtonMasGradosCentigrados.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JButtonMasGradosCentigrados.setText("+1");
        JButtonMasGradosCentigrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonMasGradosCentigradosMouseReleased(evt);
            }
        });

        JButtonMasGradosFarenheit.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JButtonMasGradosFarenheit.setText("+1");
        JButtonMasGradosFarenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonMasGradosFarenheitMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JLabelFechaActual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldGradosCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonMasGradosCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(JTextFieldGradosFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonMasGradosFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JLabelFechaActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldGradosCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonMasGradosCentigrados))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldGradosFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonMasGradosFarenheit))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldGradosCentigradosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldGradosCentigradosKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()) {
            this.gradosCentigradosFarenheit();
        }
    }//GEN-LAST:event_JTextFieldGradosCentigradosKeyPressed

    private void JTextFieldGradosFarenheitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldGradosFarenheitKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()) {
            this.gradosFarenheitCentigrados();
        }
    }//GEN-LAST:event_JTextFieldGradosFarenheitKeyPressed

    private void JButtonMasGradosCentigradosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonMasGradosCentigradosMouseReleased
        this.incrementarGrados(this.JTextFieldGradosCentigrados);
        this.gradosCentigradosFarenheit();
    }//GEN-LAST:event_JButtonMasGradosCentigradosMouseReleased

    private void JButtonMasGradosFarenheitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonMasGradosFarenheitMouseReleased
        this.incrementarGrados(this.JTextFieldGradosFarenheit);
        this.gradosFarenheitCentigrados();
    }//GEN-LAST:event_JButtonMasGradosFarenheitMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonMasGradosCentigrados;
    private javax.swing.JButton JButtonMasGradosFarenheit;
    private javax.swing.JLabel JLabelFechaActual;
    private javax.swing.JTextField JTextFieldGradosCentigrados;
    private javax.swing.JTextField JTextFieldGradosFarenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
