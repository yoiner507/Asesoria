package matriz;

public class matriz_diagonal {
    public static void main(String[] args) {
        
        // Diagonal principal
        int Matriz [][]={{2,3,8,},{4,7,9},{13,15,1}} ;
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (j == i) {
                    System.out.println(String.format("La posición %d %d tiene como valor %d ", i, j, Matriz[i][j]));
                }
            }           
        }
        System.out.println("");
        System.out.println("Alcontrario");
        
        // Diagonal inversa
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if ((i + j) == (Matriz.length - 1)) {
                    System.out.println(String.format("La posición %d %d tiene como valor %d ", i, j, Matriz[i][j]));
                }
            }
        }
    }
}