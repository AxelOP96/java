package herencia;

import java.time.LocalDate;

public class YatesDeLujo extends Barco{
    private Integer numeroCamarotes;
    private Double potenciaCV;
    public YatesDeLujo(String matricula, Double eslora, LocalDate fabricacion, Double potenciaCV, Integer numeroCamarotes){
        super(matricula, eslora, fabricacion);
        this.potenciaCV=potenciaCV;
        this.numeroCamarotes= numeroCamarotes;
    }

}
