package introduccionjava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
        //salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
        //deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
        //número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros");
        Integer suma =0;
        for (int i =0; i<20;i++){
            Integer numero = teclado.nextInt();
            if(numero >=0){
                if(numero ==0){
                    System.out.println("Se capturo el numero cero");
                    break;
                }else{
                    suma+= numero;
                }
            }
        }
        System.out.println("El resultado de la suma es " + suma);
    }
}
