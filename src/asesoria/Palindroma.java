package asesoria;

import java.util.Scanner;

public class Palindroma {

    public static void main(String[] args) {
        String original, nueva;

        nueva = "";

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor. ingrese una palabra ");
        original = leer.nextLine();

        original = original.toLowerCase();

        for (int i = original.length() - 1; i >= 0; i--) {
            nueva = nueva + original.charAt(i);

        }
        if (original.equals(nueva)) {
            System.out.println("Palindroma");
        } else {
            System.out.println("no es palindroma");
        }

    }

}
