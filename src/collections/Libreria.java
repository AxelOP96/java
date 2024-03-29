package collections;

import javax.management.MBeanAttributeInfo;
import java.util.HashSet;
import java.util.Scanner;

public class Libreria {
    //3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
    //repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
    //cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
    //autor, número de ejemplares y número de ejemplares prestados. También se creará en
    //el main un HashSet de tipo Libro que guardará todos los libros creados.
    private HashSet<Libro> libreria;
    public Libreria(){}
    public Libreria(HashSet libreria){
        this.libreria = new HashSet<>();
    }
    //En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
    //datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
    //pregunta al usuario si quiere crear otro Libro o no.
    //La clase Librería contendrá además los siguientes métodos:
    //• Constructor por defecto.
    //• Constructor con parámetros.
    //• Métodos Setters/getters
    //Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
    //busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
    //El método se incrementa de a uno, como un carrito de compras, el atributo
    //ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
    //se realice un préstamo del libro. No se podrán prestar libros de los que no queden
    //ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
    //operación y false en caso contrario.
    //• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
    //busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
    //método decrementa de a uno, como un carrito de compras, el atributo ejemplares
    //prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
    //produzca la devolución de un libro. No se podrán devolver libros donde que no
    //tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
    //false en caso contrario.
    //• Método toString para mostrar los datos de los libros.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HashSet <Libro> libreria = new HashSet<>();
        Libreria libreriaNueva = new Libreria(libreria);
        Libro nuevoLibro = new Libro(" ", " ", 0 , 0);
        char respuesta = 'S';
        while(respuesta != 'N'){
            System.out.println("Ingrese los datos del libro: Titulo");
            String titulo = teclado.nextLine();
            nuevoLibro.setTitulo(titulo);
            System.out.println("Ingrese los datos del libro: autor");
            String autor = teclado.nextLine();
            nuevoLibro.setAutor(autor);
            System.out.println("Ingrese los datos del libro: cantidad de ejemplares ");
            Integer ejemplares = teclado.nextInt();
            nuevoLibro.setNumeroDeEjemplares(ejemplares);
            System.out.println("Ingrese los datos del libro: cantidad de ejemplares prestados");
            Integer ejemplaresPrestados = teclado.nextInt();
            nuevoLibro.setNumeroDeEjemplaresPrestados(ejemplaresPrestados);
            System.out.println("Desea continuar agregando libros? Presione N para salir");
            respuesta = teclado.next().charAt(0);
            teclado.nextLine();
        }
        for (Libro listaLibros: libreria) {
            System.out.println(listaLibros);
        }
    }
}
