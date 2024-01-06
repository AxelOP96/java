package javapoo;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(){

    }
    public Libro(String ISBN, String titulo, String autor, int numeroDePaginas){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroDePaginas=numeroDePaginas;
    }

    public void llenarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        this.ISBN = teclado.nextLine();
        System.out.println("Ingrese el titulo");
        this.titulo = teclado.nextLine();
        System.out.println("Ingrese el autor");
        this.autor = teclado.nextLine();
        System.out.println("Ingrese el numero de paginas");
        this.numeroDePaginas = teclado.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}
