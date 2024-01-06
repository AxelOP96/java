package introduccionjava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Bucles y sentencias de salto break y continue
        //
        //12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        //la nota se pedirá de nuevo hasta que la nota sea correcta.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        Integer nota = teclado.nextInt();
        while(nota > 10 || nota <0){
            System.out.println("Ingrese la nota otra vez");
            nota = teclado.nextInt();
        }
    }
}
