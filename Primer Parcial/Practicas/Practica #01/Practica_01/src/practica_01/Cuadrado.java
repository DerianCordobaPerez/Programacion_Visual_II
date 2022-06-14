package practica_01;

public class Cuadrado extends Figura {
    protected double lado;
    
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Lado: %f", this.nombre, this.lado);
    }

    @Override
    public double calculaArea() {
        return Math.pow(lado, 2);
    }
    
    public static void main(String... args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado propio", 35.2);
        
        System.out.println("Metodo ToString: " + cuadrado);
        System.out.println("Area del triangulo: " + cuadrado.calculaArea());
    }   
}
