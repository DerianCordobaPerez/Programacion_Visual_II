package practica_00;

import java.io.IOException;

public class Ejercicio_01 {

    public static void main(String... args) throws IOException {         
        System.out.println("Ingrese la cantidad de obreros");
        int cantidadObreros = Utilidades.leerEntero();
        
        int obreros[] = new int[cantidadObreros];
        
        for(int i = 0; i < cantidadObreros; ++i) {            
            System.out.println("Ingrese las horas trabajadas para el obrero numero #" + (i + 1));
            int horas = Utilidades.leerEntero();
            
            if(horas <= 40) {
                obreros[i] = horas * 20;
            } else {
                int extras = horas - 40;
                obreros[i] = 40 * 20 + (extras * 25);
            }
        }
        
        Utilidades.imprimirSeparador(36, '=');
        for(int i = 0; i < cantidadObreros; i++) {
            System.out.format("Salario del Obrero numero #%2d: %4d\n", (i + 1), obreros[i]);
            Utilidades.imprimirSeparador(36, '-');
        }
        Utilidades.imprimirSeparador(36, '=');
    }
    
}
