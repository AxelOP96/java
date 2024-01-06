package introduccionjava;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //15. Realizar un programa que pida dos números enteros positivos por teclado y
        //muestre por pantalla el siguiente menú:
        //MENU
        //1. Sumar
        //2. Restar
        //3. Multiplicar
        //4. Dividir
        //5. Salir
        //Elija opción
        //El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        //pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        //opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
        //del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        //¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
        //carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        Integer numero1 = teclado.nextInt();
        Integer numero2 = teclado.nextInt();

        Integer opcion;
        do {
            Integer resultado =0;
            char respuesta = ' ';
            System.out.println("Seleccione la operacion a realizar \n 1. Sumar\n" +
                    "        //2. Restar\n" +
                    "        //3. Multiplicar\n" +
                    "        //4. Dividir\n" +
                    "        //5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("El resultado de la suma es " + (numero1+numero2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + (numero1-numero2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es " + (numero1*numero2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es " + (numero1/numero2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = teclado.next().charAt(0);
                    if(respuesta == 'S'){
                        break;
                    }
            }
        }while(opcion!=5);
    }
}
