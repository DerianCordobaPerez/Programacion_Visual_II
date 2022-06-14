package practica_05.ejercicio_01;

import java.awt.Component;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author derian
 */
public class JRegistroLibros extends javax.swing.JFrame {
    private final Libros libros;
    
    public JRegistroLibros() {
        initComponents();
        this.libros = Libros.obtenerInstancia(
            this.JTextFieldTituloLibro,
            this.JTextFieldAutorLibro,
            this.JTextFieldEditorialLibro,
            this.JTextAreaPrestadoLibro
        );
    }
    
    private Stream<Component> obtenerCampos() {
        return Stream.of(this.JPanelContenedor.getComponents())
            .filter((componente) -> componente instanceof JTextField);
    }
    
    private void reiniciarCampos() {
        this.obtenerCampos()
            .forEach((componente) -> ((JTextField)componente).setText(""));
        
        this.JTextAreaPrestadoLibro.setText("");
    }
    
    private boolean validacionCampos() {
        boolean informacion = this.obtenerCampos()
            .noneMatch((componente) -> {
                String texto = ((JTextField)componente).getText();
                
                return texto.chars().allMatch(Character::isWhitespace) || texto.trim().isEmpty();
            });
        
        return informacion && !this.JTextAreaPrestadoLibro.getText().isEmpty();
    }
    
    private void agregarLibro() {
        if(!this.validacionCampos()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos");
            return;
        }
        
        Libro libro = new Libro(
            JTextFieldTituloLibro.getText(),
            JTextFieldAutorLibro.getText(),
            JTextFieldEditorialLibro.getText(),
            JTextAreaPrestadoLibro.getText()
        );
        
        if(this.libros.agregarLibro(libro)) {
            this.reiniciarCampos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupMenuRegistro = new javax.swing.JPopupMenu();
        JMenuItemPopupRegistro = new javax.swing.JMenuItem();
        JMenuItemPopupBuscar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMenuItemPopupSalir = new javax.swing.JMenuItem();
        JPanelContenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldAutorLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTextFieldEditorialLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JScrollPanePrestadoLibro = new javax.swing.JScrollPane();
        JTextAreaPrestadoLibro = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JTextFieldTituloLibro = new javax.swing.JTextField();
        JMenuBarPrincipal = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMenuItemAgregarRegistro = new javax.swing.JMenuItem();
        JMenuItemBuscarRegistro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSalir = new javax.swing.JMenuItem();

        JMenuItemPopupRegistro.setText("Agregar registro");
        JMenuItemPopupRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemPopupRegistroActionPerformed(evt);
            }
        });
        JPopupMenuRegistro.add(JMenuItemPopupRegistro);

        JMenuItemPopupBuscar.setText("Buscar registro");
        JMenuItemPopupBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemPopupBuscarActionPerformed(evt);
            }
        });
        JPopupMenuRegistro.add(JMenuItemPopupBuscar);
        JPopupMenuRegistro.add(jSeparator2);

        JMenuItemPopupSalir.setText("Salir");
        JMenuItemPopupSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemPopupSalirActionPerformed(evt);
            }
        });
        JPopupMenuRegistro.add(JMenuItemPopupSalir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros Prestados");
        setResizable(false);

        JPanelContenedor.setComponentPopupMenu(JPopupMenuRegistro);

        jLabel2.setFont(new java.awt.Font("Cascadia Mono PL", 0, 18)); // NOI18N
        jLabel2.setText("Autor");

        jLabel3.setFont(new java.awt.Font("Cascadia Mono PL", 0, 18)); // NOI18N
        jLabel3.setText("Editorial");

        jLabel4.setFont(new java.awt.Font("Cascadia Mono PL", 0, 18)); // NOI18N
        jLabel4.setText("Prestado");

        JTextAreaPrestadoLibro.setColumns(20);
        JTextAreaPrestadoLibro.setLineWrap(true);
        JTextAreaPrestadoLibro.setRows(5);
        JScrollPanePrestadoLibro.setViewportView(JTextAreaPrestadoLibro);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono PL", 0, 18)); // NOI18N
        jLabel1.setText("Titulo");

        javax.swing.GroupLayout JPanelContenedorLayout = new javax.swing.GroupLayout(JPanelContenedor);
        JPanelContenedor.setLayout(JPanelContenedorLayout);
        JPanelContenedorLayout.setHorizontalGroup(
            JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTextFieldTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTextFieldAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelContenedorLayout.createSequentialGroup()
                        .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelContenedorLayout.createSequentialGroup()
                                .addComponent(JScrollPanePrestadoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JTextFieldEditorialLibro))))
                .addContainerGap())
        );
        JPanelContenedorLayout.setVerticalGroup(
            JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextFieldTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JScrollPanePrestadoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );

        JMenuArchivo.setMnemonic('A');
        JMenuArchivo.setText("Archivo");

        JMenuItemAgregarRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        JMenuItemAgregarRegistro.setMnemonic('A');
        JMenuItemAgregarRegistro.setText("Agregar registro");
        JMenuItemAgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAgregarRegistroActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuItemAgregarRegistro);

        JMenuItemBuscarRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        JMenuItemBuscarRegistro.setMnemonic('B');
        JMenuItemBuscarRegistro.setText("Buscar registro");
        JMenuItemBuscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemBuscarRegistroActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuItemBuscarRegistro);
        JMenuArchivo.add(jSeparator1);

        JMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        JMenuItemSalir.setMnemonic('S');
        JMenuItemSalir.setText("Salir");
        JMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSalirActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuItemSalir);

        JMenuBarPrincipal.add(JMenuArchivo);

        setJMenuBar(JMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemAgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAgregarRegistroActionPerformed
        this.agregarLibro();
    }//GEN-LAST:event_JMenuItemAgregarRegistroActionPerformed

    private void JMenuItemBuscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemBuscarRegistroActionPerformed
        JBusquedaLibro.obtenerInstancia().setVisible(true);
    }//GEN-LAST:event_JMenuItemBuscarRegistroActionPerformed

    private void JMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuItemSalirActionPerformed

    private void JMenuItemPopupRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemPopupRegistroActionPerformed
        this.agregarLibro();
    }//GEN-LAST:event_JMenuItemPopupRegistroActionPerformed

    private void JMenuItemPopupBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemPopupBuscarActionPerformed
        JBusquedaLibro.obtenerInstancia().setVisible(true);
    }//GEN-LAST:event_JMenuItemPopupBuscarActionPerformed

    private void JMenuItemPopupSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemPopupSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuItemPopupSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JRegistroLibros().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenuBar JMenuBarPrincipal;
    private javax.swing.JMenuItem JMenuItemAgregarRegistro;
    private javax.swing.JMenuItem JMenuItemBuscarRegistro;
    private javax.swing.JMenuItem JMenuItemPopupBuscar;
    private javax.swing.JMenuItem JMenuItemPopupRegistro;
    private javax.swing.JMenuItem JMenuItemPopupSalir;
    private javax.swing.JMenuItem JMenuItemSalir;
    private javax.swing.JPanel JPanelContenedor;
    private javax.swing.JPopupMenu JPopupMenuRegistro;
    private javax.swing.JScrollPane JScrollPanePrestadoLibro;
    private javax.swing.JTextArea JTextAreaPrestadoLibro;
    private javax.swing.JTextField JTextFieldAutorLibro;
    private javax.swing.JTextField JTextFieldEditorialLibro;
    private javax.swing.JTextField JTextFieldTituloLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
