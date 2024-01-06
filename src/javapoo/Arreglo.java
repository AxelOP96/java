package javapoo;

import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {
        //10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
        //A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
        //programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
        //pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
        //10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
        //elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
        //elementos y el combinado de 20.
        double array50[] = new double[50];
        double array20[] = new double[20];
        //llenar de valores
        for (int i = 0; i < array50.length; i++) {
            array50[i] =(int) Math.round(Math.random()*100);
        }
        for (int i = 0; i < array50.length; i++) {
            System.out.println(array50[i]);
        }
        Arrays.sort(array50);
        for (int i = 0; i < array20.length; i++) {
            if(i < 10){
                array20[i] = array50[i];
            }else{
                array20[i] = 0.5;
            }

        }
        System.out.println("El segundo arreglo");
        for (int i = 0; i < array20.length; i++) {
            System.out.println(array20[i]);
        }
    }

}
