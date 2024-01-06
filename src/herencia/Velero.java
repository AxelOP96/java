package herencia;

import java.time.LocalDate;

public class Velero extends Barco{
    private Integer numeroMastiles;
    public Velero(){}
    //Barco(String matricula, Double eslora, LocalDate fabricacion)
    public Velero(String matricula, Double eslora, LocalDate fabricacion, Integer numeroMastiles){
        super(matricula, eslora, fabricacion);
        this.numeroMastiles=numeroMastiles;
    }


}
