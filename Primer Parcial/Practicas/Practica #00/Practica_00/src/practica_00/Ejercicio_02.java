package practica_00;

import java.io.IOException;

public class Ejercicio_02 {
    public static void main(String... args) throws IOException {
        System.out.println("Ingrese la cantidad de clientes");
        int cantidadClientes = Utilidades.leerEntero();
        
        double clientes[] = new double[cantidadClientes];
        double total = 0;
        
        for(int i = 0; i < cantidadClientes; i++) {
            System.out.println("Ingrese la cantidad de productos para el cliente #" + (i + 1));
            int cantidadProductos = Utilidades.leerEntero();
            
            for(int j = 0; j < cantidadProductos; ++j) {
                System.out.println("Ingrese el precio del producto #" + (j + 1));
                clientes[i] += Utilidades.leerDecimal();
            }
            
            total += clientes[i];
        }
        
        
        Utilidades.imprimirSeparador(45, '=');
        for(int i = 0; i < cantidadClientes; ++i) {
            System.out.format("%30s | %4f\n", "Precio total para el cliente #" + (i + 1), clientes[i]);
            Utilidades.imprimirSeparador(45, '-');
        }
        
        System.out.format("%30s | %4f\n", "Total", total);
        Utilidades.imprimirSeparador(45, '=');
    }
}
