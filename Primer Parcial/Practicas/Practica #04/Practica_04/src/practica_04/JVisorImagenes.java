package practica_04;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class JVisorImagenes extends javax.swing.JFrame {

    private final Imagenes imagenes;
    private final int DOBLE_CLICK = 2;
    
    public JVisorImagenes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.imagenes = new Imagenes(this.JLabelVisorImagen, this.JLabelNombreFoto, this.JButtonBorrar, this.JCheckBoxDescripcion, this.JRadioButtonGrises);
    }
    
    private void activarDesactivarControles() {
        boolean habilitado = this.JTextFieldNombreImagen.isEnabled();
            
        Arrays.asList(
            this.JButtonCancelar,
            this.JButtonGuardar
        ).forEach(componente -> componente.setEnabled(!habilitado));

        if(habilitado) {
            this.JTextFieldNombreImagen.setText("");
            this.JTextFieldDescripcionImagen.setText("");
            this.JCheckBoxCambios.setEnabled(!this.imagenes.esVacia());
        } else {
            this.JCheckBoxCambios.setEnabled(false);
        }
        
        this.JCheckBoxDescripcion.setEnabled(habilitado);
        
        this.JButtonNuevo.setEnabled(habilitado);
        this.JTextFieldNombreImagen.setEnabled(!habilitado);
        this.JTextFieldDescripcionImagen.setEnabled(!habilitado);
    }
    
    private void guardarImagen() {
        if(this.JTextFieldNombreImagen.getText().trim().isEmpty() || this.JTextFieldDescripcionImagen.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la imagen o la descripcion no es correcta");
        } else {
            this.imagenes.agregarImagen(this.JTextFieldNombreImagen.getText(), this.JTextFieldDescripcionImagen.getText());
            this.activarDesactivarControles();
            this.JCheckBoxCambios.setEnabled(true);
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroupVision = new javax.swing.ButtonGroup();
        JPanelSelectorImagenes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldNombreImagen = new javax.swing.JTextField();
        JButtonNuevo = new javax.swing.JButton();
        JButtonGuardar = new javax.swing.JButton();
        JButtonBorrar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldDescripcionImagen = new javax.swing.JTextField();
        JLabelNombreFoto = new javax.swing.JLabel();
        JLabelVisorImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JButtonRetrocederTodo = new javax.swing.JButton();
        JButtonRetroceder = new javax.swing.JButton();
        JButtonAdelantarTodo = new javax.swing.JButton();
        JButtonAdelantar = new javax.swing.JButton();
        JPanelVision = new javax.swing.JPanel();
        JRadioButtonNormal = new javax.swing.JRadioButton();
        JRadioButtonGrises = new javax.swing.JRadioButton();
        JCheckBoxDescripcion = new javax.swing.JCheckBox();
        JCheckBoxCambios = new javax.swing.JCheckBox();

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

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion de la imagen");

        JTextFieldDescripcionImagen.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JTextFieldDescripcionImagen.setToolTipText("");
        JTextFieldDescripcionImagen.setEnabled(false);
        JTextFieldDescripcionImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextFieldDescripcionImagenMouseClicked(evt);
            }
        });
        JTextFieldDescripcionImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldDescripcionImagenKeyPressed(evt);
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
                        .addComponent(JButtonNuevo)
                        .addGap(49, 49, 49)
                        .addComponent(JButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonBorrar)
                        .addGap(57, 57, 57)
                        .addComponent(JButtonCancelar))
                    .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                        .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldNombreImagen)
                            .addComponent(JTextFieldDescripcionImagen))))
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
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldDescripcionImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        JPanelVision.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vision", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono PL", 0, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        JPanelVision.setEnabled(false);

        ButtonGroupVision.add(JRadioButtonNormal);
        JRadioButtonNormal.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JRadioButtonNormal.setSelected(true);
        JRadioButtonNormal.setText("Normal");
        JRadioButtonNormal.setEnabled(false);
        JRadioButtonNormal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JRadioButtonNormalStateChanged(evt);
            }
        });

        ButtonGroupVision.add(JRadioButtonGrises);
        JRadioButtonGrises.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JRadioButtonGrises.setText("Escala de grises");
        JRadioButtonGrises.setEnabled(false);
        JRadioButtonGrises.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JRadioButtonGrisesStateChanged(evt);
            }
        });

        javax.swing.GroupLayout JPanelVisionLayout = new javax.swing.GroupLayout(JPanelVision);
        JPanelVision.setLayout(JPanelVisionLayout);
        JPanelVisionLayout.setHorizontalGroup(
            JPanelVisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelVisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRadioButtonNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(JRadioButtonGrises)
                .addContainerGap())
        );
        JPanelVisionLayout.setVerticalGroup(
            JPanelVisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelVisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelVisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRadioButtonNormal)
                    .addComponent(JRadioButtonGrises))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        JCheckBoxDescripcion.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JCheckBoxDescripcion.setText("Mostrar descripción");
        JCheckBoxDescripcion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JCheckBoxDescripcionStateChanged(evt);
            }
        });

        JCheckBoxCambios.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JCheckBoxCambios.setText("Permitir cambios");
        JCheckBoxCambios.setEnabled(false);
        JCheckBoxCambios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JCheckBoxCambiosStateChanged(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelVision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCheckBoxDescripcion)
                    .addComponent(JCheckBoxCambios))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelSelectorImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPanelVision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JCheckBoxDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCheckBoxCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(JLabelNombreFoto)
                .addGap(18, 18, 18)
                .addComponent(JLabelVisorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        if(this.JButtonGuardar.isEnabled()) {
            this.guardarImagen();
        }
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
            this.JCheckBoxCambios.setEnabled(!this.imagenes.esVacia());
            if(this.imagenes.esVacia()) {
                this.JCheckBoxCambios.setSelected(false);
            }
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

    private void JTextFieldDescripcionImagenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldDescripcionImagenKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()) {
            this.guardarImagen();
        }
    }//GEN-LAST:event_JTextFieldDescripcionImagenKeyPressed

    private void JTextFieldDescripcionImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextFieldDescripcionImagenMouseClicked
        if(evt.getClickCount() == this.DOBLE_CLICK) {
            this.activarDesactivarControles();
        }
    }//GEN-LAST:event_JTextFieldDescripcionImagenMouseClicked

    private void JCheckBoxCambiosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JCheckBoxCambiosStateChanged
        this.JPanelVision.setEnabled(!this.imagenes.esVacia() && this.JCheckBoxCambios.isEnabled() && this.JCheckBoxCambios.isSelected());
        this.JRadioButtonGrises.setEnabled(!this.imagenes.esVacia() && this.JCheckBoxCambios.isEnabled() && this.JCheckBoxCambios.isSelected());
        this.JRadioButtonNormal.setEnabled(!this.imagenes.esVacia() && this.JCheckBoxCambios.isEnabled() && this.JCheckBoxCambios.isSelected());
    }//GEN-LAST:event_JCheckBoxCambiosStateChanged

    private void JCheckBoxDescripcionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JCheckBoxDescripcionStateChanged
        this.imagenes.cambiarInformacionImagen();
    }//GEN-LAST:event_JCheckBoxDescripcionStateChanged

    private void JRadioButtonNormalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JRadioButtonNormalStateChanged
        if(this.JCheckBoxCambios.isEnabled()) {
            this.imagenes.obtenerImagen();
        }
    }//GEN-LAST:event_JRadioButtonNormalStateChanged

    private void JRadioButtonGrisesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JRadioButtonGrisesStateChanged
        if(this.JCheckBoxCambios.isEnabled()) {
            this.imagenes.obtenerImagen();
        }
    }//GEN-LAST:event_JRadioButtonGrisesStateChanged

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

        java.awt.EventQueue.invokeLater(() -> {
            new JVisorImagenes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroupVision;
    private javax.swing.JButton JButtonAdelantar;
    private javax.swing.JButton JButtonAdelantarTodo;
    private javax.swing.JButton JButtonBorrar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonNuevo;
    private javax.swing.JButton JButtonRetroceder;
    private javax.swing.JButton JButtonRetrocederTodo;
    private javax.swing.JCheckBox JCheckBoxCambios;
    private javax.swing.JCheckBox JCheckBoxDescripcion;
    private javax.swing.JLabel JLabelNombreFoto;
    private javax.swing.JLabel JLabelVisorImagen;
    private javax.swing.JPanel JPanelSelectorImagenes;
    private javax.swing.JPanel JPanelVision;
    private javax.swing.JRadioButton JRadioButtonGrises;
    private javax.swing.JRadioButton JRadioButtonNormal;
    private javax.swing.JTextField JTextFieldDescripcionImagen;
    private javax.swing.JTextField JTextFieldNombreImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
