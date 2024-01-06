package relaciones;

import java.util.ArrayList;

public class Juego {
    //Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
    //Jugadores) y Revolver
    //Métodos:
    //• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
    //jugadores y el revolver para guardarlos en los atributos del juego.
    //• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    //aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
    //sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
    //tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
    //Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     private ArrayList<Jugador> jugadores = new ArrayList<>();
     private RevolverDeAgua revolver;
     private static Integer turno = 0;
     public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
         this.jugadores= jugadores;
         this.revolver = r;
     }
     public void ronda(){
         Jugador uno = jugadores.get(turno);
         uno.disparo(this.revolver);
         turno++;
     }
}
