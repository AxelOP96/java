package herencia;

public class Televisor extends Electrodomestico{
    //Se debe crear también una subclase llamada Televisor con los siguientes
    //atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
    //atributos heredados.
    private Integer pulgadas;
    private boolean sintonizadorTDT;

    //Los constructores que se implementarán serán:
    //• Un constructor vacío.
    public Televisor(){
        this.pulgadas=50;
    }
    //• Un constructor con la resolución, sintonizador TDT y el resto de atributos
    //heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Televisor(double precio, String color, char consumoEnergetico, double peso, Integer pulgadas, boolean sintonizadorTDT){
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT= sintonizadorTDT;
    }
    //Los métodos que se implementara serán:
    //• Método get y set de los atributos resolución y sintonizador TDT.

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    //clase padre, lo utilizamos para llenar los atributos heredados del padre y
    //después llenamos los atributos del televisor.
    public Televisor crearTelevisor(){
        Televisor televisor = (Televisor) crearElectrodomestico();
        televisor.setPulgadas(40);
        televisor.setSintonizadorTDT(false);
        return televisor;
    }
    //• Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    //incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
    //aumentará $500. Recuerda que las condiciones que hemos visto en la clase
    //Electrodomestico también deben afectar al precio.


    @Override
    public double precioFinal() {
        double precio =super.precioFinal();
        if(this.pulgadas > 40){
            precio *= 1.3;
        }

        if(sintonizadorTDT)
            precio += 500;

        return precio;
    }
}

