package introduccionjava;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
        //el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
        //Math.sqrt().
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        double numero = teclado.nextDouble();
        double raiz = Math.sqrt(numero);
        System.out.println("El doble del numero ingresado es " + (numero*2));
        System.out.println("El triple del numero ingresado es " + (numero*3));
        System.out.println("La raiz cuadrada del numero ingresado es " + raiz);
    }
}
