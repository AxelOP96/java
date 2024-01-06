package introduccionjava;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
        //si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        //* * * *
        //* *
        //* *
        //* * * *
        //4 length -2
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = teclado.nextInt();

        dibujarCuadrado(n);
    }

    public static void dibujarCuadrado(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}





