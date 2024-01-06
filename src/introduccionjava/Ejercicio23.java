package introduccionjava;

public class Ejercicio23 {
    public static void main(String[] args) {
    //23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
        //la traspuesta de la matriz.
        //¿Cómo es la transpuesta de una matriz?
        int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.floor(Math.random()*100); // Números aleatorios entre 0 y 99
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int[][] traspuesta = obtenerTraspuesta(matriz);

        System.out.println("\nMatriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
