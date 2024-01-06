package javapoo;

public class Cafetera {
    //6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
    //capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
    //cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
    //menos, los siguientes métodos:
    //• Constructor predeterminado o vacío
    //• Constructor con la capacidad máxima y la cantidad actual
    //• Métodos getters y setters.


    private double capacidadMaxima;
    private double capacidadActual;
    public Cafetera(){
    }
    public Cafetera(double capacidadActual, double capacidadMaxima){
        this.capacidadActual=capacidadActual;
        this.capacidadMaxima= capacidadMaxima;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    //máxima.
    public void llenarCafetera(){
        this.capacidadActual= capacidadMaxima;
    }
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        this.capacidadActual =0.0;
    }
    //• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.
     public void servirTaza(int tamanio){
        if(this.capacidadMaxima<= (tamanio + this.capacidadActual)){
            setCapacidadActual(getCapacidadActual() + tamanio);
            System.out.println("Falta para llenarse " + (capacidadMaxima - capacidadActual));
        }
        if(this.capacidadActual == capacidadMaxima){
            System.out.println("La taza esta llena");
        }
     }
    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public double agregarCafe(int cantidad){
        setCapacidadActual(getCapacidadActual() + cantidad);
        return getCapacidadActual();
    }
}
