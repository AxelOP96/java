package relaciones;

import java.util.Objects;

public class RevolverDeAgua {
    ////2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
    //    //trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
    //    //carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
    //    //Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
    //    //(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
    //    //posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
    //    //aleatoriamente.
    //    //Métodos:
    //    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
    //    //valores deben ser aleatorios.
    //    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    //    //• siguienteChorro(): cambia a la siguiente posición del tambor
    //    //• toString(): muestra información del revolver (posición actual y donde está el agua)
    private Integer posicionActual;
    private Integer posicionAgua;

    public Integer aleatorio(){
        return Math.toIntExact(Math.round(Math.random()));
    }
    public void llenarRevolver(){
        setPosicionAgua(aleatorio());
        setPosicionActual(aleatorio());
    }
    public Boolean mojar(){
        boolean mojar = false;
        llenarRevolver();
        if(Objects.equals(getPosicionActual(), getPosicionAgua())){
            mojar = true;
        }
        return mojar;
    }
    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public void siguienteChorro(){
        Integer nuevaPosicion = posicionActual++;
        setPosicionActual(nuevaPosicion);
    }
    @Override
    public String toString() {
        return "RevolverDeAgua{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }
}
