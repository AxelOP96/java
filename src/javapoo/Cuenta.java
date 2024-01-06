package javapoo;

import java.util.Scanner;

public class Cuenta {

    ////5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
    //        //atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
    //        //operaciones asociadas a dicha clase son:
    //        //• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    //        //• Agregar los métodos getters y setters correspondientes
    //        //• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    //        //• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    //        //ingresar y se la sumara a saldo actual.
    //        //• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    //        //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //        //pondrá el saldo actual en 0.
    //        //• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    //        //que el usuario no saque más del 20%.
    //        //• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    //        //• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    private int numeroCuenta;
    private long dniCliente;
    private double saldo;
    private double interes;
    public Cuenta(){
    }
    public Cuenta(int numeroCuenta, long dniCliente, double saldo){
        this.numeroCuenta= numeroCuenta;
        this.dniCliente= dniCliente;
        this.saldo= saldo;
        this.interes= 0.15;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void crearCuenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de cuenta");
        int numeroCuenta = teclado.nextInt();
        setNumeroCuenta(numeroCuenta);
        System.out.println("Ingrese su dni");
        long dni = teclado.nextLong();
        setDniCliente(dni);
        setSaldo(0.0);
    }
    public void ingresar(double ingreso){
        setSaldo(getSaldo() + ingreso);
    }
    public double retirar(double retiro){
        if(getSaldo() <= retiro){
            setSaldo(0);
            return getSaldo();
        }else{
            return getSaldo() - retiro;
        }

    }
    public double extraccionRapida(double extraccion){
        if(extraccion < (getSaldo()*0.20)){
            setSaldo(getSaldo()-extraccion);
            return getSaldo();
        }else{
            return getSaldo();
        }


    }
    public double consultarSaldo(){
        return getSaldo();
    }

    public String consultarDatos() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldo=" + saldo +
                ", interes=" + interes +
                '}';
    }
}
