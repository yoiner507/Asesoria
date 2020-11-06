//En una matriz de n x m se guardan la cantidad de votos de unas elecciones, las columnas van son los partidos y las filas 
//son las regiones.
//se pide calcular el total de votos por partidos y la cantidad de votos por region
package matriz;

import java.util.Scanner;

public class Elecciones {

    private static void Imprimir_matriz(int n, int m, String matriz[][]) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("El partido %s tuvo %s voto(s).", matriz[i][0], matriz[i][1]));    
        }
    }

    private static void Llenar_matriz(int n, int m, String matriz[][]) {
        Scanner t = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre del partido");
            matriz[i][0] = t.next();
            do {
                System.out.println("Ingrese un voto.");
                while (!t.hasNextInt()) {
                    System.out.println("Error,lo que ingreso no es un dato tipo entero.");
                    System.out.println("Por fa ingrese denuevo el dato.");
                    t.next();
                }
                contador = t.nextInt();
                if (contador < 0 || contador > 15) {
                    System.out.println("El dato tiene que se mayor o igual a 0 ó menor o igual a 15.");
                } else {
                    matriz[i][1] = Integer.toString(contador);
                }
            } while (contador < 0 || contador > 15);
        }
        Imprimir_matriz(n, m, matriz) ;
    }

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int n, m = 2;

        System.out.println("Digite la cantidad de partidos politicos: ");
        n = t.nextInt();
        
        String matriz[][] = new String[n][m];

        Llenar_matriz(n, m, matriz);
    }

}
