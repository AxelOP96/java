package javapoo;

public class Cancion {
    //1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
    //definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
    //vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
    //además definir los métodos getters y setters correspondientes.
    private String autor;
    private String titulo;
    public Cancion(){
        this.titulo = " ";
        this.autor= " ";
    }
    public Cancion(String titulo, String autor){
        this.autor= autor;
        this.titulo= titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
