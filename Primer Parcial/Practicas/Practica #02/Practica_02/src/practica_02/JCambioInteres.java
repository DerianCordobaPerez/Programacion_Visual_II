package practica_02;

import java.util.Arrays;

public class JCambioInteres extends javax.swing.JFrame {

    public JCambioInteres() {
        initComponents();
    }
    
    private void calcularIntereses() {
        double capitalInicial = Double.parseDouble(this.JTextFieldCapitalInicial.getText());
        double interes = Double.parseDouble(this.JTextFieldInteres.getText());
        
        if(capitalInicial < 0) {
            capitalInicial = Math.abs(capitalInicial);
            this.JTextFieldCapitalInicial.setText(String.format("%.1f", capitalInicial));
        }
        
        if(interes < 0) {
            interes = Math.abs(interes);
            this.JTextFieldInteres.setText(String.format("%.1f", interes));
        }
        
        double interesProducido = capitalInicial * (interes / 100);
        this.JTextFieldInteresProducido.setText(String.format("%.1f", interesProducido));
        this.JTextFieldCapitalAcumulado.setText(String.format("%.1f", interesProducido + capitalInicial));
    }
    
    public void reestablecerCampos() {
        Arrays.asList(
                this.JTextFieldCapitalInicial,
                this.JTextFieldCapitalAcumulado,
                this.JTextFieldInteres,
                this.JTextFieldInteresProducido
        ).forEach(caja -> caja.setText("0.0"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextFieldInteresProducido = new javax.swing.JTextField();
        JTextFieldCapitalAcumulado = new javax.swing.JTextField();
        JTextFieldCapitalInicial = new javax.swing.JTextField();
        JTextFieldInteres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel1.setText("Capital inical:");

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel2.setText("Interes:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel3.setText("Interes producido:");

        jLabel4.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel4.setText("Capital acumulado:");

        JTextFieldInteresProducido.setBackground(new java.awt.Color(255, 255, 153));
        JTextFieldInteresProducido.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldInteresProducido.setText("0.0");
        JTextFieldInteresProducido.setEnabled(false);

        JTextFieldCapitalAcumulado.setBackground(new java.awt.Color(255, 255, 153));
        JTextFieldCapitalAcumulado.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldCapitalAcumulado.setText("0.0");
        JTextFieldCapitalAcumulado.setEnabled(false);

        JTextFieldCapitalInicial.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldCapitalInicial.setText("0.0");

        JTextFieldInteres.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldInteres.setText("0.0");

        jButton1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldInteresProducido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(98, 98, 98)
                        .addComponent(JTextFieldInteres))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldCapitalAcumulado, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(JTextFieldCapitalInicial)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldCapitalInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldInteresProducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextFieldCapitalAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        try {
            calcularIntereses();
        } catch(Exception e) {
            this.reestablecerCampos();
        }
    }//GEN-LAST:event_jButton1MouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JCambioInteres().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldCapitalAcumulado;
    private javax.swing.JTextField JTextFieldCapitalInicial;
    private javax.swing.JTextField JTextFieldInteres;
    private javax.swing.JTextField JTextFieldInteresProducido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
