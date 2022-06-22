import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author derian
 */
class EjericioEjemplo01 extends JFrame
{
    public EjericioEjemplo01() {
        initComponents();
    }
    
    private void initComponents() {
        JLabel lblTexto = new JLabel("Ingrese aquí su texto: ");
        lblTexto.setBounds(45,20,125,15);
        
        JTextField txtTexto = new JTextField();
        txtTexto.setBounds(170,20,150,20);

        txtTexto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtTextoFocusGained(e);
            }
        });
        
        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                txtTextoKeyReleased(e);
            }
        });
        
        JButton btnSeleccionar = new JButton("Seleccionar texto");
        btnSeleccionar.setBounds(100,60,150,20);

        btnSeleccionar.setMnemonic('e');

        btnSeleccionar.setToolTipText("Clic aquí para seleccionar el texto de la caja de texto");

        btnSeleccionar.addActionListener((ActionEvent e) -> {
            btnSeleccionarActionPerformed(e);
        });
        
        setTitle("Ejercicio 1");
        setSize(390,150);
        getContentPane().setLayout(null);
        getRootPane().setDefaultButton(btnSeleccionar);
        getContentPane().add(lblTexto);
        getContentPane().add(txtTexto);
        getContentPane().add(btnSeleccionar);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frameWindowClosing(e);
            }
        });
        
    }
    
    public void frameWindowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    public void btnSeleccionarActionPerformed(ActionEvent e) {
        txtTexto.requestFocus();
    }
    
    public void txtTextoFocusGained(FocusEvent e) {
        txtTexto.selectAll();
    }
    
    public void txtTextoKeyReleased(KeyEvent e) {
        char[] fuente = txtTexto.getText().toCharArray();
        char[] resultado = new char[fuente.length];
        int j = 0;
        boolean error = false;
        
        for(int i=0;i<fuente.length;i++) {
            if(Character.isLetter(fuente[i]))
                resultado[j++]=fuente[i];
            else {
                error = true;
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        }

        if(error) {
            txtTexto.setText(new String(resultado,0,j));
        }
    }
    
    public static void main(String[] args) {
        new EjericioEjemplo01().setVisible(true);
    }
    
    private final JLabel lblTexto = null;
    private final JTextField txtTexto = null;
    private final JButton btnSeleccionar = null;
}
