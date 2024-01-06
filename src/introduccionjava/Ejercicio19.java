package introduccionjava;

public class Ejercicio19 {
    public static void main(String[] args) {
        //Vectores y Matrices en Java
        //
        //19. Crea una aplicación que a través de una función nos convierta una cantidad de
        //euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
        //libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
        //converir que será una cadena, este no devolverá ningún valor y mostrará un
        //mensaje indicando el cambio (void).
        //El cambio de divisas es:
        //* 0.86 libras es un 1 €
        //* 1.28611 $ es un 1 €
        //* 129.852 yenes es un 1 €
        double euros = 100.0;
        conversion(euros);

    }
    public static void conversion(double euros){
        System.out.println((euros*0.86) + " libras es " + euros + " euros");
        System.out.println((euros*1.28611) + " pesos es " + euros + " euros");
        System.out.println((euros*129.852) + " yenes es " + euros + " euros");
    }
}
