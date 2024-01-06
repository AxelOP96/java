package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio02 {
    //2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
    //pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
    //Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
    //la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
    //se mostrará la lista ordenada.
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una raza de perros");
        String raza = teclado.nextLine();
        perros.add(raza);
        char respuesta = 'S';
        while(respuesta != 'N'){
            System.out.println("Ingrese una raza de perros");

            perros.add(teclado.nextLine());
            System.out.println("Desea continuar? Ingrese N para salir");
            respuesta = teclado.next().charAt(0);
            // se agrega teclado.nextLine() después de leer el carácter de respuesta para consumir el carácter
            // de nueva línea. Esto asegura que el búfer esté limpio antes de leer las siguientes entradas. Ahora
            // el bucle funcionará correctamente y pedirá la raza del tercer perro antes de preguntar si se desea
            // continuar.
            teclado.nextLine();
        }
        for (String perro: perros) {
            System.out.println(perro);
        }
        //Listas:
        //ArrayList<String> palabras = new ArrayList();
        //Iterator<String> it = palabras.iterator();
        //while (it.hasNext()) {
        //if (it.next().equals(“Hola”)) { // Borramos si está la palabra Hola
        //it.remove();
        //}
        //}
        System.out.println("Ingrese una raza para buscar y eliminar");
        String razaElegida= teclado.nextLine();
        Iterator<String> it = perros.iterator();
        while(it.hasNext()){
            if(it.next().equals(razaElegida)){
                it.remove();
            }
        }

    }
}
