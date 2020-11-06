package poo;

public class main {
 
    public static void main(String[] args) {
 
        //Creamos los objetos
        Comercial c1 = new Comercial(300, " Yoiner ", 37, 1000);
        Repartidor r1 = new Repartidor("zona 3 ", " Franklin ", 20, 900);
 
        //Llamamos a plus
        c1.plus();
        r1.plus();
 
        //Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);
    }
 
}
