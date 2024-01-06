package javapoo;

import java.util.Date;
import java.util.Scanner;

public class Fecha {
    //11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
    //la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
    //clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
    //pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
    //de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
    //fecha actual, que se puede conseguir instanciando un objeto Date con constructor
    //vacío.
    //Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    //Ejemplo fecha actual: Date fechaActual = new Date();
    //Si necesiten acá tienen más información en clase Date: Documentacion Oracle
    public static void main(String[] args) {
        Date fecha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un año");
        int year = teclado.nextInt() - 1900;
        System.out.println("Ingrese un mes en numero");
        int mes = teclado.nextInt() - 1;
        System.out.println("Ingrese un dia");
        int dia = teclado.nextInt();
        fecha = new Date(year, mes, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println("La diferencia entre las dos fechas es de " + (fechaActual.compareTo(fecha)));
    }
}
