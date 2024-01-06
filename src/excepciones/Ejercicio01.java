package excepciones;

import javapoo.Persona;

public class Ejercicio01 {
    //nombre, edad, char sexo, double peso, double altura
    public static void main(String[] args) {
        Persona Axel = new Persona("Axel",25, 'M', 62.1, 1.71);
        //1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de
        //invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
        //con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
        Persona Dana = null;
        System.out.println(Axel.esMayorDeEdad());
    try {
        System.out.println(Dana.esMayorDeEdad());
    }
        catch (NullPointerException e){
        System.out.println("Error asigne un valor");
        }

    }

}
