package introduccionjava;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
        //grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centigrados");
        Integer grados = teclado.nextInt();
        double fahrenheit = (double) (32 + (9 * grados/5));
        System.out.println("La temperatura ingresada convertida a Fahrenheit es " + fahrenheit);
    }
}
