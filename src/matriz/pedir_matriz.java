 package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class pedir_matriz {

    public static void main(String[] args) {
        
        int fila, columna, numeros;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Almacenar numeros enteros en una matriz creada por el usuario ");
        

        fila = Integer.parseInt(JOptionPane.showInputDialog("Por favor. ingrese el numero de fila"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Por favor. ingrese el numero de columna"));

        int matriz[][] = new int[fila][columna];

        System.out.println("Rellene la matriz con numero enteros");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                System.out.print(" [" + i + "] [" + j + "]= ");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("matriz");
        
         for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(" "+matriz[i][j] + "  |  ");
                
            }
            System.out.println("");
            }
            {
                
            }

        System.out.println("matriz creada con su  respectiva fila y columna");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(" [" + i + "] [" + j + "] = " + matriz[i][j] + "      |     ");
            }
            {
                System.out.println("");
            }
        }

    }

    }
