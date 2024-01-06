package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
    //3. Crear una clase llamada Alumno que mantenga información sobre las notas de
    //distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
    //tipo Integer con sus 3 notas.
    //En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
    //información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    //pregunta al usuario si quiere crear otro Alumno o no.
    //Después de ese bluce tendremos el siguiente método en la clase Alumno:
    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
    //nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
    //Dentro del método se usará la lista notas para calcular el promedio final de alumno.
    //Siendo este promedio final, devuelto por el método y mostrado en el main.
    public static void main(String[] args) {

        ArrayList alumnos = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        char respuesta = ' ';
        while(respuesta!= 'N'){
            Alumno alumno= new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            String nombre = teclado.nextLine();
            alumno.setNombre(nombre);
            alumno.cargarNotas();
            System.out.println("La nota final del alumno " + alumno.getNombre() + " es " + alumno.calcularPromedio());
            System.out.println("Desea continuar? Ingrese N para salir");
            respuesta = teclado.next().charAt(0);
            teclado.nextLine();
        }

    }

}
