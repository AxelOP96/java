package herencia;

public class Circulo implements calculosFormas{
    private double radio;
    private double diametro;
    public Circulo(){
    }
    public Circulo(double radio, double diametro){
        this.radio = radio;
        this.diametro=diametro;
    }
    @Override
    public double perimetro() {
        return Math.PI * this.diametro;
    }

    @Override
    public double area() {
        return Math.PI * (this.radio * this.radio);
    }
    ////Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

}
