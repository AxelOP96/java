package herencia;

public class Perro extends Animal{
    public Perro(String nombre, String alimento, Integer edad, String raza){
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de gatos");
    }
}
