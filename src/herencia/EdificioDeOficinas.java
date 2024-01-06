package herencia;

public class EdificioDeOficinas extends Edificio{
    //Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
    //personas por oficina y numero de pisos. Esta clase implementará los dos
    //métodos abstractos y los atributos del padre.
    //De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
    //edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
    //oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
    //Crear el método cantPersonas(), que muestre cuantas personas entrarían en
    //un piso y cuantas en todo el edificio.
    private Integer numeroDeOficinas;
    private Integer cantidadDePersonas;
    private Integer numeroDePisos;
    public EdificioDeOficinas(double ancho, double alto, double largo, Integer numeroDeOficinas, Integer cantidadDePersonas, Integer numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroDePisos= numeroDePisos;

    }
    @Override
    public double calcularSuperficie() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }
    public void cantPersonas(){
        System.out.println("La cantidad de personas en un piso es de " + (numeroDeOficinas*cantidadDePersonas));
        System.out.println("La cantidad de personas en el edificio es de " + ((numeroDeOficinas*cantidadDePersonas)*numeroDePisos));
    }
}
