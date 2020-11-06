
package asesoria;

import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[]args){
        
        Scanner read=new Scanner(System.in);
        int numero;
        
          System.out.println("ingrese la cantidad de numero - FIBONACCI");
        numero=read.nextInt();
        
        int antes = 0; // el cero va a ser el antes 
        int actual = 1;//uno va a ser el actual
        int nuevo;
        
          for (int i=0 ; i<numero ; i++){ 
          
           nuevo=antes+actual; //al hacer la suma el resultado es uno
            System.out.print(nuevo);
            antes=actual; //ahora el anterior que era el cero ya no va a ser el anterior sino que ya va a ser el actual
            //osea que el anterior queda como un uno 
            actual=nuevo; 
            
        }
}    
}
