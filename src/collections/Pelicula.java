package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Pelicula {
    //4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
    //esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
    //horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
    //cuenta lo que se pide a continuación:
    //En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
    //usuario todos sus datos y guardándolos en el objeto Pelicula.
    //Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
    //quiere crear otra Pelicula o no.
    //Después de ese bucle realizaremos las siguientes acciones:
    //• Mostrar en pantalla todas las películas.
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
    //en pantalla.
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
    //en pantalla.
    //• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    private String titulo;
    private String director;
    private double duracion;
    public Pelicula(){}
    public void llenarDatos(String titulo,String director, double duracion){
        setTitulo(titulo);
        setDirector(director);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        Scanner teclado = new Scanner(System.in);
        TreeSet <Pelicula>lista = new TreeSet<Pelicula>();
        char respuesta = 'S';
        while(respuesta!='N'){
            System.out.println("Ingrese el titulo, director y duracion de la pelicula");
            String titulo = teclado.nextLine();
            String director = teclado.nextLine();
            double duracion = teclado.nextDouble();
            pelicula.llenarDatos(titulo, director, duracion);
            lista.add(pelicula);
            System.out.println("Desea continuar? Pulse N para no");
            respuesta = teclado.next().charAt(0);
        }
        for (Pelicula listas: lista) {
            System.out.println(listas);
        }
        for(Pelicula peliculas: lista){
            if(peliculas.getDuracion() > 1.0){
                System.out.println(peliculas);
        }
            Comparator<Pelicula> comparator;
        //lista.sort(OrdenadoPorDuracion);
            //Collections.sort(lista,new OrdenadoPorDuracion());
        }
    }
}
