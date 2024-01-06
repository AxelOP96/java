package introduccionjava;

public class Ejercicio20 {
    public static void main(String[] args) {
        //Funciones en Java
        //
        //20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
        //los muestre por pantalla en orden descendente.
        int vector[] = new int[100];
        int contador =100;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = contador--;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
