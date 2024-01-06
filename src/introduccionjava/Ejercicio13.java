package introduccionjava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        //solicite números al usuario hasta que la suma de los números introducidos supere el
        //límite inicial.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor limite");
        Integer limite = teclado.nextInt();
        Integer suma = 0;
        while(suma < limite){
            System.out.println("Siga ingresando numeros");
            suma+= teclado.nextInt();
        }
        System.out.println("Fin del ciclo");
    }
}
