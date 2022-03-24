package practica_01;

public class Test {

    public static void main(String... args) {
        Triangulo triangulo = new Triangulo("Triangulo programador", 52.3, 12);
        Cuadrado cuadrado = new Cuadrado("Cuadrado programador", 40);
        
        System.out.println("Metodo ToString: " + triangulo);
        System.out.println("Area del triangulo: " + triangulo.calculaArea());
        
        System.out.println("Metodo ToString: " + cuadrado);
        System.out.println("Area del triangulo: " + cuadrado.calculaArea());
        
        AreaFigura areaFigura = new AreaFigura(4);
        areaFigura.agregarFigura(cuadrado);
        areaFigura.agregarFigura(triangulo);
        
        areaFigura.agregarFigura(new Cuadrado("Derian", 0));
        areaFigura.agregarFigura(new Cuadrado("Derian", 0));
        areaFigura.agregarFigura(new Cuadrado("Derian", 0));
        areaFigura.agregarFigura(new Cuadrado("Derian", 0));

        areaFigura.calculaAreaTotal();
        areaFigura.imprime();
    }
    
}
