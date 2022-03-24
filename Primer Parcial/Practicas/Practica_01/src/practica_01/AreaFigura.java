package practica_01;

public class AreaFigura {
    Figura figuras[] = null;
    
    
    public AreaFigura(int numeroFiguras) {
        this.figuras = new Figura[numeroFiguras];
    }
    
    public void agregarFigura(Figura figura) {
        for(int i = 0; i < this.figuras.length; ++i) {
            if(figuras[i] == null) {
                figuras[i] = figura;
                System.out.println("La figura fue agregada correctamente.");
                return;
            }
        }
        
        System.out.println("La figura no fue agregada debido que todos los espacios se encuentran llenos.");
    }
    
    public double calculaAreaTotal() {
        double total = 0;
        
        for(Figura figura : this.figuras) {
            if(figura != null) {
                total += figura.calculaArea();
            } 
        }
        
        return total;
    }
    
    public void imprime() {
        System.out.println("Area de cada figura");
        for(Figura figura : this.figuras) {
            if(figura != null) {
                System.out.println(figura.calculaArea());
            }
        }
        
        System.out.println("Suma de todas las areas: " + this.calculaAreaTotal());
    }
    
    public static void main(String... args) {
        Triangulo triangulo = new Triangulo("Triangulo programador", 52.3, 12);
        Cuadrado cuadrado = new Cuadrado("Cuadrado programador", 40);
        
        System.out.println("Metodo ToString: " + triangulo);
        System.out.println("Area del triangulo: " + triangulo.calculaArea());
        
        System.out.println("Metodo ToString: " + cuadrado);
        System.out.println("Area del triangulo: " + cuadrado.calculaArea());
        
        AreaFigura areaFigura = new AreaFigura(2);
        areaFigura.agregarFigura(cuadrado);
        areaFigura.agregarFigura(triangulo);
        
        areaFigura.agregarFigura(new Cuadrado("Nuevo cuadrado", 0));
        areaFigura.agregarFigura(new Triangulo("Triangulo", 735, 8));
        areaFigura.agregarFigura(new Cuadrado("Otro cuadrado", 0));

        areaFigura.calculaAreaTotal();
        areaFigura.imprime();
    }
}