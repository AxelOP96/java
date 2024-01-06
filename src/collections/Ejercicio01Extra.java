package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01Extra {
//1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    Integer numero = teclado.nextInt();
    int contador = 0;
    int suma =0;
    int media =0;
    while(numero!=-99){
        numeros.add(numero);
        suma+= numero;
        contador++;
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
    }
    media = suma/contador;
    System.out.println("La cantidad de numeros es " + contador + " , la suma es " + suma + " y la media es " + media);
}
}
