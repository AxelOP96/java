package introduccionjava;
import java.util.*;
public class Ejercicio01 {
    /*
    * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
    public static void main(String[] args) {System.out.println("Hello world!");
        System.out.println("Ingrese dos numeros: ");
        Scanner teclado = new Scanner(System.in);
        Integer numero1 = teclado.nextInt();
        Integer numero2 = teclado.nextInt();
        Integer resultado = numero1 + numero2;
        System.out.println("El resultado de la suma de los numeros ingresados es " + resultado);
    }
}