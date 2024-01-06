package herencia;

public class Lavadora extends Electrodomestico{
    //A continuación se debe crear una subclase llamada Lavadora, con el atributo
    //carga, además de los atributos heredados.
    private Integer carga;
    //Los constructores que se implementarán serán:
    //• Un constructor vacío.
    public Lavadora(){
        this.carga =70;
    }
    //• Un constructor con la carga y el resto de atributos heredados. Recuerda que
    //debes llamar al constructor de la clase padre.
    public Lavadora(double precio, String color, char consumoElectronico, double peso, Integer carga){
        super(precio, color, consumoElectronico, peso);
        this.carga=70;
    }
    //Los métodos que se implementara serán:
    //• Método get y set del atributo carga.

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    //• Método crearLavadora (): este método llama a crearElectrodomestico() de la
    //clase padre, lo utilizamos para llenar los atributos heredados del padre y
    //después llenamos el atributo propio de la lavadora.
    public Lavadora crearLavadora(){
        Lavadora lavadora = (Lavadora) crearElectrodomestico();
        lavadora.setCarga(70);
        return lavadora;
    }
    //• Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
    //si la carga es menor o igual, no se incrementará el precio. Este método debe
    //llamar al método padre y añadir el código necesario. Recuerda que las
    //condiciones que hemos visto en la clase Electrodoméstico también deben
    //afectar al precio.

    @Override
    public double precioFinal() {
        if(this.carga > 30){
            return super.precioFinal() + 500;
        }
        return super.precioFinal();
    }
}
