package practica_03;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class JVisorImagenes extends javax.swing.JFrame {

    private final Imagenes imagenes;
    private final int DOBLE_CLICK = 2;
    
    public JVisorImagenes() {
        initComponents();
        this.imagenes = new Imagenes(this.JLabelVisorImagen, this.JLabelNombreFoto, this.JButtonBorrar);
    }
    
    private void activarDesactivarControles() {
        boolean habilitado = this.JTextFieldNombreImagen.isEnabled();
            
        Arrays.asList(
            this.JButtonCancelar,
            this.JButtonGuardar
        ).forEach(boton -> boton.setEnabled(!habilitado));

        if(habilitado) {
            this.JTextFieldNombreImagen.setText("");
        }
        
        this.JButtonNuevo.setEnabled(habilitado);
        this.JTextFieldNombreImagen.setEnabled(!habilitado);
    }
    
    private void guardarImagen() {
        if(this.JTextFieldNombreImagen.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la imagen no es correcto");
        } else {
            this.imagenes.agregarImagen(this.JTextFieldNombreImagen.getText());
            this.activarDesactivarControles();
        }
        
        this.JTextFieldNombreImagen.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelSelectorImagenes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldNombreImagen = new javax.swing.JTextField();
        JButtonNuevo = new javax.swing.JButton();
        JButtonGuardar = new javax.swing.JButton();
        JButtonBorrar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        JLabelNombreFoto = new javax.swing.JLabel();
        JLabelVisorImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JButtonRetrocederTodo = new javax.swing.JButton();
        JButtonRetroceder = new javax.swing.JButton();
        JButtonAdelantarTodo = new javax.swing.JButton();
        JButtonAdelantar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visor de imagenes");
        setResizable(false);

        JPanelSelectorImagenes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona una imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono PL", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la imagen");

        JTextFieldNombreImagen.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldNombreImagen.setToolTipText("");
        JTextFieldNombreImagen.setEnabled(false);
        JTextFieldNombreImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextFieldNombreImagenMouseClicked(evt);
            }
        });
        JTextFieldNombreImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldNombreImagenKeyPressed(evt);
            }
        });

        JButtonNuevo.setText("Nuevo");
        JButtonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonNuevoMouseReleased(evt);
            }
        });

        JButtonGuardar.setText("Guardar");
        JButtonGuardar.setEnabled(false);
        JButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonGuardarMouseReleased(evt);
            }
        });

        JButtonBorrar.setText("Borrar");
        JButtonBorrar.setEnabled(false);
        JButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonBorrarMouseReleased(evt);
            }
        });

        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.setEnabled(false);
        JButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCancelarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout JPanelSelectorImagenesLayout = new javax.swing.GroupLayout(JPanelSelectorImagenes);
        JPanelSelectorImagenes.setLayout(JPanelSelectorImagenesLayout);
        JPanelSelectorImagenesLayout.setHorizontalGroup(
            JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JTextFieldNombreImagen))
                    .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                        .addComponent(JButtonNuevo)
                        .addGap(49, 49, 49)
                        .addComponent(JButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(JButtonBorrar)
                        .addGap(57, 57, 57)
                        .addComponent(JButtonCancelar)))
                .addContainerGap())
        );
        JPanelSelectorImagenesLayout.setVerticalGroup(
            JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldNombreImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonNuevo)
                    .addComponent(JButtonGuardar)
                    .addComponent(JButtonBorrar)
                    .addComponent(JButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JLabelNombreFoto.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelNombreFoto.setText("Nombre de la foto");

        JLabelVisorImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JLabelVisorImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelVisorImagenMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desplazamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono PL", 0, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        JButtonRetrocederTodo.setText("|<");
        JButtonRetrocederTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonRetrocederTodoMouseReleased(evt);
            }
        });

        JButtonRetroceder.setText("<");
        JButtonRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonRetrocederMouseReleased(evt);
            }
        });

        JButtonAdelantarTodo.setText(">|");
        JButtonAdelantarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAdelantarTodoMouseReleased(evt);
            }
        });

        JButtonAdelantar.setText(">");
        JButtonAdelantar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAdelantarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButtonRetrocederTodo)
                .addGap(18, 18, 18)
                .addComponent(JButtonRetroceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtonAdelantar)
                .addGap(18, 18, 18)
                .addComponent(JButtonAdelantarTodo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonRetrocederTodo)
                    .addComponent(JButtonRetroceder)
                    .addComponent(JButtonAdelantarTodo)
                    .addComponent(JButtonAdelantar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPanelSelectorImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(JLabelNombreFoto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabelVisorImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelSelectorImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelNombreFoto)
                .addGap(18, 18, 18)
                .addComponent(JLabelVisorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonNuevoMouseReleased
        if(this.JButtonNuevo.isEnabled()) {
            this.activarDesactivarControles();
        }
    }//GEN-LAST:event_JButtonNuevoMouseReleased

    private void JButtonRetrocederMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonRetrocederMouseReleased
        this.imagenes.cambiarImagen(-1);
    }//GEN-LAST:event_JButtonRetrocederMouseReleased

    private void JButtonAdelantarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAdelantarMouseReleased
        this.imagenes.cambiarImagen(1);
    }//GEN-LAST:event_JButtonAdelantarMouseReleased

    private void JButtonRetrocederTodoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonRetrocederTodoMouseReleased
        this.imagenes.retrocederTodo();
    }//GEN-LAST:event_JButtonRetrocederTodoMouseReleased

    private void JButtonAdelantarTodoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAdelantarTodoMouseReleased
        this.imagenes.adelantarTodo();
    }//GEN-LAST:event_JButtonAdelantarTodoMouseReleased

    private void JButtonGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonGuardarMouseReleased
        this.guardarImagen();
    }//GEN-LAST:event_JButtonGuardarMouseReleased

    private void JTextFieldNombreImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextFieldNombreImagenMouseClicked
        if(evt.getClickCount() == this.DOBLE_CLICK) {
            this.activarDesactivarControles();
        }
    }//GEN-LAST:event_JTextFieldNombreImagenMouseClicked

    private void JButtonCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCancelarMouseReleased
        if(this.JButtonCancelar.isEnabled()) {
            this.activarDesactivarControles();
        }
    }//GEN-LAST:event_JButtonCancelarMouseReleased

    private void JButtonBorrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonBorrarMouseReleased
        if(this.JButtonBorrar.isEnabled()) {
            this.imagenes.eliminarImagen();
        }
    }//GEN-LAST:event_JButtonBorrarMouseReleased

    private void JLabelVisorImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelVisorImagenMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON1) {
            this.imagenes.cambiarImagen(-1);
        } else if(evt.getButton() == MouseEvent.BUTTON3) {
            this.imagenes.cambiarImagen(1);
        }
    }//GEN-LAST:event_JLabelVisorImagenMouseClicked

    private void JTextFieldNombreImagenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreImagenKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()) {
            this.guardarImagen();
        }
    }//GEN-LAST:event_JTextFieldNombreImagenKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVisorImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new JVisorImagenes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAdelantar;
    private javax.swing.JButton JButtonAdelantarTodo;
    private javax.swing.JButton JButtonBorrar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonNuevo;
    private javax.swing.JButton JButtonRetroceder;
    private javax.swing.JButton JButtonRetrocederTodo;
    private javax.swing.JLabel JLabelNombreFoto;
    private javax.swing.JLabel JLabelVisorImagen;
    private javax.swing.JPanel JPanelSelectorImagenes;
    private javax.swing.JTextField JTextFieldNombreImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
