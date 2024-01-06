package herencia;

import java.time.LocalDate;

public class Alquiler {
    //1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
    //se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
    //devolución, la posición del amarre y el barco que lo ocupará.
    //Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
    //fabricación.
    //Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
    //especiales:
    //• Número de mástiles para veleros.
    //• Potencia en CV para barcos a motor.
    //• Potencia en CV y número de camarotes para yates de lujo.
    //Un alquiler se calcula multiplicando el número de días de ocupación (calculado
    //con la fecha de alquiler y devolución), por un valor módulo de cada barco
    //(obtenido simplemente multiplicando por 10 los metros de eslora).
    private String nombre;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barcoAlquilado;
    private Double valor;
    public Alquiler(){}
    public Alquiler(String nombre, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
                    String posicionAmarre, Barco barcoAlquilado, double valor){
        this.nombre=nombre;
        this.documentoCliente= documentoCliente;
        this.fechaAlquiler= fechaAlquiler;
        this.fechaDevolucion= fechaDevolucion;
        this.posicionAmarre=posicionAmarre;
        this.barcoAlquilado=barcoAlquilado;
        this.valor= (double)((fechaDevolucion.compareTo(fechaAlquiler)) + this.barcoAlquilado.getEslora() *10);
    }
}
