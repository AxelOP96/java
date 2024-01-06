package introduccionjava;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
        //después toda en minúsculas. Nota: investigar la función toUpperCase() y
        //toLowerCase() en Java.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = teclado.nextLine();
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en mayusculas seria " + mayusculas);
        System.out.println("La frase en minusculas seria " + minusculas);
    }
}
