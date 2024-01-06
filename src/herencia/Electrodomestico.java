package herencia;

import java.util.Scanner;

public class Electrodomestico {
    //Crear una superclase llamada Electrodoméstico con los siguientes atributos:
    //precio, color, consumo energético (letras entre A y F) y peso.
    //Los constructores que se deben implementar son los siguientes:
    //• Un constructor vacío.
    //• Un constructor con todos los atributos pasados por parámetro.
    //Los métodos a implementar son:
    //• Métodos getters y setters de todos los atributos.

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;
    public Electrodomestico(){

    }
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso){
        this.precio= precio;
        this.color=color;
        this.consumoEnergetico= comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    //es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    //invocar al crear el objeto y no será visible.
    public char comprobarConsumoEnergetico(char letra){
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E'){
            return letra;
        }else{
            return 'F';
        }
    }
    //Método comprobarColor(String color): comprueba que el color es correcto, y
    //si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    //electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    //está en mayúsculas o en minúsculas. Este método se invocará al crear el
    //objeto y no será visible.

    //• Método precioFinal(): según el consumo energético y su tamaño, aumentará
    //el valor del precio. Esta es la lista de precios:
    public String comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
            return color;
        }else{
            return "blanco";
        }
    }
    public double precioFinal(){
        if(this.consumoEnergetico == 'A'){
            this.precio+=1000;
        }
        else if(this.consumoEnergetico == 'B'){
            this.precio += 800;
        }
        else if(this.consumoEnergetico == 'C'){
            this.precio += 600;
        }
        else if(this.consumoEnergetico == 'D'){
            this.precio += 500;
        }
        else if(this.consumoEnergetico == 'E'){
            this.precio += 300;
        }
        else{
            this.precio+=100;
        }
        //peso
        if(this.peso > 0 && this.peso < 20){
            this.precio+=100;
        }
        else if(this.peso >= 20 && this.peso < 50){
            this.precio+=500;
        }
        else if(this.peso >= 50 && this.peso < 80){
            this.precio+=800;
        }
        else if(this.peso >= 80){
            this.precio+=1000;
        }
        return this.precio;
    }
    //• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el
    //consumo. Al precio se le da un valor base de $1000.
    public Electrodomestico crearElectrodomestico(){
        Scanner teclado = new Scanner(System.in);
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.println("Ingrese el consumo electrico");
        char resultado =teclado.nextLine().charAt(0);
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(resultado));
        System.out.println("Ingrese el color");
        String color = teclado.nextLine();
        electrodomestico.setColor(comprobarColor(color));
        System.out.println("Ingrese el peso");
        double peso = teclado.nextDouble();
        electrodomestico.setPeso(peso);
        electrodomestico.setPrecio((1000 + precioFinal()));
        return electrodomestico;
    }
}
