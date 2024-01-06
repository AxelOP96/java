package excepciones;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class NumeroMagico {
    //5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La
    //computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
    //intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
    //debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
    //ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
    //pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
    //introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
    //pantalla. En este último caso también se debe contar el carácter fallido como un intento.
    private Integer numero;
    private static Integer intentos=0;
    public NumeroMagico(){
        this.numero =(int) Math.floor(Math.random()*500);
    }
    public boolean prueba(Integer numeroPrueba){
        boolean acerto=false;
        intentos++;
        if(numeroPrueba > this.numero){
            System.out.println("El numero magico es menor");
        }
        if(numeroPrueba < this.numero){
            System.out.println("El numero magico es mayor");
        }
        if(this.numero.equals(numeroPrueba)){
            acerto=true;
        }
        return acerto;
    }
    public void jugar(){
        Scanner teclado = new Scanner(System.in);
        Integer numeroComparable;
        do {
            System.out.println("Ingrese un numero");
            Integer numeroPrueba = null;
            try {
                numeroPrueba = teclado.nextInt();
                prueba(numeroPrueba);

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero");
            }
            numeroComparable = numeroPrueba;

        }
        while(!Objects.equals(numero, numeroComparable));
        System.out.println("El numero era " + numero + " y tomó " + intentos + " intentos");
    }

    public static void main(String[] args) {
        NumeroMagico juego = new NumeroMagico();
        juego.jugar();
    }
}
