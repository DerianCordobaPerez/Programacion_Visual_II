package practica_00;

import java.io.IOException;

public class Ejercicio_03 {
    public static void main(String... args) throws IOException {
        System.out.println("Ingrese la cantidad de grupos");
        int numeroGrupos = Utilidades.leerEntero();
        
        double [][] promedios = new double [numeroGrupos][];
        double [] promedioGrupo = new double [numeroGrupos];
        double promedioTotal = 0;
        
        for(int i = 0; i < numeroGrupos; ++i){
            System.out.println("Ingrese la cantidad de alumnos para el Grupo #" + (i + 1));
            int numeroAlumnos = Utilidades.leerEntero();
            promedios[i] = new double[numeroAlumnos];
            
            for(int j = 0; j < promedios[i].length; ++j){
                System.out.println("Ingrese la cantidad de materias para el alumno #" + (j + 1));
                int numeroMaterias = Utilidades.leerEntero();
                double promedioMaterias = 0;
                
                for(int k = 0; k < numeroMaterias; ++k){
                    System.out.println("Materia " + (k + 1) + ": ");
                    double materia = 0;
                    
                    for(int l = 0; l < 3; ++l){
                        System.out.print("Calificación "+(l + 1)+": ");
                        materia += Utilidades.leerDecimal();
                    }
                    promedioMaterias += materia/3;
                }

                promedios[i][j] = promedioMaterias / numeroMaterias;
                promedioGrupo[i] += promedios[i][j];
            }
            
            promedioGrupo[i] = promedioGrupo[i] / numeroAlumnos;
            promedioTotal += promedioGrupo[i];
        }
        
        promedioTotal = promedioTotal / numeroGrupos;
        
        Utilidades.imprimirSeparador(45, '=');
        for(int i = 0; i < numeroGrupos; ++i) {
            System.out.format("%30s | %3f\n", "Grupo: " + (i + 1), promedioGrupo[i]);
            for(int j = 0; j < promedios[i].length; ++j) {
                System.out.format("%30s | %3f\n", "Alumno: " + (i + 1), promedios[i][j]);
            }
            Utilidades.imprimirSeparador(45, '-');
        }
        
        System.out.format("%30s | %3f\n", "Promedio total: ", promedioTotal);
        Utilidades.imprimirSeparador(45, '=');

    }
}
