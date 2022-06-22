package practica_05.ejercicio_02;

/**
 *
 * @author deria
 */
public class JDetallesContacto extends javax.swing.JDialog {
    private final Contactos contactos;
    
    public JDetallesContacto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.contactos = Contactos.obtenerInstancia();
        Contacto contacto = this.contactos.obtenerContacto();
        
        this.JLabelNumero.setText(this.JLabelNumero.getText() + contacto.getNumero());
        this.JLabelNombres.setText(this.JLabelNombres.getText() + contacto.getNombres());
        this.JLabelCorreo.setText(this.JLabelCorreo.getText() + contacto.getCorreo());
        this.JLabelTelefono.setText(this.JLabelTelefono.getText() + contacto.getTelefono());
        this.JLabelDireccion.setText(this.JLabelDireccion.getText() + contacto.getDireccion());
        this.JLabelGrupo.setText(this.JLabelGrupo.getText() + contacto.getGrupo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelNumero = new javax.swing.JLabel();
        JLabelNombres = new javax.swing.JLabel();
        JLabelCorreo = new javax.swing.JLabel();
        JLabelTelefono = new javax.swing.JLabel();
        JLabelDireccion = new javax.swing.JLabel();
        JLabelGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información del contacto");
        setResizable(false);

        JLabelNumero.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelNumero.setText("Numero: ");

        JLabelNombres.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelNombres.setText("Nombres: ");

        JLabelCorreo.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelCorreo.setText("Correo: ");

        JLabelTelefono.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelTelefono.setText("Telefono: ");

        JLabelDireccion.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelDireccion.setText("Dirección: ");

        JLabelGrupo.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        JLabelGrupo.setText("Grupo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelNumero)
                    .addComponent(JLabelNombres)
                    .addComponent(JLabelCorreo)
                    .addComponent(JLabelTelefono)
                    .addComponent(JLabelDireccion)
                    .addComponent(JLabelGrupo))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelNumero)
                .addGap(18, 18, 18)
                .addComponent(JLabelNombres)
                .addGap(18, 18, 18)
                .addComponent(JLabelCorreo)
                .addGap(18, 18, 18)
                .addComponent(JLabelTelefono)
                .addGap(18, 18, 18)
                .addComponent(JLabelDireccion)
                .addGap(18, 18, 18)
                .addComponent(JLabelGrupo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            JDetallesContacto dialog = new JDetallesContacto(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelCorreo;
    private javax.swing.JLabel JLabelDireccion;
    private javax.swing.JLabel JLabelGrupo;
    private javax.swing.JLabel JLabelNombres;
    private javax.swing.JLabel JLabelNumero;
    private javax.swing.JLabel JLabelTelefono;
    // End of variables declaration//GEN-END:variables
}
