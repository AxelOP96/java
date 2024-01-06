package introduccionjava;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Condicionales en Java
        //
        //6. Implementar un programa que dado dos números enteros determine cuál es el
        //mayor y lo muestre por pantalla.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        Integer numero1 = teclado.nextInt();
        Integer numero2 = teclado.nextInt();
        if(numero1 > numero2){
            System.out.println("El mayor es " + numero1);
        }else{
            System.out.println("El mayor es " + numero2);
        }
    }
}
