package javapoo;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    //6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
    //como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
    //la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
    //métodos con los parámetros que sean necesarios:
    //• Constructores, tanto el vacío como el parametrizado.
    private String vectorPalabra[];
    private int letrasEncontradas;
    private int cantidadTurnos;
    public Ahorcado(){}
    public Ahorcado(String palabra[], int letrasEncontradas, int cantidadTurnos ){
        this.vectorPalabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadTurnos= cantidadTurnos;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadTurnos() {
        return cantidadTurnos;
    }

    public void setCantidadTurnos(int cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }

    //• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    //Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    //Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    //palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
    //el valor que ingresó el usuario y encontradas en 0.
    public void crearJuego(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String palabra = teclado.nextLine();
        setVectorPalabra(llenar(palabra));
        System.out.println("Ingrese la cantidad de jugadas maxima");
        this.cantidadTurnos = teclado.nextInt();
    }
    public String[] llenar(String palabra){
        String[] letra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letra[i] =String.valueOf(palabra.charAt(i));
        }
        return letra;
    }
    //• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    //buscar como se usa el vector.length.
    public int longitud(){
        System.out.println("Longitud de la palabra: "+ this.vectorPalabra.length);
        return this.vectorPalabra.length;
    }
    //• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public boolean buscar(String letra){
        boolean encontrada = false;
        for (int i = 0; i < vectorPalabra.length; i++) {
            if(this.vectorPalabra[i].equals(letra)){
                System.out.println("La letra esta en la palabra");
                encontrada = true;
            }
        }
        return encontrada;

    }
    //• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    //cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    //devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    //busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(String letra){
        boolean estaba = false;
        String encontradas = " ";
        /*if(letra.){

        }else{
            this.cantidadTurnos--;
        }*/
        return estaba;
    }
    //• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public int intentos(){
        System.out.println("La cantidad de intentos disponibles es " + this.cantidadTurnos);
        return this.cantidadTurnos;
    }
    //• Método juego(): el método juego se encargará de llamar todos los métodos
    //previamente mencionados e informará cuando el usuario descubra toda la palabra o
    //se quede sin intentos. Este método se llamará en el main.
    public void juego(){
        Scanner teclado = new Scanner(System.in);
        crearJuego();

        do{
            System.out.println("Ingrese una letra ");
            String letra = teclado.next();
            buscar(letra);
            longitud();
            intentos();
        }while(intentos()>0);
    }
    //Nota: encontraras un ejemplo descargable de un vector como atributo en Moodle.
    //Un ejemplo de salida puede ser así:
    //Ingrese una letra:
    //a
    //Longitud de la palabra: 6
    //Mensaje: La letra pertenece a la palabra
    //Número de letras (encontradas, faltantes): (3,4)
    //Número de oportunidades restantes: 4
    //----------------------------------------------
    //Ingrese una letra:
    //z
    //Longitud de la palabra: 6
    //Mensaje: La letra no pertenece a la palabra
    //Número de letras (encontradas, faltantes): (3,4)
    //Número de oportunidades restantes: 3
    //---------------------------------------------
    //Ingrese una letra:
    //b
    //Longitud de la palabra: 6
    //Mensaje: La letra no pertenece a la palabra
    //Número de letras (encontradas, faltantes): (4,3)
    //Número de oportunidades restantes: 2
    //----------------------------------------------
    //Ingrese una letra:
    //u
    //Longitud de la palabra: 6
    //Mensaje: La letra no pertenece a la palabra
    //Número de letras (encontradas, faltantes): (4,3)
    //Número de oportunidades restantes: 1
    //----------------------------------------------
    //Ingrese una letra:
    //q
    //Longitud de la palabra: 6
    //Mensaje: La letra no pertenece a la palabra
    //Mensaje: Lo sentimos, no hay más oportunidades
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        juego.crearJuego();

    }
}
