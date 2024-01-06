package herencia;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Finalmente, en el main debemos realizar lo siguiente:
        //Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
        //para mostrar el precio final de los dos electrodomésticos.
        Lavadora lava = new Lavadora();
        lava.crearLavadora();

        Televisor tele = new Televisor();
        tele.crearTelevisor();
        System.out.println("El precio final del lavarropa es " + lava.getPrecio());
        System.out.println("El precio final del televisor es " + tele.getPrecio());
    }
}
