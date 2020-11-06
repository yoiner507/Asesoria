package asesoria;

import java.util.Scanner;

public class Metodo_Vector {

    private static Scanner teclado = new Scanner(System.in);
    public static int i;

    public static void main(String[] args) {
        int n;
        System.out.println("Digite la dimensión: ");
        n = teclado.nextInt();
        int Edades[] = new int[n];
        LLenar_vector(n, Edades);
        System.out.println("El vector es: ");
        //mostrar_metodo(n, Edades);
        edad_mayor_menor(n, Edades);

    }

    public static void LLenar_vector(int n, int[] Edades) {
        for (i = 0; i < n; i++) {
            System.out.println("Digita la edad");
            Edades[i] = teclado.nextInt();
            System.out.println(" ");
        }
    }

    private static void edad_mayor_menor(int n, int[] Edades) {

        int Emayor, Emenor;
        Emayor = Edades[0];
        Emenor = Edades[0];
        
        for (i = 0; i < n; i++) {
            if (Edades[i] > Emayor) {
                Emayor = Edades[i];
            } else if (Edades[i] < Emenor) {
                Emenor = Edades[i];
            }
        }
        
        System.out.println(String.format("La edad mayor %d \n La edad menor %d ", Emayor, Emenor));
    }

}
