package matriz;

import java.util.Scanner;

public class ejemplo_matriz {
    
    static int[][] matriz = null;
    static Scanner sc= new Scanner (System.in);
    
    public static void main(String[] args) {
        
        matriz = definirtamanio(matriz);
        
        System.out.println(String.format("Fila: %d ",matriz.length));
        System.out.println(String.format("columna: %d ",matriz[0].length));
        
    }//cierra metodo main
    
    public static int[][] definirtamanio(int [][]matriz){
        System.out.println("Ingrese el tamaño de la matriz filas&columnas");
        String datosingresados =sc.next();
        
        String [] datos = datosingresados.split("&"); //se guardan dos elementos porque estan separafos por un signo amperchan
        
        int filas = Integer.parseInt(datos[0]); //conversion
        int columnas = Integer.parseInt(datos[1]);
        
        matriz = new int [filas][columnas];
        
        return matriz;           
       }//cierra metodo definirtamanio
    
    public static void ingresarvalores(int [][] matriz){
        
        System.out.println("ingrese valores de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(sc.next());
            }
            
        }
        
    }//cierra metodo ingresarvalores
    
    public static void imprimirmatriz(){
        
    }
    
    
    
}//cierra la clase
