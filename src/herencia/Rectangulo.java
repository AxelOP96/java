package herencia;

public class Rectangulo implements calculosFormas{
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double perimetro() {
        return ((base+altura)*2);
    }

    @Override
    public double area() {
        return base*altura;
    }
}
