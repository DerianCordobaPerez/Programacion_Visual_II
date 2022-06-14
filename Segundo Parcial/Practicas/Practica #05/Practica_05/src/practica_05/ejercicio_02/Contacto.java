package practica_05.ejercicio_02;

/**
 *
 * @author deria
 */
public class Contacto {
    private int numero;
    private String nombres, correo, telefono, direccion, grupo;
    
    public Contacto(
        int numero,
        String nombres,
        String correo,
        String telefono,
        String direccion,
        String grupo
    ) {
        this.numero = numero;
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.grupo = grupo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
}
