package practica_03;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JVisorImagenes extends javax.swing.JFrame {

    private final Imagenes imagenes;
    private final int DOBLE_CLICK = 2;
    
    public JVisorImagenes() {
        initComponents();
        this.imagenes = new Imagenes(this.JLabelVisorImagen, this.JLabelNombreFoto, this.JButtonBorrar);
    }
    
    private BufferedImage obtenerBufferedImagenDesdeIcono(Icon icon) {
        BufferedImage buffer = new BufferedImage(
                icon.getIconWidth(), 
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB
        );
        Graphics g = buffer.getGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        return buffer;
    }
    
    private void activarDesactivarControles() {
        boolean habilitado = this.imagenes.esVacia();
        this.JButtonBorrar.setEnabled(!habilitado);
        this.JButtonGuardarComo.setEnabled(!habilitado);
    }
    
    private void guardarImagen(String imagen) {
        if(imagen.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la imagen no puede ser vacio");
            return;
        }
        
        this.imagenes.agregarImagen(imagen);
        this.activarDesactivarControles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelSelectorImagenes = new javax.swing.JPanel();
        JButtonNuevo = new javax.swing.JButton();
        JButtonBorrar = new javax.swing.JButton();
        JButtonGuardarComo = new javax.swing.JButton();
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

        JButtonNuevo.setText("Nuevo");
        JButtonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonNuevoMouseReleased(evt);
            }
        });

        JButtonBorrar.setText("Borrar");
        JButtonBorrar.setEnabled(false);
        JButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonBorrarMouseReleased(evt);
            }
        });

        JButtonGuardarComo.setText("Guardar Como");
        JButtonGuardarComo.setEnabled(false);
        JButtonGuardarComo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonGuardarComoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout JPanelSelectorImagenesLayout = new javax.swing.GroupLayout(JPanelSelectorImagenes);
        JPanelSelectorImagenes.setLayout(JPanelSelectorImagenesLayout);
        JPanelSelectorImagenesLayout.setHorizontalGroup(
            JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                .addComponent(JButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(JButtonGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelSelectorImagenesLayout.setVerticalGroup(
            JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSelectorImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelSelectorImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonNuevo)
                    .addComponent(JButtonBorrar)
                    .addComponent(JButtonGuardarComo))
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
                        .addGap(0, 176, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelVisorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonNuevoMouseReleased
        JFileChooser ventanaAbrir = new JFileChooser(System.getProperty("user.dir"));
        FileNameExtensionFilter extensiones = new FileNameExtensionFilter("Imagenes JPG y PNG", "jpg", "jpeg", "png");
        ventanaAbrir.setFileFilter(extensiones);
        
        try {
            int imagenSeleccionada = ventanaAbrir.showOpenDialog(this);
        
            if(imagenSeleccionada == JFileChooser.APPROVE_OPTION) {
                String imagen = ventanaAbrir.getSelectedFile().getName();
                this.guardarImagen(imagen);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen");
            }
        } catch(HeadlessException e) {
            System.out.println(e.getMessage());
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

    private void JButtonGuardarComoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonGuardarComoMouseReleased
        if(this.JButtonGuardarComo.isEnabled()) {
            JFileChooser ventanaGuardar = new JFileChooser();
            ventanaGuardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int imagenSeleccionada = ventanaGuardar.showSaveDialog(this);
            
            if(imagenSeleccionada == JFileChooser.APPROVE_OPTION) {
                try {
                    Icon icono = this.JLabelVisorImagen.getIcon();
                    BufferedImage imagen = this.obtenerBufferedImagenDesdeIcono(icono);
                    
                    boolean guardado = ImageIO.write(
                        imagen,
                        "jpg", 
                        ventanaGuardar.getSelectedFile().getAbsoluteFile()
                    );
                    
                    if(!guardado) {
                        JOptionPane.showMessageDialog(this, "La imagen no se ha podido guardar correctamente");
                        return;
                    }
                    
                    JOptionPane.showMessageDialog(this, "Imagen guardada correctamente");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha podido guardar la imagen");
            }
        }
    }//GEN-LAST:event_JButtonGuardarComoMouseReleased

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
    private javax.swing.JButton JButtonGuardarComo;
    private javax.swing.JButton JButtonNuevo;
    private javax.swing.JButton JButtonRetroceder;
    private javax.swing.JButton JButtonRetrocederTodo;
    private javax.swing.JLabel JLabelNombreFoto;
    private javax.swing.JLabel JLabelVisorImagen;
    private javax.swing.JPanel JPanelSelectorImagenes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
