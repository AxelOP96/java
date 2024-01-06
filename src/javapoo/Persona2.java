package javapoo;

import java.util.Date;
import java.util.Scanner;

public class Persona2 {
    private String nombre;
    private Date fechaNac;

    public Persona2(String nombre, Date fechaNac){
        this.nombre= nombre;
        this.fechaNac= fechaNac;
    }
    public Persona2(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public void crearPersona(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        this.nombre = teclado.nextLine();
        System.out.println("Ingrese su año de nacimiento");
        int year = teclado.nextInt() - 1900;
        System.out.println("Ingrese su mes de nacimiento");
        int month = teclado.nextInt() -1 ;
        System.out.println("Ingrese su dia de nacimiento");
        int day = teclado.nextInt();
        this.fechaNac = new Date(year, month, day);
    }
        public int calcularEdad(){
            return (new Date().getYear() - this.fechaNac.getYear());
        }
        public boolean menorQue(Date otraFecha){
            return this.fechaNac.before(otraFecha);
        }
    public String mostrarPersona() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    //12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
    //nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
    //siguientes métodos:
    //Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
    //• Agregar un método de creación del objeto que respete la siguiente firma:
    //crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
    //al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
    //que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    //Tener en cuenta que para conocer la edad de la persona también se debe
    //conocer la fecha actual.
    //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
    //otra edad y retorna true en caso de que el receptor tenga menor edad que la
    //persona que se recibe como parámetro, o false en caso contrario.
    //• Metodo mostrarPersona(): este método muestra la persona creada en el método
    //anterior.
    public static void main(String[] args) {
        Persona2 Axel = new Persona2();
        Axel.crearPersona();
        Persona2 Michel = new Persona2();
        Michel.crearPersona();
        Persona2 Tomy = new Persona2();
        Tomy.crearPersona();
        System.out.println("Tomy es menor que Axel? " + Tomy.menorQue(Axel.getFechaNac()));

    }
}
