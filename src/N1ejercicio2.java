import java.util.ArrayList;
import java.util.Scanner;


public class N1ejercicio2 {

    public static void main(String[] args) {


        ArrayList<Coche> configCoche = new ArrayList<Coche>();

        crearCoche(configCoche);
        System.out.println(configCoche.get(0).toString());
        configCoche.get(0).acelerar();
        Coche.frenar();


    }
    static void crearCoche(ArrayList<Coche>configCoche) {

        Coche nuevoCoche;

        String modeloCoche = pedirDato("Introduce el modelo: ");
        int potencia = pedirDatoN("Introduce la potencia: ");

        nuevoCoche=new Coche(modeloCoche, potencia);

        configCoche.add(nuevoCoche);


    }
    static String pedirDato (String palabra) {

        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.print(palabra);
        String datoString = myObj.nextLine();
        String datoStringF = datoString.toUpperCase();
        return datoStringF;

    }
    static Integer pedirDatoN (String palabra) {

        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.print(palabra);
        int pedirDato = myObj.nextInt();
        return pedirDato;


    }



}