package introduccionjava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
        //frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
        //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
        //“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = teclado.nextLine();
        if(frase.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
