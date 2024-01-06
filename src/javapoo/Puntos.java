package javapoo;

import java.util.Scanner;

public class Puntos {
    //2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    //atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    //usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
    //en los atributos del objeto. Después, a través de otro método calcular y devolver la
    //distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
    //como calcular la distancia entre dos puntos consulte el siguiente link:
    //http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public void crearPuntos(){
        System.out.println("Ingrese las coordenadas del punto x");
        Scanner teclado = new Scanner(System.in);
        this.x1 = teclado.nextInt();
        this.x2 = teclado.nextInt();
        System.out.println("Ingrese las coordenadas del punto y");
        this.y1 = teclado.nextInt();
        this.y2 = teclado.nextInt();
    }
    public double calcularDistancia(){
        double formula;
        formula = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return formula;
    }

    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        System.out.println("La distancia entre los dos puntos es de " + puntos.calcularDistancia());
    }
}
