package javapoo;

public class Ejercicio01 {
    public static void main(String[] args) {
        //1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
        //Autor, Número de páginas, y un constructor con todos los atributos pasados por
        //parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
        //datos al usuario y luego informar mediante otro método el número de ISBN, el título,
        //el autor del libro y el numero de páginas.
Libro libro = new Libro();
//2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
Circunferencia cuadrado = new Circunferencia(5.4);
cuadrado.crearCircunferencia(5.4);
System.out.println(cuadrado.getRadio());
System.out.println(cuadrado.area());

        //3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
        //numero2. A continuación, se deben crear los siguientes métodos:

        //4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
        //privado base y un atributo privado altura.
    Rectangulo rectangulo = new Rectangulo();
    rectangulo.crearRectangulo(4, 3);
    rectangulo.dibujar();

        //5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
        //atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.

        //6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
        //capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
        //cantidadActual (la cantidad actual de café que hay en la cafetera).

        //8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
        //String) y su longitud.

        Cadena cadena = new Cadena();

        //9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
        //con los cuales se realizarán diferentes operaciones matemáticas.

        //10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
        //A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.

        //11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
        //la clase Date.

        //12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
        //nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
        //siguientes métodos:

        //1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.

        //2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
        //atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.

        //3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
        //ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
        //y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
        //constructor.

        //4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
        //correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
        //letra (String o char) que le corresponde.

        //5. Crea una clase en Java donde declares una variable de tipo array de Strings que
        //contenga los doce meses del año, en minúsculas. A continuación, declara una variable
        //mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
        //mesSecreto = mes[9].

        //6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
        //como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
        //la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
        //métodos con los parámetros que sean necesarios:

    }
}
