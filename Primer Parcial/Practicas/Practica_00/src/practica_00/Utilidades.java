package practica_00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {
    private static final InputStreamReader ENTRADA = new InputStreamReader(System.in);
    private static final BufferedReader FLUJO = new BufferedReader(ENTRADA);
    
    public static String leerCadena() throws IOException {
        return FLUJO.readLine();
    }
    
    public static int leerEntero() throws IOException {
        return Integer.parseInt(leerCadena());
    }
    
    public static double leerDecimal() throws IOException {
        return Double.parseDouble(leerCadena());
    }
    
    public static void imprimirSeparador(int cantidad, char caracter) {
        for(int i = 0; i < cantidad; ++i) {
            System.out.print(caracter);
        }
        System.out.println("");
    }
}
