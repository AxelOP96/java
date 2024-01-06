package herencia;

public class Polideportivo extends Edificio{
    //• Clase Polideportivo con su nombre y tipo de instalación que puede ser
    //Techado o Abierto, esta clase implementará los dos métodos abstractos y los
    //atributos del padre.
    private String nombre;
    private String tipoDeInstalacion;
    public Polideportivo(){}



    public Polideportivo(double alto, double ancho, double largo, String nombre, String tipoDeInstalacion){
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion= tipoDeInstalacion;
    }
    @Override
    public double calcularSuperficie() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }
    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
}
