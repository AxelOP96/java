package introduccionjava;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
    //22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        //cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner teclado =new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int numero = teclado.nextInt();
        int vector[] = new int[numero];
        int uno =0;
        int dos =0;
        int tres =0;
        int cuatro =0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random()*1000);
            //conteoDigitos(vector[i]);
            if(conteoDigitos(vector[i])==1){
                uno++;
            } else if (conteoDigitos(vector[i])==2) {
                dos++;
            } else if (conteoDigitos(vector[i])==3) {
                tres++;
            } else if (conteoDigitos(vector[i])==4) {
                cuatro++;
            }
        }
    System.out.println("La cantidad de numeros con 1 digito es " + uno + ", con 2 digitos es " + dos + ", con tres es " + tres +
            ", con cuatro es " + cuatro);
    }
    public static int conteoDigitos(int numero){
        int conteo =0;
        while (numero>=1){
            numero/=10;
            conteo++;
        }
        return conteo;
    }
}
