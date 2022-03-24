package practica_01;

public abstract class Figura {
    String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public abstract String toString();
    public abstract double calculaArea();
    
    public String getNombre() {
        return this.nombre;
    }
}
