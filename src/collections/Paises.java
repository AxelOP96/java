package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Paises {
    //5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
    //repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
    //guardará el país en el conjunto y después se le preguntará al usuario si quiere
    //guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
    //guardados en el conjunto.
    //Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
    //recordar como se ordena un conjunto.
    //Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
    //se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
    //ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
    //se le informará al usuario.
    private String nombre;

    public static void main(String[] args) {
        TreeSet<String> lista = new TreeSet<>();
        Scanner teclado = new Scanner(System.in);
        char respuesta ='S';
        while(respuesta!='N'){
            System.out.println("Ingrese un pais ");
            String pais= teclado.nextLine();
            lista.add(pais);
            System.out.println("Desea continuar? pulse N para salir");
            respuesta = teclado.next().charAt(0);
        }
        for (String paisesGuardados: lista) {
            System.out.println(paisesGuardados);
        }
        System.out.println("Ingrese un elemento a buscar");
        String paisBuscado = teclado.nextLine();
        Iterator it = lista.iterator();
        while(it.hasNext()){
            if(it.next().equals(paisBuscado)){
                it.remove();
            }
            System.out.println(it.next() + " ");
        }
    }
}
