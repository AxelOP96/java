package relaciones;

public class Jugador {
    ///Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
    //    //jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
    //    //(indica si está mojado o no el jugador). El número de jugadores será decidido por el
    //    //usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
    //    //Métodos:

    private Integer id;
    private String nombre;
    private boolean mojado;
    private Integer numeroDeJugadores;
    public Jugador(){
        this.mojado=false;
        this.numeroDeJugadores= 6;
    }
    public Jugador(Integer id, String nombre, boolean mojado, Integer numeroDeJugadores){
        this.id=id;
        this.nombre=nombre;
        this.mojado=false;
        this.numeroDeJugadores= 6;
    }
    //    //• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    //    //mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    //    //revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    //    //devuelve true, sino false.

    public void disparo(RevolverDeAgua r){
        if(r.mojar()){
            mojado=true;
        }
        r.siguienteChorro();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                ", numeroDeJugadores=" + numeroDeJugadores +
                '}';
    }
}
