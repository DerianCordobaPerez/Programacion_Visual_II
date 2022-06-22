package practica_05.ejercicio_02;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author deria
 */
public class Contactos {
    private final ArrayList<Contacto> contactos, temporales;
    private static Contactos instancia = null;
    private int indice = -1;
    
    private Contactos() {
        this.contactos = new ArrayList<>();
        this.temporales = new ArrayList<>();
    }
    
    public static Contactos obtenerInstancia() {
        if(instancia == null) {
            instancia = new Contactos();
        }
        
        return instancia;
    }
    
    private boolean buscarEnContactos(ArrayList<Contacto> lista, String correo, int numero) {
        boolean existeCorreo = lista.stream()
            .anyMatch((contacto) -> (contacto.getCorreo().equalsIgnoreCase(correo)));
        
        boolean existeNumero = lista.stream()
            .anyMatch((contacto) -> (contacto.getNumero() == numero));
        
        return existeCorreo || existeNumero;
    }
    
    private boolean existeContacto(String correo, int numero) {
        boolean existeContactos =  this.buscarEnContactos(this.contactos, correo, numero);
        boolean existeTemporales = this.buscarEnContactos(this.temporales, correo, numero);
        
        return existeContactos || existeTemporales;
    }
    
    public ArrayList<Contacto> obtenerContactos() {
        return this.contactos;
    }
    
    public boolean guardarContacto(Contacto contacto) {
        if(this.existeContacto(contacto.getCorreo(), contacto.getNumero())) {
            JOptionPane.showMessageDialog(null, "El contacto con el correo que desea ingresar ya existe.");
            return false;
        }
        
        this.temporales.add(contacto);
        return true;
    }
    
    public void descartarContactos() {
        this.temporales.clear();
    }
    
    public void almacenarContactos() {
        this.contactos.addAll(this.temporales);
        this.descartarContactos();
    }
    
    public void cambiarIndiceContacto(int indice) {
        this.indice = indice;
    }
    
    public Contacto obtenerContacto() {
        if(this.indice != -1) {
            return this.contactos.get(indice);
        }
        
        return null;
    }
}
