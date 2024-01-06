package relaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaDeCartas {
//3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
//entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
//clase debe contener un método toString() que retorne el número de carta y el palo. La
//baraja estará compuesta por un conjunto de cartas, 40 exactamente.
    private Integer numero;
    private String palo;

    public ArrayList <BarajaDeCartas> mazo = new ArrayList<>();
    public ArrayList <BarajaDeCartas> manoDelJugador = new ArrayList<>();
    public ArrayList<BarajaDeCartas> descarte = new ArrayList<>();
    public BarajaDeCartas(){};
    public BarajaDeCartas(String palo, Integer numero){
        this.numero=numero;
        this.palo=palo;
    }

    @Override
    public String toString() {
        return "Carta {" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        Collections.shuffle(mazo);
    }
    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
    //más o se haya llegado al final, se indica al usuario que no hay más cartas.
    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        System.out.println("El numero de cartas disponibles es " + mazo.size());
    }
    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
    //de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
    //nada, pero debemos indicárselo al usuario.
    public void darCartas(Integer cantidad){
        for(int i=0;i<cantidad;i++){
            manoDelJugador.add(i, mazo.get(i));
            mazo.remove(i);
        }
    }
    public String mostrarMano(){
        return manoDelJugador.toString();
    }
    public void agregarMazo(ArrayList<BarajaDeCartas> mazo){
        this.mazo = mazo;
    }
    //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario
    public void cartasMonton(){

        for (BarajaDeCartas cartaDeDescarte: descarte
             ) {
            if(descarte.isEmpty())
                System.out.println("No hay cartas usadas");
            System.out.println(cartaDeDescarte);
        }
    }
    //• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
    //y luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        for (BarajaDeCartas mostradas: mazo
             ) {
            System.out.println(mostradas);
        }
    }
//Fin de los metodos
    public static void main(String[] args) {
        List<String> palos = new ArrayList<>();

        palos.add("Espadas");
        palos.add("Copas");
        palos.add("Oros");
        palos.add("Bastos");

        List<BarajaDeCartas> baraja = new ArrayList<>();

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if(numero == 8 || numero==9){
                    continue;
                }
                baraja.add(new BarajaDeCartas(palo, numero));
            }
        }

        for (BarajaDeCartas carta : baraja) {
            System.out.println(carta);
        }
        //Comienzo del juego
        BarajaDeCartas nuevaPartida = new BarajaDeCartas();
        nuevaPartida.agregarMazo((ArrayList<BarajaDeCartas>) baraja);
        nuevaPartida.barajar();
        nuevaPartida.darCartas(5);
        System.out.println(nuevaPartida.mostrarMano());

    }

}
