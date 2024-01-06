package introduccionjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
        //pida al usuario un numero a buscar en el vector. El programa mostrará donde se
        //encuentra el numero y si se encuentra repetido
        System.out.println("Ingrese un valor para el tamaño del vector");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int vector[] = new int[numero];
        for (int i = 0; i < numero; i++) {
            vector[i] =(int) Math.floor(Math.random()*100);
        }
        System.out.println("Ingrese un numero para buscar");
        int numeroBuscado = teclado.nextInt();
        int posicion =0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] ==numeroBuscado){
                posicion= i;

            }
        }
        System.out.println("el numero esta en la posicion " + posicion);
    }
}
