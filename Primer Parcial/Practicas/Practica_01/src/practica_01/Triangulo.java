package practica_01;

public class Triangulo extends Figura {

    protected double base, altura;
    
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Area: %f", this.nombre, this.calculaArea());
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }
    
    public static void main(String... args) {
        Triangulo triangulo = new Triangulo("Triangulo propio", 15.5, 45);
        
        System.out.println("Metodo ToString: " + triangulo);
        System.out.println("Area del triangulo: " + triangulo.calculaArea());
    }
    
}
