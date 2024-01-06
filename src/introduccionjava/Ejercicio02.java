package introduccionjava;

import java.util.Scanner;

public class Ejercicio02 {
    //2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
    //por pantalla.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es " + nombre);
    }
    }