package practica_05.ejercicio_02;

/**
 *
 * @author deria
 */
public class JVentanaContactos extends javax.swing.JFrame {
    private final Contactos contactos;
    
    public JVentanaContactos() {
        initComponents();
        this.contactos = Contactos.obtenerInstancia();
        this.actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonAgregarContacto = new javax.swing.JButton();
        JButtonActualizarContactos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListContactos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de contactos");
        setResizable(false);

        JButtonAgregarContacto.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JButtonAgregarContacto.setText("Agregar contacto");
        JButtonAgregarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAgregarContactoMouseReleased(evt);
            }
        });

        JButtonActualizarContactos.setFont(new java.awt.Font("Cascadia Mono PL", 0, 12)); // NOI18N
        JButtonActualizarContactos.setText("Actualizar lista");
        JButtonActualizarContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonActualizarContactosMouseReleased(evt);
            }
        });

        JListContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListContactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(JButtonActualizarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonActualizarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarLista(){
        this.JListContactos.setListData(
            this.contactos.obtenerContactos()
                .stream()
                .map((contacto) -> contacto.getNombres())
                .toArray(lista -> new String[lista])
        );
    }
    
    private void JButtonAgregarContactoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAgregarContactoMouseReleased
        new JCreacionContacto(this, true).setVisible(true);
    }//GEN-LAST:event_JButtonAgregarContactoMouseReleased

    private void JButtonActualizarContactosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonActualizarContactosMouseReleased
        this.actualizarLista();
    }//GEN-LAST:event_JButtonActualizarContactosMouseReleased

    private void JListContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListContactosMouseClicked
        int indice = this.JListContactos.locationToIndex(evt.getPoint());
        this.contactos.cambiarIndiceContacto(indice);
        
        new JDetallesContacto(this, true).setVisible(true);
    }//GEN-LAST:event_JListContactosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JVentanaContactos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonActualizarContactos;
    private javax.swing.JButton JButtonAgregarContacto;
    private javax.swing.JList<String> JListContactos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
