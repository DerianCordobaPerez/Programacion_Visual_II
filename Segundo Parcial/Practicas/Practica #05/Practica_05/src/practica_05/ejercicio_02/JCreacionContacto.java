package practica_05.ejercicio_02;

import java.awt.Component;
import java.awt.HeadlessException;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JCreacionContacto extends javax.swing.JDialog {
    private final Contactos contactos;
    
    public JCreacionContacto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.contactos = Contactos.obtenerInstancia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelCreacionContacto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldNumeroContacto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldNombresContacto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldCorreoContacto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextFieldTelefonoContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTextFieldDireccionContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextFieldGrupoContacto = new javax.swing.JTextField();
        JButtonGuardarContacto = new javax.swing.JButton();
        JButtonLimpiar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        JButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar contacto nuevo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel1.setText("Numero");

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel2.setText("Nombres y Apellidos");

        jLabel3.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel3.setText("Correo Electronico");

        jLabel4.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");

        jLabel6.setFont(new java.awt.Font("Cascadia Mono PL", 0, 14)); // NOI18N
        jLabel6.setText("Grupo");

        JButtonGuardarContacto.setText("Guardar contacto");
        JButtonGuardarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonGuardarContactoMouseReleased(evt);
            }
        });

        JButtonLimpiar.setText("Limpiar");
        JButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonLimpiarMouseReleased(evt);
            }
        });

        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonCancelarMouseReleased(evt);
            }
        });

        JButtonAceptar.setText("Aceptar");
        JButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JButtonAceptarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout JPanelCreacionContactoLayout = new javax.swing.GroupLayout(JPanelCreacionContacto);
        JPanelCreacionContacto.setLayout(JPanelCreacionContactoLayout);
        JPanelCreacionContactoLayout.setHorizontalGroup(
            JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                        .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldCorreoContacto)
                            .addComponent(JTextFieldNombresContacto)
                            .addComponent(JTextFieldNumeroContacto)))
                    .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(106, 106, 106)
                        .addComponent(JTextFieldTelefonoContacto))
                    .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98)
                        .addComponent(JTextFieldDireccionContacto))
                    .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(130, 130, 130)
                        .addComponent(JTextFieldGrupoContacto))
                    .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                        .addComponent(JButtonGuardarContacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonAceptar)))
                .addContainerGap())
        );
        JPanelCreacionContactoLayout.setVerticalGroup(
            JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCreacionContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldNumeroContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldNombresContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldCorreoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextFieldTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTextFieldDireccionContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTextFieldGrupoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCreacionContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonGuardarContacto)
                    .addComponent(JButtonLimpiar)
                    .addComponent(JButtonCancelar)
                    .addComponent(JButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCreacionContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCreacionContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Stream<Component> obtenerCampos() {
        return Stream.of(this.JPanelCreacionContacto.getComponents())
            .filter((componente) -> componente instanceof JTextField);
    }
    
    private boolean validacionCampos() {
        return this.obtenerCampos()
            .noneMatch((componente) -> {
                String texto = ((JTextField)componente).getText();
                
                return texto.chars().allMatch(Character::isWhitespace) || texto.trim().isEmpty();
            });
    }
    
    private void reiniciarCampos() {
        this.obtenerCampos()
            .forEach((componente) -> ((JTextField)componente).setText(""));
    }
    
    private void JButtonCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCancelarMouseReleased
        this.contactos.descartarContactos();
        this.dispose();
    }//GEN-LAST:event_JButtonCancelarMouseReleased

    private void JButtonLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonLimpiarMouseReleased
        this.reiniciarCampos();
    }//GEN-LAST:event_JButtonLimpiarMouseReleased

    private void JButtonGuardarContactoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonGuardarContactoMouseReleased
        if(!this.validacionCampos()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos");
            return;
        }
        
        try {
            Contacto contacto = new Contacto(
                Integer.parseInt(this.JTextFieldNumeroContacto.getText()),
                this.JTextFieldNombresContacto.getText(),
                this.JTextFieldCorreoContacto.getText(),
                this.JTextFieldTelefonoContacto.getText(),
                this.JTextFieldDireccionContacto.getText(),
                this.JTextFieldGrupoContacto.getText()
            );

            if(this.contactos.guardarContacto(contacto)) {
                JOptionPane.showMessageDialog(this, "Contacto agregado correctamente");
                this.reiniciarCampos();
            }
        } catch(HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El numero del usuario no mantiene un formato correcto");
        }
    }//GEN-LAST:event_JButtonGuardarContactoMouseReleased

    private void JButtonAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAceptarMouseReleased
        this.contactos.almacenarContactos();
        this.dispose();
    }//GEN-LAST:event_JButtonAceptarMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.contactos.descartarContactos();
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            JCreacionContacto dialog = new JCreacionContacto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JButtonAceptar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonGuardarContacto;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JPanel JPanelCreacionContacto;
    private javax.swing.JTextField JTextFieldCorreoContacto;
    private javax.swing.JTextField JTextFieldDireccionContacto;
    private javax.swing.JTextField JTextFieldGrupoContacto;
    private javax.swing.JTextField JTextFieldNombresContacto;
    private javax.swing.JTextField JTextFieldNumeroContacto;
    private javax.swing.JTextField JTextFieldTelefonoContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
