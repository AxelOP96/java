package javapoo;

public class Circunferencia {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio){
        this.radio=radio;
    }
    public void crearCircunferencia(double radio){
        setRadio(radio);
    }
    public double area(){
        return (Math.PI * (this.radio*this.radio));
    }
    public double perimetro(){
        return (2 * Math.PI * this.radio);
    }
}
