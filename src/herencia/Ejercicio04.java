package herencia;

public class Ejercicio04 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4.0,5.0);
        Circulo circulo = new Circulo(5, 2.5);
        System.out.println("El area del rectangulo es " +  rectangulo.area());
        //rectangulo.area();
        System.out.println("El perimetro del rectangulo es " + rectangulo.perimetro());

        System.out.println("El area del circulo es " +  circulo.area());
        //circulo.area();
        System.out.println("El perimetro del circulo es " + circulo.perimetro());
        circulo.perimetro();
    }
}
