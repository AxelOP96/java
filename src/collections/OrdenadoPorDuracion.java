package collections;

public abstract class OrdenadoPorDuracion implements Comparable<Pelicula>{
    @Override
    public int compareTo(Pelicula o) {
        return (int)o.getDuracion();
    }

    public int compareTo(Pelicula o1, Pelicula o2) {
        return Integer.compare((int)o1.getDuracion(),(int) o2.getDuracion());
    }
}
