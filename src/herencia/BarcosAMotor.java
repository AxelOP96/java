package herencia;

import java.time.LocalDate;

public class BarcosAMotor extends Barco{
    private Double potenciaCV;
    public BarcosAMotor(String matricula, Double eslora, LocalDate fabricacion, Double potenciaCV){
        super(matricula, eslora, fabricacion);
        this.potenciaCV=potenciaCV;
    }

}
