package herencia;

public class Caballo extends Animal{
    public Caballo(String nombre, String alimento, Integer edad, String raza){
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de paja");
    }
}
