package herencia;

import java.time.LocalDate;

public class Barco {
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
    private String matricula;
    private Double eslora;
    private LocalDate fabricacion;
    public Barco(){}

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Barco(String matricula, Double eslora, LocalDate fabricacion){
        this.matricula= matricula;
        this.eslora= eslora;
        this.fabricacion= fabricacion;
    }
}
