package introduccionjava;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
        //tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
        //con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
        //carácter tiene que ser X y el último tiene que ser una O.
        //Las secuencias leídas que respeten el formato se consideran correctas, la
        //secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
        //secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
        //correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
        //se utilizan las siguientes funciones de Java Substring(), Length(), equals().
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cadenas validas");
        Integer correctas =0;
        Integer incorrectas =0;
        String cadena = teclado.nextLine();
        while(!(cadena.equals("&&&&&"))){
            System.out.println("Ingrese otra cadena");
            cadena = teclado.nextLine();
            if(cadena.length()==5 && cadena.charAt(0)=='x' && cadena.charAt(4)=='o'){
                correctas++;
            }else{
                incorrectas++;
            }
        }
        System.out.println("La cantidad de correctas es " + correctas);
        System.out.println("La cantidad de incorrectas es " + incorrectas);
    }
}
