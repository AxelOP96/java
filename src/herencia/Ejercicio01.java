package herencia;

public class Ejercicio01 {
    public static void main(String[] args) {
        Animal perro = new Perro("Stitch", "Carnivoro", 15 ,"Doberman");
        perro.alimentarse();
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();
       Animal gato = new Gato("pelusa", "Galletas", 15, "Siames");
    gato.alimentarse();
    Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
    caballo.alimentarse();

    }
}
