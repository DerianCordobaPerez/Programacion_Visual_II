package practica_05;

import javax.swing.JOptionPane;

/**
 *
 * @author derian
 */
public class JBusquedaLibro extends javax.swing.JFrame {
    private final Libros libros;
    private static JBusquedaLibro instancia = null;
    
    public static JBusquedaLibro obtenerInstancia() {
        if(instancia == null) {
            instancia = new JBusquedaLibro();
        }
        
        return instancia;
    }
    
    private JBusquedaLibro() {
        initComponents();
        this.libros = Libros.obtenerInstancia();
        
        this.actualizarLista();
    }
    
    private void actualizarLista(){
        this.JListListaLibros.setListData(
            this.libros.obtenerLibros()
                .stream()
                .map((libro) -> libro.getTitulo())
                .toArray(lista -> new String[lista])
        );
    }
    
    private void aceptarLibro() {
        if(this.libros.esVacia()) {
            JOptionPane.showMessageDialog(this, "No hay titulo de libros agregados");
            return;
        }
        
        String titulo = this.JListListaLibros.getSelectedValue();
        
        if(titulo == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar alguna de las opciones");
            return;
        }
        
        this.libros.establecerLibro(titulo);
    }
    
    private void borrarLibro() {
        if(this.libros.esVacia()) {
            JOptionPane.showMessageDialog(this, "No hay titulo de libros agregados");
            return;
        }
        
        String titulo = this.JListListaLibros.getSelectedValue();

        if(titulo == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar alguna de las opciones");
            return;
        }
        
        if(this.libros.eliminarLibro(titulo)) {
            this.actualizarLista();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupMenuBusqueda = new javax.swing.JPopupMenu();
        JMenuItemAceptar = new javax.swing.JMenuItem();
        JMenuItemCancelar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemBorrar = new javax.swing.JMenuItem();
        JPanelBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListListaLibros = new javax.swing.JList<>();
        JButtonAceptar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        JButtonBorrar = new javax.swing.JButton();

        JMenuItemAceptar.setText("Aceptar");
        JMenuItemAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAceptarActionPerformed(evt);
            }
        });
        JPopupMenuBusqueda.add(JMenuItemAceptar);

        JMenuItemCancelar.setText("Cancelar");
        JMenuItemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemCancelarActionPerformed(evt);
            }
        });
        JPopupMenuBusqueda.add(JMenuItemCancelar);
        JPopupMenuBusqueda.add(jSeparator1);

        JMenuItemBorrar.setText("Borrar");
        JMenuItemBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemBorrarActionPerformed(evt);
            }
        });
        JPopupMenuBusqueda.add(JMenuItemBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar registro");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        JPanelBusqueda.setComponentPopupMenu(JPopupMenuBusqueda);

        JListListaLibros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(JListListaLibros);

        JButtonAceptar.setText("Aceptar");
        JButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAceptarMouseReleased(evt);
            }
        });

        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCancelarMouseReleased(evt);
            }
        });

        JButtonBorrar.setText("Borrar");
        JButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonBorrarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout JPanelBusquedaLayout = new javax.swing.GroupLayout(JPanelBusqueda);
        JPanelBusqueda.setLayout(JPanelBusquedaLayout);
        JPanelBusquedaLayout.setHorizontalGroup(
            JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelBusquedaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JPanelBusquedaLayout.setVerticalGroup(
            JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
            .addGroup(JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelBusquedaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(JPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelBusquedaLayout.createSequentialGroup()
                            .addComponent(JButtonAceptar)
                            .addGap(18, 18, 18)
                            .addComponent(JButtonCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(JButtonBorrar)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCancelarMouseReleased
        this.dispose();
    }//GEN-LAST:event_JButtonCancelarMouseReleased

    private void JButtonBorrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonBorrarMouseReleased
        this.borrarLibro();
    }//GEN-LAST:event_JButtonBorrarMouseReleased

    private void JButtonAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAceptarMouseReleased
        this.aceptarLibro();
    }//GEN-LAST:event_JButtonAceptarMouseReleased

    private void JMenuItemAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAceptarActionPerformed
        this.aceptarLibro();
    }//GEN-LAST:event_JMenuItemAceptarActionPerformed

    private void JMenuItemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JMenuItemCancelarActionPerformed

    private void JMenuItemBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemBorrarActionPerformed
        this.borrarLibro();
    }//GEN-LAST:event_JMenuItemBorrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        instancia = null;
    }//GEN-LAST:event_formWindowClosed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.actualizarLista();
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JBusquedaLibro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAceptar;
    private javax.swing.JButton JButtonBorrar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JList<String> JListListaLibros;
    private javax.swing.JMenuItem JMenuItemAceptar;
    private javax.swing.JMenuItem JMenuItemBorrar;
    private javax.swing.JMenuItem JMenuItemCancelar;
    private javax.swing.JPanel JPanelBusqueda;
    private javax.swing.JPopupMenu JPopupMenuBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
