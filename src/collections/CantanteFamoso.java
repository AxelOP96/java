package collections;

import java.util.ArrayList;

public class CantanteFamoso {
    //2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
    //tendrá como atributos el nombre y discoConMasVentas.
    //Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
    //objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
    //cantante y su disco con más ventas por pantalla.

    private String nombre;
    private String discoConMasVentas;
    public CantanteFamoso(String nombre, String discoConMasVentas){
        this.nombre=nombre;
        this.discoConMasVentas= discoConMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" +
                "nombre='" + nombre + '\'' +
                ", discoConMasVentas='" + discoConMasVentas + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList <CantanteFamoso> cantantes = new ArrayList<>();
        CantanteFamoso cantante1 = new CantanteFamoso("Luis Miguel", "La incondicional");
        CantanteFamoso cantante2 = new CantanteFamoso("Enrique Iglesias", "Luna");
        CantanteFamoso cantante3 = new CantanteFamoso("Shakira", "Pies descalzos");
        CantanteFamoso cantante4 = new CantanteFamoso("Thalia", "Marimar");
        CantanteFamoso cantante5 = new CantanteFamoso("Taylor Swift", "Shake it off");
        cantantes.add(cantante1);
        cantantes.add(cantante2);
        cantantes.add(cantante3);
        cantantes.add(cantante4);
        cantantes.add(cantante5);
        for (CantanteFamoso listaCantantes: cantantes
             ) {
            System.out.println(listaCantantes);
        }

    }
}
