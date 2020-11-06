package asesoria;

public class suma_positivos {

    public static void main(String[] args) {

        int suma = 0, i = 1;

        while (i <= 50) { //i es igual a 1 
            suma = suma + i; //0+1= 1 //va sumando lo que va incrementando
            System.out.println(String.format("La suma es : d% " + suma)); //suma es igual a 1
            i++; // 1+1= 2 //se incrementa 

        }
    }
}
