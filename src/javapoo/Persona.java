package javapoo;

import java.util.Scanner;

public class Persona {
    //7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    //sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
    //otro atributo, puede hacerlo. Los métodos que se implementarán son:
    //• Un constructor por defecto.
    //• Un constructor con todos los atributos como parámetro.
    //• Métodos getters y setters de cada atributo.

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    public Persona(){}
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    //al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    //Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    //O. Si no es correcto se deberá mostrar un mensaje
    public void crearPersona(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = teclado.nextLine();
        setNombre(nombre);
        System.out.println("Ingrese la edad");
        int edad = teclado.nextInt();
        setEdad(edad);
        System.out.println("Ingrese el sexo, H para hombre, M para mujer u O para otro");
        char sexo = teclado.next().charAt(0);
        if(sexo == 'H'|| sexo == 'M'|| sexo == 'O'){
            setSexo(sexo);
        }
        else{
            System.out.println("Error solo puede elegir H, M u O");
        }
        System.out.println("Ingrese el peso");
        double peso = teclado.nextDouble();
        setPeso(peso);
        System.out.println("Ingrese la altura");
        double altura = teclado.nextDouble();
        setAltura(altura);
    }

    //• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    //que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    //fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    //está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    //fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    //función devuelve un 1.
    public int calcularIMC(){
        if((getPeso()/(getAltura()*getAltura()))<20){
            System.out.println("Debajo del peso ideal");
            return -1;
        }
        else if((getPeso()/(getAltura()*getAltura()))>25){
            System.out.println("Tiene sobrepeso");
            return 1;
        }
        else{
            System.out.println("Esta en su peso ideal");
            return 0;
        }
    }
    //• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(this.edad>17)
            mayor= true;

        return mayor;
    }
}
