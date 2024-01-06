package introduccionjava;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //7. Crear un programa que dado un numero determine si es par o impar.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        Integer numero = teclado.nextInt();
        if(numero % 2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
