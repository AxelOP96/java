package javapoo;

public class Rectangulo {
    ////4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
    //        //privado base y un atributo privado altura. La clase incluirá un método para crear el
    //        //rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
    //        //método para calcular la superficie del rectángulo y un método para calcular el
    //        //perímetro del rectángulo. Por último, tendremos un método que dibujará el
    //        //rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
    //        //los métodos getters, setters y constructores correspondientes.
    //        //Superficie = base * altura / Perímetro = (base + altura) * 2.

    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public Rectangulo(){
    }
    public void crearRectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double superficie(){
        return this.base*this.altura;
    }
    public double perimetro(){
        return (2*this.base + 2*this.altura);
    }
    public void dibujar(){
        System.out.println("Llegue aca");
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                if(j==0 || j == altura-1){
                    System.out.print(" * ");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println(" ");
        }
    }
}
