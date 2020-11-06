package matriz;

public class matriz_definida {

    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 7}, {2, 4, 7, 8, 8}};

        for (int i = 0; i < 3; i++) //Numero de filas
        {
            for (int j = 0; j < 5; j++) //Numero de columnas
            {
                System.out.print("  [" + i + "] [" + j + "] = " + matriz[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) //Numero de filas
        {
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + matriz[i][j] + "      |     ");
            }
            System.out.println("");
        }

    }
}
