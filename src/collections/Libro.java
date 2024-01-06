package collections;

public class Libro {
    //La clase Libro debe guardar el título del libro,
    //    //autor, número de ejemplares y número de ejemplares prestados. También se creará en
    //    //el main un HashSet de tipo Libro que guardará todos los libros creados.
    private String titulo;
    private String autor;
    private Integer numeroDeEjemplares;
    private Integer numeroDeEjemplaresPrestados;
    public Libro(){}
    public Libro(String titulo, String autor, Integer ejemplares, Integer ejemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = ejemplares;
        this.numeroDeEjemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(Integer numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public Integer getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(Integer numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }
}
