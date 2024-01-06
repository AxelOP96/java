package herencia;

import java.util.ArrayList;

public class Ejercicio03 {
    //3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
    //Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
    //televisores, con valores ya asignados.
    //Luego, recorrer este array y ejecutar el método precioFinal() en cada
    //electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
    //es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
    //eso, también deberemos mostrar, la suma del precio de todos los
    //Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
    //y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
    //electrodomésticos, 2000 para lavadora y 5000 para televisor.
    public static void main(String[] args) {
        ArrayList<Electrodomestico> guardados = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Lavadora lavadora3 = new Lavadora();
        Televisor televisor = new Televisor();
        guardados.add(lavadora1);
        guardados.add(lavadora2);
        guardados.add(lavadora3);
        guardados.add(televisor);
        Double precioSumado =0.0;
        for (Electrodomestico mostrar: guardados
             ) {
            System.out.println(mostrar.precioFinal());
            precioSumado += mostrar.precioFinal();
        }
        System.out.println("El precio total es " + precioSumado);
    }
}
