package practica_06.Ejercicio_02;

/**
 *
 * @author derian-cordoba
 */
public class JBlocNotas extends javax.swing.JFrame {

    public JBlocNotas() {
        initComponents();
        
        new ContadorPalabras(
            this.JLabelPalabras, 
            this.JTextAreaBlocContenido, 
            "Contador de palabras"
        ).start();
        
        new ContadorCaracteresSinEspacio(
            this.JLabelCaracteresSinEspacio, 
            this.JTextAreaBlocContenido, 
            "Contador de caracteres sin espacio"
        ).start();
        
        new ContadorCaracteresConEspacio(
            this.JLabelCaracteresConEspacio, 
            this.JTextAreaBlocContenido, 
            "Contador de caracteres con espacio"
        ).start();
        
        new ContadorParrafos(
            this.JLabelCaracteresParrafos, 
            this.JTextAreaBlocContenido, 
            "Contador de parrafos"
        ).start();
        
        new ContadorLineas(
                this.JLabelCaracteresLineas, 
                this.JTextAreaBlocContenido, 
                "Contador de lineas"
        ).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelInformacion = new javax.swing.JPanel();
        JLabelPalabras = new javax.swing.JLabel();
        JLabelCaracteresSinEspacio = new javax.swing.JLabel();
        JLabelCaracteresConEspacio = new javax.swing.JLabel();
        JLabelCaracteresParrafos = new javax.swing.JLabel();
        JLabelCaracteresLineas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaBlocContenido = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador con hilos");
        setResizable(false);

        JPanelInformacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        JLabelPalabras.setText("jLabel1");
        JPanelInformacion.add(JLabelPalabras);

        JLabelCaracteresSinEspacio.setText("jLabel1");
        JPanelInformacion.add(JLabelCaracteresSinEspacio);

        JLabelCaracteresConEspacio.setText("jLabel1");
        JPanelInformacion.add(JLabelCaracteresConEspacio);

        JLabelCaracteresParrafos.setText("jLabel1");
        JPanelInformacion.add(JLabelCaracteresParrafos);

        JLabelCaracteresLineas.setText("jLabel1");
        JPanelInformacion.add(JLabelCaracteresLineas);

        JTextAreaBlocContenido.setColumns(20);
        JTextAreaBlocContenido.setRows(5);
        jScrollPane1.setViewportView(JTextAreaBlocContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(JPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JPanelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JBlocNotas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelCaracteresConEspacio;
    private javax.swing.JLabel JLabelCaracteresLineas;
    private javax.swing.JLabel JLabelCaracteresParrafos;
    private javax.swing.JLabel JLabelCaracteresSinEspacio;
    private javax.swing.JLabel JLabelPalabras;
    private javax.swing.JPanel JPanelInformacion;
    private javax.swing.JTextArea JTextAreaBlocContenido;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
