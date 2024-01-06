package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    //1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
    //El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    //después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
    //decide salir, se mostrará todos los perros guardados en el ArrayList.
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una raza de perros");
        String raza = teclado.nextLine();
        perros.add(raza);
        char respuesta = 'S';
        while(respuesta != 'N'){
            System.out.println("Ingrese una raza de perros");

            perros.add(teclado.nextLine());
            System.out.println("Desea continuar? Ingrese N para salir");
            respuesta = teclado.next().charAt(0);
            // se agrega teclado.nextLine() después de leer el carácter de respuesta para consumir el carácter
            // de nueva línea. Esto asegura que el búfer esté limpio antes de leer las siguientes entradas. Ahora
            // el bucle funcionará correctamente y pedirá la raza del tercer perro antes de preguntar si se desea
            // continuar.
            teclado.nextLine();
        }
        for (String perro: perros) {
            System.out.println(perro);
        }
    }
}
