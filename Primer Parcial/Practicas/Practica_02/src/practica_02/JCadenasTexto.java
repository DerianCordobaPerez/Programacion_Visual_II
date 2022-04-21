package practica_02;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class JCadenasTexto extends javax.swing.JFrame {

    public JCadenasTexto() {
        initComponents();
    }
    
    private boolean validacionCadenas() {        
        return this.JTextFieldCadenaNumeroUno.getText().trim().isEmpty() || this.JTextFieldCadenaNumeroDos.getText().trim().isEmpty();
    }
    
    private boolean cadenasIguales() {
        return this.JTextFieldCadenaNumeroUno.getText().toLowerCase().equalsIgnoreCase(this.JTextFieldCadenaNumeroDos.getText().toLowerCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTextFieldCadenaNumeroUno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldCadenaNumeroDos = new javax.swing.JTextField();
        JButtonConcatenar = new javax.swing.JButton();
        JButtonComparar = new javax.swing.JButton();
        JButtonMayuscula = new javax.swing.JButton();
        JButtonLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldCadenaConcatenada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextFieldCadenaComparada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTextFieldCadenaUnoMayuscula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextFieldCadenaDosMayuscula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese la cadena numero 1:");
        jLabel1.setToolTipText("");

        JTextFieldCadenaNumeroUno.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la cadena numero 2:");
        jLabel2.setToolTipText("");

        JTextFieldCadenaNumeroDos.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        JButtonConcatenar.setText("Concatenar");
        JButtonConcatenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonConcatenarMouseReleased(evt);
            }
        });

        JButtonComparar.setText("Comparar");
        JButtonComparar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCompararMouseReleased(evt);
            }
        });

        JButtonMayuscula.setText("Mayuscula");
        JButtonMayuscula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonMayusculaMouseReleased(evt);
            }
        });

        JButtonLimpiar.setText("Limpiar");
        JButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonLimpiarMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel3.setText("Concatenar");
        jLabel3.setToolTipText("");

        JTextFieldCadenaConcatenada.setEditable(false);
        JTextFieldCadenaConcatenada.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel4.setText("Comparacion");
        jLabel4.setToolTipText("");

        JTextFieldCadenaComparada.setEditable(false);
        JTextFieldCadenaComparada.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel5.setText("Cadena #01 - Mayuscula");
        jLabel5.setToolTipText("");

        JTextFieldCadenaUnoMayuscula.setEditable(false);
        JTextFieldCadenaUnoMayuscula.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel6.setText("Cadena #02 - Mayuscula");
        jLabel6.setToolTipText("");

        JTextFieldCadenaDosMayuscula.setEditable(false);
        JTextFieldCadenaDosMayuscula.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldCadenaConcatenada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldCadenaComparada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldCadenaUnoMayuscula))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldCadenaNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldCadenaNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextFieldCadenaDosMayuscula))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonConcatenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonComparar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonMayuscula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonLimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldCadenaNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldCadenaNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonConcatenar)
                    .addComponent(JButtonComparar)
                    .addComponent(JButtonMayuscula)
                    .addComponent(JButtonLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldCadenaConcatenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextFieldCadenaComparada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTextFieldCadenaUnoMayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTextFieldCadenaDosMayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonLimpiarMouseReleased
        Arrays.asList(
            this.JTextFieldCadenaNumeroUno,
            this.JTextFieldCadenaNumeroDos,
            this.JTextFieldCadenaComparada,
            this.JTextFieldCadenaConcatenada,
            this.JTextFieldCadenaDosMayuscula,
            this.JTextFieldCadenaUnoMayuscula
        ).forEach(caja -> caja.setText(""));
    }//GEN-LAST:event_JButtonLimpiarMouseReleased

    private void JButtonConcatenarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonConcatenarMouseReleased
        if(this.validacionCadenas()) {
            JOptionPane.showMessageDialog(this, "Las cadenas se encuentran vacias!!!");
            return;
        }
        
        this.JTextFieldCadenaConcatenada.setText(String.format("%s %s", this.JTextFieldCadenaNumeroUno.getText(), this.JTextFieldCadenaNumeroDos.getText()));
    }//GEN-LAST:event_JButtonConcatenarMouseReleased

    private void JButtonCompararMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCompararMouseReleased
        if(this.validacionCadenas()) {
            JOptionPane.showMessageDialog(this, "Las cadenas se encuentran vacias!!!");
            return;
        }
        
        this.JTextFieldCadenaComparada.setText(
            this.cadenasIguales()
                ? "Cadenas iguales"
                : "Cadenas distintas"
        );
    }//GEN-LAST:event_JButtonCompararMouseReleased

    private void JButtonMayusculaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonMayusculaMouseReleased
        if(this.validacionCadenas()) {
            JOptionPane.showMessageDialog(this, "Las cadenas se encuentran vacias!!!");
            return;
        }
        
        this.JTextFieldCadenaUnoMayuscula.setText(this.JTextFieldCadenaNumeroUno.getText().toUpperCase());
        this.JTextFieldCadenaDosMayuscula.setText(this.JTextFieldCadenaNumeroDos.getText().toUpperCase());
    }//GEN-LAST:event_JButtonMayusculaMouseReleased

    public static void main(String... args) {
        java.awt.EventQueue.invokeLater(() -> {
            new JCadenasTexto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonComparar;
    private javax.swing.JButton JButtonConcatenar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonMayuscula;
    private javax.swing.JTextField JTextFieldCadenaComparada;
    private javax.swing.JTextField JTextFieldCadenaConcatenada;
    private javax.swing.JTextField JTextFieldCadenaDosMayuscula;
    private javax.swing.JTextField JTextFieldCadenaNumeroDos;
    private javax.swing.JTextField JTextFieldCadenaNumeroUno;
    private javax.swing.JTextField JTextFieldCadenaUnoMayuscula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
