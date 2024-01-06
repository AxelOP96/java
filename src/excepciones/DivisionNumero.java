package excepciones;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DivisionNumero {
    //3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
    //leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
    //clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
    //int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Ingrese dos numeros");
            String numero1 = teclado.nextLine();
            String numero2 = teclado.nextLine();
            Integer num1 = parseInt(numero1);
            Integer num2 = parseInt(numero2);
            Double resultado = (double) (num1/num2);
            System.out.println("El resultado es " + resultado);
            //4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
            //puede causar una excepción de tipo InputMismatchException, el método
            //Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
            //NumberFormatException y además, al dividir un número por cero surge una
            //ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
            //try/catch para las distintas excepciones
        }catch (ArithmeticException e ){
            System.out.println("No se puede dividir por cero");
        }catch (InputMismatchException a){
            System.out.println("Error de tipo de numero");
        }catch (NumberFormatException i){
            System.out.println("No es un formato valido se esperaba un numero");
        }

    }
}
