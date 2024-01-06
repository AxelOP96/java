package introduccionjava;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
        //número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        //5 *****
        //3 ***
        //11 ***********
        //2 **
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");

        String cantidad = " ";
        for (int i = 0; i < 4; i++) {
            String respuesta = " ";
            int numero = teclado.nextInt();
            for (int j = 0; j < numero; j++) {
                respuesta += " *";
            }
            cantidad += numero + respuesta +"\n";
        }
        System.out.println(cantidad);
    }
}
