# java
#Practicas de Java con sus explicaciones y actividades

Clase 1:
  Que es la programacion? Hacer que la maquina haga lo que querramos. Ayudan a resolver problemas y facilitar otras. Se espera un resultado consistente, repetible y 
  confiable.
  
  Programa: es un grupo de ordenes que realizan un algoritmo para resolver un problema. 
  Datos: representan objetos sobre los que operamos.
  Informacion: datos procesados entre si que tiene un significado propio.
  Procedimiento: todo lo que pasa entre medio del paso del dato a la informacion.
  Los datos entran al procesador y en la salida se transforman en resultados esperados. El proccesador es quien ejecuta el programa y hace visible el resultado esperado 
  del programa. El procesador interpreta las instrucciones como codigo binario, es decir unos y ceros, es el lenguaje del procesador. Este es un lenguaje de bajo nivel,
  cuando esta mas cerca del lenguaje humano es de alto nivel(por ejemplo: java, python, cobol, etc).
  Caracteristicas:
  
  La mayoria de los lenguajes son capaces de realizar operaciones aritmeticas, manipulacion y analisis de texto, loops, condicionales, entrada/ salida, funciones y 
  procedimientos para manipular los datos, utilizar librerias de funciones y procedimientos prefabricados, y organizar programas combinando estructuras simples para 
  formar otras complejas. 
  El codigo fuente:
  
   Es el documento de texto que contiene las instrucciones del lenguaje correspondiente. Es un lenguaje de alto nivel y contiene las instrucciones de nuestro algoritmo. el
   codigo fuente contiene el programa en un formato legible, en el lenguaje de alto nivel correspondiente. el interprete convierte las lineas a unos y ceros y se ejecutan
   los unos y ceros y asi con cada linea hasta que finaliza el programa. En la compilacion agarra todas las instrucciones y genera un programa objeto(.exe). el momento de
   deteccion de error cambia segun si sea compilado o interpretado ya que este sera en la ejecucion o en el momento de la compilacion. En java escribimos nuestro codigo
   fuente(.java), el siguiente paso compila (javac), esta compilacion genera un  bytecode(.class) un codigo intermedio, este bytecode es interpretado por la java virtual
   machine y ejecuta linea por linea, para otros compiladores se cra un ejecutable o sea un exe para el caso de Java se crea un bytecode, o sea un archivo intermedio que va
   a ser el alimento de la maquina virtual en Java. Ahi pasa a ser traducido por la maquina. Por cada modificacion que haga en el codigo fuente debo compilar y creo un 
   nuevo Bytecode y luego interpretarlo.
   
     Ciclo de vida del software: diseñar, escribir el codigo fuente y generar el objetivo ejecutable, ejecutar la solucion y verificar el resultado y el debug(busqueda de
     errores).
 
 
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------


 
 Clase 2:
Eclipse es un editor de texto para poder escribir codigo fuente en la maquina. Es un IDE(interface developer environment).
 El compilador toma todo el codigo fuente y busca errores de sintaxis, ejecuta todo y lo compila. En el lenguaje interpretado el interprete convierte la linea a codigo
 maquina linea por linea, cuando ejecuto un compilado ya esta traducido, en los interpretes los tipos de datos pueden cambiar, el error aparece cuando lo ejecuto. Desde 
 el bytecode puedo convertirlo para que funcione en windows, linux e ios, esto se hace desde el compilador. Para correrlo se necesita la java virtual machine que corra 
 en el sistema operativo que desee. 
 Primero que todo se diseña el algoritmo, es la estrategia para resolver un problema, este puede tener una mayor o menor cantidad de pasos.
 Una variable es un espacio en memoria.
 Los elementos presentes en la mayoria de los lenguajes de programacion: variables, loops, condicionales, entrada/ salida y subrutinas y funciones.
  Enfoques:
  
   Estructuradas: refinamiento progresivo; dividir y conquistar; y reducir la complejidad utilizando una estructura de bloques mas simples y manejables.
   Orientadas a objetos: modelar el problema basados en objetos reales; asignarle a cada objeto un comportamiento; y resolver mediante colaboracion e interaccion entre
   objetos. 
   
   Estructuras añadidas: Primero es la secuencia, luego la iteracion y por ultimo la decision.
   
   manejo de errores: pueden detectarse como cualquier otra condicion o manejarse como una excepcion para permitir separar el manejo de errores y excepciones del flujo
   normal del programa.
   
   Procedimientos y funciones: son bloques o grupos de instrucciones que producen un resultado especifico; imprescindible para la buena organizacion del codigo; idealmente
   trabajan con parametros, no afectan variables globales.
   
   practica: revisar codigo fuente y reconocer metodos, procedimientos, bloques y funciones.
   Interfaz de usuario: todo aquello con lo que interactua el usuario. la interaccion con el usuario puede realizarse a traves de distintos mecanismos como el monitor, 
   impresora, fax, etc.
   
   Tipos de interfaz: interfaz textual que era el modo predominante antes de la difusion masiva de las pc y las macintosh. puede estar orientado a la linea de comando y
   toda la interaccion se produce en la ultima linea el resto es historia previa; el orientado a pantalla la interaccion se realiza enviando y recibiendo la pantalla
   completa como un solo bloque. la interfaz grafica(gui), es la estandar, posee mayor riqueza visual, una mayor productividad, facilidad de uso y ergonomia.
   
   Almacenamiento: siempre necesitamos contar con datos: datos de referencia permanentes, movimientos y transacciones, resultados de un proceso y resultados intermedios
   pasando de un programa a otro. Como la memoria de la maquina es volatil necesitamos mecanismos de almacenamiento como archivos planos, bases de datos(jerarquica o 
   relacional.)
   
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 Clase 3:
Java es un conjunto de componentes y caracteristicas que nos brindan las herramientas necesarias para construir software moderno en diferentes ambientes. La tecnologia Jva 
contiene: un entorno de programacion(es un entorno de programacion porque nos ofrece una sintaxis a traves de la cual se puede escribir cualquier tipo de aplicacion), un
entorno de desarrollo(nos provee de una amplia gama de herramientas para el desarrollo de aplicaciones como ser un compilador, javac, un interprete, jvm, un generador de
documentacion, javadoc, una herramienta de paquetes de archivos, jar), un entorno de aplicacion, como entorno de despliegue java nos ofrece una herramienta(jre), el cual 
se encarga de brindar todo lo necesario para que las aplicaciones escritas con java funcionen de manera correcta.
objetivos: El lenguaje de programcion java fue diseñado para ser: orientado a objetos; distribuido; simple; multihilo(dividir el proceso en subprocesos para descomponer y
mejorar la performance, se usa para correr varios procesos al mismo tiempo); seguro; e independiente de la plataforma.
Orientado a objetos: para escribir cualquier progrma en java es necesario definir los objetos que en el dben intervenir. Esta caracteristica nos da la posibilidad de
representar de manera clara la realidad y los problemas que debemos resolver.
Caracteristicas: cuenta con la java virtual machine, la java runtime environment, el garbage collector, y el java development kit. La jvm es un programa especial que
interpreta el archivo intermedio bytecode. la jre esta conformada por las bibliotecas de clase y la jvm, las bibliotecas de clases java (tambien llamadas api) son
bibliotecas de codigo previamente escrito que pueden ser combinadas con el codigo que nosotros escribamos para aplicaciones robustas. El garbage collector se encarga de 
la simpleza, ya que recorre constantemente la tabla de referemcias a objetos y cuando un objeto no es referenciado desde ningun otro objeto o funcion este es eliminado y 
en consecuencia liberada la porcion de memoria en la que estaba almacenado. el jdk contiene todo lo necesario para construir aplicaciones java. 
 Una clase :
    public class Prueba {
     // prueba es el nombre de la clase. java tiene un metodo particular llamado main que es la ejecucion del progrma principal.
     public static void main (String[] args) {
     todo lo que escriba aca va a pertenecer a este metodo. dentro de los metodos se escriben sentencias.
      System.out.println("Hola Mundo"); es para imprimir por pantalla.}
      }

      comandos: dir muestra el contenido de un directorio; cd cambia directorio; cd .. vuelvo al directorio anterior; cd \ va al raiz; letra selecciona el disco rigido;

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Clase 4:

Cuando inicializo una variable le asigno un espacio de memoria para esa variable, cuando compilo el compilador le asigna espacio para poder guardar esa memoria, dependiendo
del tipo de dato el tamaño del almacenamiento es mayor.
tipos de datos primitivos en Java: byte con un tamaño de 8 bits, short con un tamaño de 16 bits, int con un tamaño de 32 bits, long con un tamaño de 64 bits, char con un
tamaño de 16 bits, float con un tamaño de 32 bits, double con un tamaño de 64 bits y boolean que solo puede ser true o false. el byte va desde -128 a 127; el short ;
Los tipos no primitivos correponden a objetos creados a partir de una clase y por ser objetos asume como valor por defecto null. Es importante destacar la diferencia que
existe entre realizar una operacion de asignacion entre variables del tipo objeto y variables de tipo primitivo. En el caso del tipo primitivo esta operacion implica que el
dato contenido en una variable se copia en otra. En el caso en que se trate de un tipo objeto debemos recordar que lo que se esta copiando es una referencia al objeto, no
el objeto. de esta manera no tenemos dos copias del objeto sino un unico objeto referenciado por dos variables. Java es un lenguaje fuertemente tipado o sea estricto a la
hora de asignar valores a las variables. El compilador solo admite asignar a una variable un dato del tipo declarado en una variable, aunque permite realizar conversiones
para almacenar en una variable un dato de tipo diferente al declarado. Las conversiones se pueden realizar de dos maneras: de forma implicita o explicita.

Conversiones implicitas: se realizan en forma automaticas a traves del compilador, antes de almacenarlo en una variable. ejemplo:
int i;
byte b = 30;
i = b;
Conversiones explicitas: para convertir explicitamente le debo pedir que cambie al tipo que quiero: Ejemplo:
promedio = (float)suma/3; variable_destino=(tipo_destino)data_origen; 
con esta expresion se le indica al compilador que convierta dato_origen a tipo_destino para que pueda ser almacenado en la variable destino. A esta operacion se la denomina
casting o estrechamineto ya que al convertir un dato de un tipo en otro de tipo inferior se realiza una reduccion, un estrechamineto que en algunos casos puede llevar a una
perdida de datos o precision, pero que evitaria posibles errores de ejecucion.
un String es una cadena de caracteres que va entre "";
si intento sumar tipos distintos se convierte en el mas grande. Si sumara enteros y char el char aumentaria ya que este representa caracteres ASCII.
Una constante es una valor que se mantiene, no cambia con el tiempo. Final es un metodo que permite que el valor quede constante, que no se pueda cambiar.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Clase 5:
operadores relacionales: <; >; <=; >=; ==; !=;
operadores logicos: &&(solo se cumple si las dos condiciones son verdaderas); || (se cumple si al menos una de las opciones es verdadera); !(niega si es verdadero y lo
convierte a falso y viceversa).
Todos los operadores relacionales terminan dando un boolean ya que comparan y retornan si es true o false la relacion.  
 tipoDato xxxx = tipoDato (el tipo de dato tiene que ser igual o menor). En los operadores lógicos se usan booleans y se 
comparan.  Primero se resuelven los ||. Comparo cada uno como si fueran cálculos combinados CLASE. 
x++: llamado post incremento, este operador primero realiza la operacion luego le añade uno a la variable. 
++x:llamado pre incremento, este operador suma uno a la variable antes de realizar la operacion y luego realiza la operacion.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Clase 6:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Clase 7:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Clase 8:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Diplomatura en Java UTN:


Clase 1: https://www.youtube.com/watch?v=jSBB-bj1eHM


Clase 1:(Teorica) https://www.youtube.com/watch?v=ri6dkkO1EoY


Introduccion a la logica:
La logica es el estudio de los principios y metodos utilizados para distinguir el razonamiento correcto del incorrecto.
El pensamiento logico contribuye a interpretar las especificaciones de diseño o requisitos de las asignaciones a programar, comprendiendo en su contexto inmediato cual es
el problema a resolver. Determinar el alcance del problema y convalidar su presentacion a fin de identificar aspectos faltantes. Desarrollar algoritmos que dan soluciones 
a los problemas asignados o derivados de los mismos.
El software es el conjunto de programas, procedimientos, reglas, documentacion y datos.
Logica proposional, logica de predicados y operadores logicos:
una proposicion afirma que algo es o no es por lo tanto cualquier proposicion puede ser afirmada o negada. Al hacer referencia al posible valor de verdad o falsedad que
pueda tener una formula estamos admitiendo el principio de bivalencia: todo enunciado es verdadero o falso pero no ambas a la vez. El simbolo de la negacion "~" es un
ejemplo de operador unario logico. El termino unario indica que el operador actua en una unica proposicion y no en una combinacion de ellas. La declaracion p^q se llama la
conjuncion de p y q. Su valor de verdad se define por el texto de la tabla. Existen operadores como conjuncion (and), disyuncion (or) y negacion (not).
Tipos de datos: Byte, short, integer, long, float, decimal, boolean.
Operadores unitarios: ++, --, !.
Operadores relacionales: ==, !=, < 0 <=, > o >=.
Operadores logicos: && y ||.
Rutinas: bloques(conjunto de secuencias), puede tener(valor de retorno o parametros), funciones(rutina con parametros).
Premisas logicas, tablas de verdad, silogismos:
Elementos informaticos:
Actividades del proceso de construccion de software: especificacion de software-desarrollo de software-validacion de software-evolucion del software.
Desarrollo de algoritmos:
Desarrollo de programas:
Estructura de datos:
Estructura de control:
Estructura de programacion:
Algoritmos fundamentales de busqueda, recorrido y ordenamiento


Clase 1:(Practica) https://www.youtube.com/watch?v=_CLJRxBF_tc

¿Que se puede hacer con Java?
Java es un lenguaje multiplataforma, robusta, facil de aprender, orientado a objetos, gran funcionalidad y tiene contenido en open source.

https://www.jdoodle.com/online-java-compiler/

Este es un editor online de Java.
  Ejemplo 1:

    public class MyClass {
        public static void main(String args[]) {
          int x=10;
          int y=25;
          int z=x+y;
          System.out.println("Sum of x+y = " + z);
        }
    }

  Ejemplo 2:

    public class MyClass {
        public static void main(String args[]) {
          System.out.println("Hola, mundo!");
        }
    }

Las variables Java son un espacio de memoria en el que guardamos un determinado valor (o dato). Para definir una variable seguimos la siguiente estructura:

[privacidad] tipo_variable identificador;

Ejemplo 3:

    public class MyClass {
        public static void main(String args[]) {
          int cantidadDePeras = 5;
          int cantidadDeManzanas = 10;
          boolean hoyLlueve = false;
          boolean hoyEstaSoleado = true;
          System.Out.Println(cantidadDePeras + cantidadDeManzanas);
        }
    }

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Clase 2(teorica):

https://www.youtube.com/watch?v=y5VoHywO6Eo

Clase 2(Practica):

---------------------------------------------------------------------------------------------------------------------------------------

Programacion Orientada a Objetos(POO):
  Conceptos de la programación orientada a objetos
Si nunca utilizaste un lenguaje orientado a objetos antes, necesitás entender los conceptos subyacentes antes de comenzar a escribir código. Necesitás conocer qué es 
un objeto, qué es una clase, cómo se relacionan clases y objetos, y cómo se comunican utilizando mensajes. Las primeras pocas secciones de este capítulo describen 
los conceptos detrás de la programación orientada a objetos (desde ahora, POO).
¿Qué es un objeto?
Un objeto es una unidad de software que contiene variables y métodos relacionados. Los objetos software son frecuentemente usados para modelar objetos del mundo real 
que encontrás día a día en la vida cotidiana. Los objetos son la clave para entender la tecnología orientada a objetos. Podés echar un vistazo ahora mismo y ver muchos
ejemplos de objetos del mundo real: tu perro, tu mesa, tu televisor, tu bicicleta. Los objetos del mundo real comparten dos características: Todos tienen un estado y un
comportamiento. Por ejemplo, los perros tienen estado (nombre, color de pelo, raza, si están hambrientos...) y comportamiento (ladrar, buscar, mover la cola). Las 
bicicletas tienen estado (engranaje actual, cadencia de pedal actual, dos ruedas, número de engranajes) y comportamiento (frenar, acelerar, reducir velocidad, cambiar
engranajes). Los objetos software son modelados en base a objetos del mundo real y por ello también tienen estado y comportamiento. Un objeto software mantiene su estado 
en una o más variables. Una variable es un ítem de dato nombrado e identificado. Un objeto software implementa su comportamiento con métodos. Un método es una función 
(subrutina) asociada con un objeto. 
Definición: Un objeto es una construcción software de variables y métodos relacionados. Podés representar objetos del mundo real utilizando objetos software. Podrías querer
representar perros del mundo real como objetos software en un programa de animación o una bicicleta del mundo real como un objeto software en el programa que controla una
bicicleta electrónica para ejercicios. También podés usar objetos software para modelar conceptos abstractos. Por ejemplo, un evento es un objeto común usado en los
sistemas de ventanas para representar la acción de un usuario presionando un botón del mouse o una tecla del teclado. La siguiente ilustración es una representación visual
común de un objeto software

Todo lo que el objeto software conoce (estado) y puede hacer (comportamiento) es expresado por
las variables y los métodos dentro de ese objeto. Un objeto software que modela tu bicicleta del
mundo real tendría variables que indicaran el estado actual de la bicicleta: Su velocidad es de 30
kph, su cadencia de pedal es 90 rpm, y el engranaje actual es el quinto. Esas variables son
formalmente conocidas como variables de instancia, porque contienen el estado de un objeto
bicicleta en particular; en la terminología orientada a objetos, un objeto en particular es
denominado instancia. La siguiente figura ilustra una bicicleta modelada como un objeto software:

En suma a sus variables, la bicicleta software debería tener además métodos para frenar, cambiar
la cadencia de pedal y cambiar los engranajes (No debería tener un método para cambiar la
velocidad porque la velocidad de la bicicleta es solo un efecto secundario de qué engranaje está
activo y qué tan rápido está pedaleando el ciclista). Estos métodos son conocidos formalmente
como métodos de instancia, porque evalúan o cambian el estado de una instancia particular de
objeto bicicleta.
Los diagramas de objetos muestran que las variables de un objeto están en el centro o núcleo del
objeto. Los métodos rodean y ocultan el núcleo de otros objetos en el programa. El empaquetado
de las variables de un objeto con esa custodia protectora de sus métodos es llamado
encapsulamiento. Esta imagen conceptual de un objeto (un núcleo de variables empaquetadas
dentro de una membrana protectora de métodos) en una representación ideal de un objeto y es el
ideal que los diseñadores de sistemas orientados a objetos buscan. Sin embargo, la historia no
termina aquí.

Algunas veces, por razones prácticas, un objeto debe exponer algunas de sus variables o esconder
algunos de sus métodos. En el lenguaje de programación Java, un objeto puede especificar uno de
cuatro niveles de acceso para cada una de sus variables o métodos. El nivel de acceso determina
qué otros objetos y clases pueden acceder a esa variable o método. Remitite a la sección
Controlando el Acceso a los Miembros de una Clase, para más detalles.
Encapsular variables relacionadas y métodos en una única y ordenada construcción de software es
una simple pero poderosa idea que provee dos beneficios primarios para los desarrolladores de
software:
• Modularidad: El código fuente para un objeto puede ser escrito y mantenido
independientemente del código fuente para los otros objetos. Además, un objeto puede
fácilmente circular por el sistema. Podés darle tu objeto bicicleta a otra persona, y aún funcionará.
• Ocultamiento de la información: Un objeto tiene una interfase pública que los otros
objetos pueden utilizar para comunicarse con él. El objeto puede mantener información privada y
métodos que pueden ser cambiados en cualquier momento sin afectar a otros objetos que
dependan de ello. No necesitás entender el mecanismo de los engranajes de las bicicletas para
utilizar una.
¿Qué es un mensaje?
Los objetos software interactúan y se comunican con otros utilizando mensajes
Un simple objeto sólo generalmente no es muy útil. En cambio, un objeto usualmente aparece
como un componente de un programa o aplicación más grande que contiene muchos otros
objetos. A través de la interacción de estos objetos, los programadores consiguen funcionalidades
de orden superior y un comportamiento más complejo. Tu bicicleta colgada de un gancho en el
garaje es sólo una pieza de metal y coma; por sí misma es incapaz de cualquier actividad; la
bicicleta es útil sólo cuando otro objeto (vos) interactúa con ella (pedaleando).
Los objetos software interactúan y se comunican con otros enviándose mensajes. Cuando el
objeto A quiere que el objeto B haga uno de los métodos de B, el objeto A le envía un mensaje al
objeto B (mirá la imagen que sigue):

A veces, el objeto receptor necesita más información para saber exactamente qué hacer; por
ejemplo, cuando querés cambiar el engranaje en tu bicicleta, tenés que decirle a qué engranaje
querés pasar. Esa información es pasada por medio del mensaje como parámetros.
La siguiente figura muestra las tres partes de un mensaje:
- El objeto al cual el mensaje está siendo dirigido (tuBicileta)
- El nombre del método a realizar (cambiarEngranaje)
- Cualquier parámetro necesario por el método (engranajeMenor)

Esas tres partes son suficiente información para el objeto receptor para realizar el método
deseado. Ninguna información adicional o contexto es requerido.
Los mensajes otorgan dos importantes beneficios:
• El comportamiento de un objeto es expresado por medio de métodos, entonces (en lugar
del acceso directo a variables) el pasaje de mensajes soporta todas las posibles interacciones entre
objetos.
• Los objetos no necesitan estar en el mismo proceso o incluso en la misma máquina para
enviar mensaje hacia un lado y otro, y para recibir mensajes de otros objetos.
¿Qué es una clase?
Una clase es un anteproyecto o un prototipo que define las variables y métodos comunes a todos
los objetos de cierto tipo.
En el mundo real muchas veces tenés muchos objetos del mismo tipo. Por ejemplo, tu bicicleta es
sólo una de las muchas bicicletas en el mundo. Usando terminología orientada a objetos, decimos
que tu objeto bicicleta es una instancia de la clase de objetos conocida como bicicletas. Las
bicicletas tienen un estado (engranaje actual, cadencia actual, dos ruedas) y comportamiento
(cambiar engranaje, frenar) en común. Sin embargo, cada estado de la bicicleta es independiente
de y puede ser diferente del de otras bicicletas

Cuando son construidas, los manufactureros toman ventaja del hecho de que las bicicletas
comparten características, construyendo muchas bicicletas desde el mismo molde. Podrías ser
muy ineficiente producir un nuevo molde por cada bicicleta manufacturada.
En el software orientado a objetos, es también posible tener muchos objetos del mismo tipo que
compartan características: rectángulos, registros de empleados, videoclips, y así sucesivamente.
Como los manufactureros de las bicicletas, podés tomar ventaja del hecho de que los objetos del
mismo tipo son similares y podés crear un molde para esos objetos. Un molde software para
objetos es denominado clase

Definición: Una clase es un molde que define las variables y métodos en común para todos los
objetos de un tipo en particular.
La clase para nuestro ejemplo de la bicicleta podría declarar las variables de instancia necesarias
para contener el engranaje actual, la cadencia actual y así sucesivamente, por cada objeto
bicicleta. La clase podría además declarar y proveer implementaciones para los métodos de
instancia que permitan al ciclista cambiar de engranaje, frenar y cambiar la cadencia de pedaleo

Ejercicios:
1-
  public class Solution {
      public static void main(String[] args) {
  
          Person person = new Person();
          System.out.println("Age: " + person.age);
          person.adjustAge(person.age);
          System.out.println("Adjusted age: " + person.age);
      }
      public static class Person {
          public int age = 20;
  
          public void adjustAge(int age) {
              this.age = age + 20;
              System.out.println("The age in adjustAge() is " + this.age);
          }
      }
    }


2-
    public class Solution {
        public static void main(String[] args) {
            Apple apple = new Apple();
            apple.addPrice(50);
            Apple apple2 = new Apple();
            apple2.addPrice(100);
            System.out.println("The cost of apples is " + Apple.applePrice);
        }
          public static class Apple {
              public static int applePrice = 0;
              public static void addPrice(int applePrice) {
                  Apple.applePrice += applePrice;
              }
          }
      }
  
      public class Cat {
          private String name = "nameless cat";
      
          public void setName(String name) {
              this.name = name;
          }
          public static void main(String[] args) {
              Cat cat = new Cat();
              cat.setName("Simba");
              System.out.println(cat.name);
          }
      }
  
      public class Cat {
          private static int catCount = 0;
          public static void addNewCat() {
              Cat.catCount++;
          }
          public static void main(String[] args) {
              Cat cat = new Cat();
              addNewCat();
              Cat cat2 = new Cat();
              addNewCat();
              System.out.println(Cat.catCount);
          }
      }

  
      public class Cat {
          private static int catCount = 0;
      
          public static void setCatCount(int catCount) {
              Cat.catCount = catCount;
          }
      
          public static void main(String[] args) {
      
          }
      }
  
      public class Cat {
          private String fullName;
          public void setName(String firstName, String lastName) {
              String fullName = firstName + " " + lastName;
              this.fullName = fullName;
          }
          public static void main(String[] args) {
          }
      }

  
      public class Solution {
          public static void main(String[] args) {
              compare(3);
              compare(6);
              compare(5);
          }
          public static void compare(int a) {
              if(a < 5){
                  System.out.println("The number is less than 5");
              }else{
                  if(a > 5){
                      System.out.println("The number is greater than 5");
                  }else{
                      System.out.println("The number is equal to 5");
                  }
              }
          }
        }
  
      public class Solution {
          public static void main(String[] args) {
              displayClosestToTen(8, 11);
              displayClosestToTen(7, 14);
          }
          public static void displayClosestToTen(int a, int b) {
              if((abs(10 - a))< (abs(10 - b)) ){
                  System.out.println(a);
              }else if((abs(10 - a))> (abs(10 - b)) ){
                  System.out.println(b);
              }
              else{
                  System.out.println(b);
              }
          }
          public static int abs(int a) {
              if (a < 0) {
                  return -a;
              } else {
                  return a;
              }
          }
      }
  
      public class Solution {
          public static void main(String[] args) {
              checkInterval(60);
              checkInterval(112);
              checkInterval(10);
          }
      
          public static void checkInterval(int a) {
              if(a >= 50 && a <= 100){
                  System.out.println("The number " + a + " is in the interval.");
              }else{
                  System.out.println("The number " + a + " is not in the interval.");
              }
          }
      }

  
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              int year = Integer.parseInt(reader.readLine());
              if(year % 400==0){
                  System.out.println("Number of days in the year: 366");
              }
              else if(year % 100==0 && year % 400!=0){
                  System.out.println("Number of days in the year: 365");
              }
              else if(year % 4==0){
                  System.out.println("Number of days in the year: 366");
              }
              else{
                  System.out.println("Number of days in the year: 365");
              }
          }
      }
  
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
              double number =Double.parseDouble(reader.readLine());
              int phase = (int) (number % 5);
              if (phase >= 0 && phase < 3) {
                  System.out.println("green");
              } else if (phase == 3) {
                  System.out.println("yellow");
              } else {
                  System.out.println("red");
              }
          }
      }

  
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              int one = Integer.parseInt(reader.readLine());
              int two = Integer.parseInt(reader.readLine());
              int min = 0;
              if(one < two){
                  min = one;
              }
              else if(two < one){
                  min = two;
              }else{
                  min = one;
              }
              System.out.println(min);
          }
      }

  
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              int a = Integer.parseInt(reader.readLine());
              int b = Integer.parseInt(reader.readLine());
              int c = Integer.parseInt(reader.readLine());
              int first;
              int second;
              int third;
              if(a >= b && a >= c){
                  first = a;
                  if(b >= c){
                      second = b;
                      third = c;
                  }else{
                      second = c;
                      third = b;
                  }
              }
              else if(b >= a && b >= c){
                  first = b;
                  if(a >= c){
                      second = a;
                      third = c;
                  }else{
                      second = c;
                      third = a;
                  }
              }else{
                  first = c;
                  if(a >= b){
                      second = a;
                      third = b;
                  }else{
                      second = b;
                      third = a;
                  }
              }
              System.out.println(first + " " + second + " " + third);
              
          }
      }

      public class Solution {
          public static void main(String[] args) throws Exception {
              int num1 = 1;
          while (num1 <= 10) {
              int mult = 1;
              while (mult <= 10) {
                  System.out.print(num1 * mult + " ");
                  mult++;
              }
              System.out.println(); // Agrega una nueva línea después de cada fila
              num1++;
          }
          }
      }


        public class Solution {
            public static void main(String[] args) throws Exception {
                for(int i =0; i< 10;i++){
                    System.out.print("8");
                }
                System.out.println("");
                for(int i =0; i< 10;i++){
                    System.out.println("8");
                }
            }
        }

    
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              int num1 = Integer.parseInt(reader.readLine());
              int num2 = Integer.parseInt(reader.readLine());
              int num3 = Integer.parseInt(reader.readLine());
              int middle = 0;
              if(num1 >= num2 && num1 >= num3 && num2 <= num3){
                  middle = num3;
              }
              else if(num1 >= num2 && num1 >= num3 && num3 <= num2){
                  middle = num2;
              }
              else if(num2 >= num1 && num2 >= num3 && num1 <= num3){
                  middle = num3;
              }
              else if(num2 >= num1 && num2 >= num3 && num3 <= num1){
                  middle = num1;
              }
              else if(num3 >= num1 && num3 >= num2 && num1 <= num2){
                  middle = num2;
              }
              else if(num3 >= num1 && num3 >= num2 && num2 <= num1){
                  middle = num1;
              }
              System.out.println(middle);
          }
      }
  
      public class Solution {
          public static void main(String[] args) throws Exception {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              String name = reader.readLine();
              int year = Integer.parseInt(reader.readLine());
              int month = Integer.parseInt(reader.readLine());
              int day =Integer.parseInt(reader.readLine());
              System.out.println("My name is " + name + ".");
              System.out.println("I was born on " + month + "/" + day + "/" + year);
          }
      }

    Mas ejercicios:
  
    public class Solution {
      public static void main(String[] args) throws Exception {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          double sum=0.0;
          int count=0;
          int number=0;
          while(number!=-1){
              number = Integer.parseInt(reader.readLine());
              if(number==-1){
                  break;
              }else{
                  sum+=number;
                  count++;
              }
          }
          System.out.println(sum/count);
      }
    }


      public class Rectangle {
        int left;
        int top;
        int width;
        int height;
        public void initialize(int left, int top, int width, int height){
            this.left=left;
            this.top=top;
            this.width=width;
            this.height=height;
        }
        public void initialize(Rectangle rectangle){
            this.left=rectangle.left;
            this.top=rectangle.top;
            this.width=rectangle.width;
            this.height=rectangle.height;
        }
        public void initialize(int left, int top, int width){
            this.left=left;
            this.top=top;
            this.width=width;
            this.height=0;
        }
        public void initialize(int left, int top){
            this.left=left;
            this.top=top;
            this.width=0;
            this.height=0;
        }
        public static void main(String[] args) {
        }
    }

    public class Solution {
      public static class Man{
          String name;
          int age;
          String address;
          public Man(String name, int age, String address){
              this.name=name;
              this.age=age;
              this.address=address;
          }
          public String toString(){
              return name + " " + age + " " + address;
          }
      }
      public static class Woman{
          String name;
          int age;
          String address;
          public Woman(String name, int age, String address){
              this.name=name;
              this.age=age;
              this.address=address;
          }
          public String toString(){
              return name + " " + age + " " + address;
          }
      }
  
      public static void main(String[] args) {
          Man man1 = new Man("Juan", 18, "NY");
          Man man2 = new Man("John", 25, "Tx");
          System.out.println(man1);
          System.out.println(man2);
          Woman woman1 = new Woman("Jean", 30, "Arg");
          System.out.println(woman1);
          Woman woman2 = new Woman("Jane", 65, "Ushuaia");
          System.out.println(woman2);
      }
    }

    public class Solution {
      public static class Date{
          int month;
          int day;
          int year;
          public Date(int month,int day, int year){
              this.day=day;
              this.month=month;
              this.year=year;
          }
          public String toString(){
              return day + " " + month + " " + year;
          }
      }
      public static void main(String[] args) {
          Date date = new Date(15, 01, 2024);
          System.out.println(date.toString());
      }
  }

  
    public class Circle {
      public Color color;
  
      public static void main(String[] args) {
          Circle circle = new Circle();
          circle.color.setDescription("Red");
          System.out.println(circle.color.getDescription());
      }
      public Circle() {
          color = new Color();
      }
      public class Color {
          String description;
  
          public String getDescription() {
              return description;
          }
  
          public void setDescription(String description) {
              this.description = description;
          }
      }
  }

  
  Llamar a un constructor desde otro: con this();
    public class Circle {
  
      public double x;
      public double y;
      public double radius;
  
      public Circle(double x, double y, double radius) {
          this.x = x;
          this.y = y;
          this.radius = radius;
      }
  
      public Circle(double x, double y) {
          this(x, y, 10);
      }
  
      public Circle() {
          this(5, 5, 1);
      }
  
      public static void main(String[] args) {
          Circle circle = new Circle();
          System.out.println(circle.x + " " + circle.y + " " + circle.radius);
          Circle anotherCircle = new Circle(10, 5);
          System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
      }
  }
  
    public class Solution {
      public static void main(String[] args) throws Exception {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int a = Integer.parseInt(reader.readLine());
          int b = Integer.parseInt(reader.readLine());
          int c = Integer.parseInt(reader.readLine());
          int d = Integer.parseInt(reader.readLine());
          int e = Integer.parseInt(reader.readLine());
          int minimum = min(a, b, c, d, e);
          System.out.println("Minimum = " + minimum);
      }
      public static int min(int a, int b, int c, int d, int e) {
          int min = a;
          if(min > b){
              min = b;
          }
          if(min > c){
              min = c;
          }
          if(min > d){
              min = d;
          }
          if(min > e){
              min = e;
          }
          return min;
      }
  }

  
        public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int maximum;
            int count = Integer.parseInt(reader.readLine());
            if(count > 0){
                maximum = Integer.parseInt(reader.readLine());
                for(int i =1; count > i; i++){
                    int currentNumber = Integer.parseInt(reader.readLine());
                    if(currentNumber> maximum){
                        maximum=currentNumber;
                    }
                }
                System.out.println(maximum);
            }
        }
    }

    public class Solution {
      public static int max = 100;
      public static void main(String[] args) throws IOException {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String max = "The max is ";
          int a = Integer.parseInt(reader.readLine());
          int b = Integer.parseInt(reader.readLine());
          Solution.max = a > b ? a : b;
          System.out.println(max + Solution.max);
      }
  }

      public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int array[] = new int[20];
            int first[]=new int[10];
            int second[]= new int[10];
            for(int i=0; i<array.length;i++){
                int number = Integer.parseInt(reader.readLine());
                array[i]=number;
                if(i<10){
                    first[i] = number;
                }else if(i<20){
                    second[i-10]= number;
                }
            }
            for(int i =0; i< second.length;i++){
                System.out.println(second[i]);
            }
        }
    }
      An array also consists of "boxes". You can put something (an element) into each box. To access an element, you need to know its box number (index).

      This is how an array is created:
      
      public class Main {
         public static void main(String[] args) {
             String [] birthdays = new String[10];
         }
      }

      features of the array:
        It stores elements of a well-defined data type. If we create a String array, we can't store anything else in it. The data type is specified when the array is
        created. This is where it differs from a safety deposit box (in which a customer can store what he or she wants).
        
        Its size must be specified when the array is created. You can't indicate it later or change its size after the array is created.
        The fact that we are creating an array is indicated by the square brackets on both sides of the expression. They can be specified before or after the name of 
        the reference variable. Either way will work:
        
        String [] birthdays = new String[10];
        String birthdays [] = new String[10];

        you can create an array of ints like this:

          public class Main {
             public static void main(String[] args) {
                 int numbers [] = {7, 12, 8, 4, 33, 79, 1, 16, 2};
             }
          }
          
          This technique is called "shortcut initialization". It's quite convenient, because we simultaneously create an array and fill it with values. We don't have 
          to explicitly specify the array size: with shortcut initialization, the length field is set automatically.

          Let's say we have an array of three Cat objects:

          public class Cat {
             private String name;
             public Cat(String name) {
                 this.name = name;
             }
          
             public static void main(String[] args) {
                 Cat[] cats = new Cat[3];
                 cats[0] = new Cat("Thomas");
                 cats[1] = new Cat("Behemoth");
                 cats[2] = new Cat("Lionel Messi");
             }
          }
          
          You need to understand a few things here:
          In the case of primitives, an array stores a set of specific values (e.g. ints). In the case of objects, an array stores a set of references.
          The cats array consists of three elements, each of which is a reference to a Cat object. Each of the references points to the memory address where the
          corresponding object is stored.
          
          Array elements are arranged in a single block in memory. This is done to allow them to be accessed quickly and efficiently.
          Thus, cats references the block of memory where all the objects (array elements) are stored. Cats[0] references a specific address within this block

          It's important to understand that an array doesn't just store objects: it is an object itself.
          This leads us to question whether we can create not only array of strings or numbers, but also arrays of arrays.
          And the answer is yes, we can! An array can store any objects, including other arrays.
          Such an array is called two-dimensional. If we were to represent it visually, it will be very similar to an ordinary table.
          In code, initialization of a two-dimensional array looks like this:

            public static void main(String[] args) {
               Cat[][] cats = new Cat[3][5];
            }
            Because a two-dimensional array consists of several arrays, in order to iterate through it and display all its values (or populate all its elements), we need 
            a nested loop:

            for (int i = 0; i < cats.length; i++) {
               for (int j = 0; j < cats[i].length; j++) {
                   System.out.println(cats[i][j]);
               }
            }
            In the outer loop (variable i), we iterate over all the arrays in our two-dimensional array. In the inner loop (variable j), we pass through all the elements
            of each array.
            
            As a result, cats[0][0] (first array, first element) will be displayed first, followed by cats[0][1] (first array, second element). After we've gone through
            the first array, we'll display cats[1][0], cats[1][1], cats[1][2], etc.
            
            By the way, two-dimensional arrays also support shorthand initialization:
            
            int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};

            the task of sorting an array, which we tried to handle, is solved in a single line:

              public class Main {
                 public static void main(String[] args) {
                     int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
                     Arrays.sort(numbers);
                     System.out.println(Arrays.toString(numbers));
                 }
              }

              The Arrays.sort() method sorts the array. And its algorithm is much more efficient than the code we wrote.
              Console output:
              [-234, -2, 16, 26, 35, 43, 80, 92, 99, 167]
              Note: To convert the array to a string, we used another method of the Arrays class: Arrays.toString().
              Arrays in Java don't override the toString() method on their own. So, if you simply write 
              System.out.println(numbers.toString())
              the Object class's toString() will be called. For an array, the output will be something like this:
              [I@4554617c

    
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  la clase ArrayList:
  Cada objeto ArrayList almacena una matriz regular de elementos. Cuando lee elementos de una ArrayList , los lee desde su matriz interna. Cuando los escribe en ArrayList,
  los escribe en su matriz interna
  Creacion:
  String[] list = new String[10];
  ArrayList<String> list = new ArrayList<String>();
  Obtener el número de elementos
  int n = list.length;
  int n = list.size();
  Obtener un elemento de una matriz/colección
  String s = list[3];
  String s = list.get(3);
  Escribir un elemento en una matriz
  list[3] = s;
  list.set(3, s);

  ArrayList admite varias operaciones adicionales que los programadores tienen que realizar todo el tiempo. Una matriz común no admite estas operaciones. Por ejemplo, 
  insertar o eliminar elementos del medio de una matriz sin dejar agujeros
  En segundo lugar, la capacidad de cambiar el tamaño de la matriz. Cuando necesita agregar un elemento más pero la matriz interna no tiene ranuras libres, esto es lo 
  que sucede dentro de ArrayList :

    a) Se crea otra matriz que es un 50 % más grande que la matriz interna actual, más un elemento.
    
    b) Todos los elementos de la matriz anterior se copian en la nueva.
    
    c) La nueva matriz se guarda como la matriz interna del objeto ArrayList. La matriz anterior se declara basura (simplemente dejamos de almacenar una referencia a ella)
  Agregar un elemento al final de la matriz:
  esta accion no es soportada	
  list.add(s);
  Agregue un elemento en el medio de la matriz:
  esta accion no es soportada	
  list.add(15, s);
  Agregar un elemento al comienzo de la matriz:
  esta accion no es soportada	
  list.add(0, s);
  Eliminar un elemento de la matriz:
  Podríamos eliminar un elemento con list[3] = null. Pero esto dejaría un 'agujero' en la matriz.	
  list.remove(3);

  En Java, una colección/contenedor significa una clase cuyo objetivo principal es almacenar una colección de otros elementos. Ya conoces una de esas clases: ArrayList.
  En Java, las colecciones se dividen en tres grupos principales: Conjunto, Lista, Mapa.  Conjunto: Puede agregar un elemento a un Conjunto, buscarlo o eliminarlo. Lo 
  importante a tener en cuenta es que los elementos del conjunto no tienen un orden específico asignado. una Lista: Puede agregar un elemento al principio o en medio 
  de una lista, o eliminar un elemento, simplemente usando su índice. En un mapa (también llamado a menudo diccionario). Cada elemento tiene su propio nombre único que 
  es utilizado para abordarlo. Este nombre único para cada elemento a menudo se denomina "clave". Por lo tanto, un mapa es un conjunto de pares clave-valor. La clave no
  tiene que ser una cadena: puede ser de cualquier tipo. El mapa cuyas claves son Integer es de hecho una Lista (con algunas diferencias)
  

  ¿Qué son los generics?
  Los generics son tipos que tienen un parámetro. En Java, las clases contenedoras le permiten indicar el tipo de sus objetos internos. Cuando declaramos una variable
  genérica, indicamos dos tipos en lugar de uno: el tipo de variable y el tipo de datos que almacena.

  ArrayList es un buen ejemplo. Cuando creamos un nuevo objeto ArrayList, es conveniente indicar el tipo de valores que se almacenarán dentro de esta lista
  ArrayList<String> list = new ArrayList<String>();	//Cree una variable ArrayList llamada list. Asígnele un objeto ArrayList. Esta lista solo puede almacenar objetos String
  ArrayList list = new ArrayList();	Cree una variable ArrayList llamada list. Asígnele un objeto ArrayList. Esta lista puede almacenar cualquier valor.
  
  The first order of business is to check whether the internal array has enough space in the internal array and whether one more element will fit. If there is space, 
  then the new element is added to the end of the list. When we say "to the end", we don't mean the last position in the array (that would be weird). We mean the 
  position following the last current element. Its index will be cars.size(). Our list is currently empty (cars.size() == 0). Accordingly, the new element will be added 
  at position 0.

    ArrayList<Car> cars = new ArrayList<>();
    Car ferrari = new Car("Ferrari 360 Spider");
    cars.add(ferrari);

     Agregar un elemento en un lugar ocupado:
     cars.add(ferrari);
     cars.add(bugatti);
     cars.add(lambo);
  
     cars.add(1, ford);// add ford to cell 1, which is already occupied

     ---------------------------------------------------------------------------------------------------------------------------------------------------------
     

  Clases Wrapper:
  tipo primitivo	Clase	    Lista
  int	            Integer	  ArrayList< Integer >
  double	        Double	  ArrayList <Double> _
  boolean	        Boolean	  ArrayList< Boolean >
  char	          Character	ArrayList< Character >
  byte	          Byte	    ArrayList <Byte>

  Ejemplo 2:

  Igual que arriba, pero los números pares se agregan al final de la lista, los impares al principio.
  
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();
        
            while (true)
            {
                String s = reader.readLine();
                if (s.isEmpty()) break;
        
                int x = Integer.parseInt(s);
                if (x % 2 == 0)  // Check that the remainder is zero when we divide by two
                    list.add(x);         // Add to the end
                else
                    list.add(0, x);      // Add to the beginning
            }
        }
    
  Divida una matriz en dos partes: números pares e impares
  
        public static void main(String[] args) throws IOException
        {
            // Static initialization of the array
            int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
            // Create a list where all elements are Integers
            ArrayList&ltInteger> list = new ArrayList&ltInteger> ();
            // Use the array to fill the list
            for (int i = 0; i < data.length; i++) list.add(data[i]);
            ArrayList&ltInteger> even = new ArrayList&ltInteger>();  // Even numbers
            ArrayList&ltInteger> odd = new ArrayList&ltInteger>();    // Odd numbers
            for (int i = 0; i < list.size(); i++)
            {
                Integer x = list.get(i);
                if (x % 2 == 0)    // If x is even
                    even.add(x);   // Add x to the collection of even numbers
                else
                    odd.add(x);    // Add x to the collection of odd numbers
            }
        }

        public class Cat {
          public static ArrayList<Cat> cats;
    
          static {
              cats = new ArrayList<>();
          }
          public Cat() {
          }

          public static void main(String[] args) {
              Cat cat1 = new Cat();
              Cat cat2 = new Cat();
              Cat cat3 = new Cat();
              Cat cat4 = new Cat();
              Cat cat5 = new Cat();
              Cat cat6 = new Cat();
              Cat cat7 = new Cat();
              Cat cat8 = new Cat();
              Cat cat9 = new Cat();
              Cat cat10 = new Cat();
              Cat.cats.add(cat1);
              Cat.cats.add(cat2);
              Cat.cats.add(cat3);
              Cat.cats.add(cat4);
              Cat.cats.add(cat5);
              Cat.cats.add(cat6);
              Cat.cats.add(cat7);
              Cat.cats.add(cat8);
              Cat.cats.add(cat9);
              Cat.cats.add(cat10);
              printCats();
          }
      
          public static void printCats() {
              for(int i=0; i<cats.size(); i++){
                  System.out.println(Cat.cats.get(i));
              }
              
          }
      }

      


    Interfaz	Clase/implementación	 Descripción
    List	     ArrayList	           Lista
               LinkedList	           Lista
               Vector	               Vector
               Pila	                 Pila
    Set  	     HashSet	             Set
               Treeset	             Set
               SortedSet	           SortedSet
    Map	       hashmap 	             Map/diccionario
               TreeMap	             Mapa/diccionario
               SortedMap	           Diccionario ordenado
               HashTable	           HashTable

    Collections:
          In Java, a group of data structures is commonly referred to as a collection. Data can be stored in many different ways. So far, we have only studied the 
          ArrayList class, where data is stored in an array. We'll get acquainted with other collections later. For now, it's enough to just understand that the 
          Collections class is designed to work not only with ArrayList, but also with other types of collections (hence, its name).
      
          So, what tasks does the Collections class actually help with when working with ArrayList?
          
          The first and most obvious is sorting. In the lesson about arrays, we considered an example with numbers. Now we'll consider an example with strings. The 
          Collections class implements the sort() method for sorting the contents of collections:
      
          public class Main {
             public static void main(java.lang.String[] args) {
                 String mercury = new String("Mercury");
                 String venus = new String("Venus");
                 String earth = new String("Earth");
                 String mars = new String("Mars");
                 String jupiter = new String("Jupiter");
                 String saturn = new String("Saturn");
                 String uranus = new String("Uranus");
                 String neptune = new String("Neptune");
                 ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                         jupiter, saturn, uranus, neptune));
                 Collections.sort(solarSystem);
                 System.out.println(solarSystem);
             }
          }
      
      Output:
      
      [Earth, Jupiter, Mars, Mercury, Neptune, Saturn, Uranus, Venus]
      
      The strings are sorted alphabetically!

      The Collections class also helps you find the minimum and maximum element in an ArrayList. This is done using the min() and max() methods:

      public static void main(java.lang.String[] args) {
      
         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
         System.out.println(Collections.max(numbers));
         System.out.println(Collections.min(numbers));
      
      }
      
      Output:
      
      7
      1
      Another very useful method is reverse(). If we had to "flip" the list so the elements went in the opposite order, how would we do it? It probably wouldn't be 
      so easy to write such an algorithm by yourself :)

      Fortunately, the reverse() method already knows how. Suppose we don't like the fact that the sort() method sorted our planets alphabetically, and we want to 
      reverse their order: from Z to A:

      public class Main {
         public static void main(java.lang.String[] args) {
             String mercury = new String("Mercury");
             String venus = new String("Venus");
             String earth = new String("Earth");
             String mars = new String("Mars");
             String jupiter = new String("Jupiter");
             String saturn = new String("Saturn");
             String uranus = new String("Uranus");
             String neptune = new String("Neptune");
             ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,jupiter, saturn, uranus, neptune));
             Collections.sort(solarSystem);
             Collections.reverse(solarSystem);
             System.out.println(solarSystem);
         }
      }

      Output:
      
      [Venus, Uranus, Saturn, Neptune, Mercury, Mars, Jupiter, Earth]
      suppose we're trying to implement a bingo game. We add 100 numbers to the drum. They should appear on the screen one at a time.The first player to cross out all 
      the numbers on his ticket wins. This is easy to implement using the shuffle() method:

      public class Main {
         public static void main(java.lang.String[] args) {
             ArrayList<Integer> bingoDrum = new ArrayList<>(100);
             for (int i = 1; i <= 100; i++) {
                 bingoDrum.add(i);// add the numbers 1 to 100 to the drum
             }
             Collections.shuffle(bingoDrum);// Mix it up
             System.out.println ("Your attention, please! Here are the first 10 numbers from the drum!");
             for (int i = 0; i < 10; i++) {
                 System.out.println(bingoDrum.get(i));
             }
         }
      }

      Output:
      
      Your attention, please! Here are the first 10 numbers from the drum!
      32
      61
      4
      81
      25
      8
      66
      35
      42
      71

      imagine a different situation. Previously, we created a solarSystem list that contained the planets.And it seems to suit us in every way but one: you can delete
      items from it and add new ones! This is clearly not the behavior we expect: The solar system should be unchangeable in our program. The Collections class has a very
      interesting method: unmodifiableList(). It creates an immutable list from the list passed as an argument. You can't add or delete items from this list.
      When dealing with the list of planets in the solar system, this is exactly what we want!

      public class Main {
      
         public static void main(java.lang.String[] args) {
      
             String mercury = new String("Mercury");
             String venus = new String("Venus");
             String earth = new String("Earth");
             String mars = new String("Mars");
             String jupiter = new String("Jupiter");
             String saturn = new String("Saturn");
             String uranus = new String("Uranus");
             String neptune = new String("Neptune");
      
             List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                     jupiter, saturn, uranus, neptune)));
             solarSystem.add("Pluto");// Try to add a new element
         }
      }

      Output:
      
      Exception in thread "main" java.lang.UnsupportedOperationException
      	at java.util.Collections$UnmodifiableCollection.add(Collections.java:1075)
      	at Main.main(Main.java:21)
       Finally, we'll get acquainted with a very interesting method: disjoint(). It checks whether two collections intersect, i.e., whether they have at least one
       identical element. If they do not, it returns true.  It they do, then it returns false

        public class Main {
        
           public static void main(java.lang.String[] args) {
        
               String mercury = new String("Mercury");
               String venus = new String("Venus");
               String earth = new String("Earth");
               String mars = new String("Mars");
               String jupiter = new String("Jupiter");
               String saturn = new String("Saturn");
               String uranus = new String("Uranus");
               String neptune = new String("Neptune");
        
               ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
               ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));
        
               System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));
        
           }
        }

        As you can see, our two lists have completely different elements, so the program outputs true. This is an interesting and very useful class. Like Arrays, it does 
        a lot of routine, tedious work for us, letting us focus on other things.

        import java.util.*;
        import java.util.HashMap;
        import java.util.Map;
        
        public class Solution {
            public static void main(String[] args) throws Exception {
                HashMap<String, String> mapList = new HashMap();
                mapList.put("watermelon", "melon");
                mapList.put("banana", "fruit");
                mapList.put("cherry", "fruit");
                mapList.put("pear", "fruit");
                mapList.put("cantaloupe", "melon");
                mapList.put("blackberry", "fruit");
                mapList.put("ginseng", "root");
                mapList.put("strawberry", "fruit");
                mapList.put("iris", "flower");
                mapList.put("potato", "tuber");
                Iterator<Map.Entry<String, String>> iterator = mapList.entrySet().iterator();
                         while (iterator.hasNext())
                          {
                              Map.Entry<String, String> pair = iterator.next();
                              String key = pair.getKey();            // Key
                              String value = pair.getValue();        // Value
                              System.out.println(key + " - " + value);
                          }
            }
        }
        



    Iteradores:
    
        public static void main(String[] args){
          Set&ltString> set = new HashSet&ltString>();
          set.add("Rain");
          set.add("In");
          set.add("Spain");
           // Get an iterator for the set
           Iterator&ltString> iterator = set.iterator();
          while (iterator.hasNext())        // Check if there is another element
          {
             // Get the current element and move to the next one
             String text = iterator.next();
              System.out.println(text);
          }
        }

    Ejemplo:
          public static void main(String[] args){
            Set<String> set = new HashSet<String>();
            set.add("Stop");
            set.add("Look");
            set.add("Listen");
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                String text = iterator.next();
                System.out.println(text);
            }
          }

          Mostrar elementos de un mapa
            public static void main(String[] args)
            {
                // All elements are stored in pairs
                Map<String, String> map = new HashMap<String, String>();
                map.put("first", "Rain");
                map.put("second", "In");
                map.put("third", "Spain");
            
                Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            
                 while (iterator.hasNext())
                  {
                      // Get a key-value pair
                      Map.Entry<String, String> pair = iterator.next();
                      String key = pair.getKey();            // Key
                      String value = pair.getValue();        // Value
                      System.out.println(key + ":" + value);
                  }
              }

            1. El método next() devuelve el siguiente elemento de la colección.

            2. El método hasNext() comprueba si todavía hay elementos que next() no ha devuelto

            For each:
            public static void main(String[] args)
            {
                Set&ltString> set = new HashSet&ltString>();
                set.add("Rain");
                set.add("In");
                set.add("Spain");
            
               for (String text : set)
                {
                    System.out.println(text);
                }
            }
            Mostrar elementos de un conjunto
            public static void main(String[] args)
            {
                Set&ltString> set = new HashSet&ltString>();
                set.add("Rain");
                set.add("In");
                set.add("Spain");
            
                for (String text : set)
                {
                    System.out.println(text);
                }
            }
            
            Mostrar elementos de una Lista
            public static void main(String[] args)
            {
                List&ltString> list = new ArrayList&ltString>();
                list.add("Rain");
                list.add("In");
                list.add("Spain");
            
                 for (String text : list)
                {
                    System.out.println(text);
                }
            }
            
            Mostrar elementos de un mapa
            public static void main(String[] args)
            {
                Map<String, String> map = new HashMap<String, String>();
                map.put("first", "Rain");
                map.put("second", "In");
                map.put("third", "Spain");
            
                for (Map.Entry<String, String> pair : map.entrySet())
                {
                    String key = pair.getKey();                      // Key
                    String value = pair.getValue();                  // Value
                    System.out.println(key + ":" + value);
                }
            }

            Internamente, ArrayList se implementa como una matriz ordinaria . Es por eso que insertar un elemento en el medio requiere que primero cambiemos todos los
            elementos sucesivos por uno y luego coloquemos el nuevo elemento en la ranura libre. Obtener y configurar elementos (get, set ) es rápido , ya que estas
            operaciones simplemente abordan el elemento de matriz relevante
            LinkedList tiene una estructura interna diferente. Se implementa como una lista con elementos interconectados : un conjunto de elementos distintos, cada uno 
            de los cuales almacena referencias a los elementos siguientes y anteriores en la lista. Para insertar un elemento en el medio de dicha lista, solo necesita
            cambiar las referencias de sus futuros vecinos.Sin embargo, para obtener el elemento No. 130, debe ejecutar cada objeto del 0 al 130. En otras palabras, 
            las operaciones de obtención y configuración serán lentas

            Descripción	            Operación	  ArrayList	LinkedList
            obtener un elemento	    get	        Rápido	Lento
            Establecer un elemento	put	        Rápido	Lento
            Agregar un elemento	    add	        Rápido	Rápido
            (al final)
            Insertar un elemento 	  add       	Lento	  Rápido
            (posición arbitraria)   (yo, valor)
            Quitar un elemento	    remove	    Lento	  Rápido

            Para mantenerlo simple, le daré la siguiente regla: si va a insertar (o eliminar) elementos con frecuencia en medio de la colección, es mejor usar LinkedList.
            En todos los demás casos, ArrayList funciona mejor.
            The elements in a Java LinkedList are actually links in a single chain. In addition to data, each element stores references to the previous and next elements.
            These references let you move from one element to another. 

            This is how you create one:
            
            public class Main {
            
               public static void main(java.lang.String[] args) {
            
                   String str1 = new String("Hello World!");
                   String str2 = new String("My name is Earl");
                   String str3 = new String("I love Java");
                   String str4 = new String("I live in Canada");
            
                   LinkedList<String> earlBio = new LinkedList<>();
                   earlBio.add(str1);
                   earlBio.add(str2);
                   earlBio.add(str3);
                   earlBio.add(str4);
            
                   System.out.println(earlBio);
            
               }
            }
            Unlike ArrayList, LinkedList doesn't have an array or anything array-like inside. 
            Overview of methods
            LinkedList has a lot of methods in common with ArrayList.
            
            For example, both classes have methods such as add(), remove(), indexOf(), clear(), contains() (indicates whether an item is in the list), set() (replaces an
            existing element), and size().
            
            Although many of them work differently internally (as we found with add() and remove()), the end result is the same.
            
            However, LinkedList does have separate methods for working with the beginning and end of the list, which ArrayList does not have:
            addFirst(), addLast(): These methods for adding an element to the beginning/end of the list

            public class Car {
            
               String model;
            
               public Car(String model) {
                   this.model = model;
               }
            
               public static void main(String[] args) {
                   LinkedList<Car> cars = new LinkedList<>();
                   Car ferrari = new Car("Ferrari 360 Spider");
                   Car bugatti = new Car("Bugatti Veyron");
                   Car lambo = new Car("Lamborghini Diablo");
                   Car ford = new Car("Ford Mondeo");
                   Car fiat = new Car("Fiat Ducato");
            
                   cars.add(ferrari);
                   cars.add(bugatti);
                   cars.add(lambo);
                   System.out.println(cars);
            
                   cars.addFirst(ford);
                   cars.addLast(fiat);
                   System.out.println(cars);
               }
            
               @Override
               public String toString() {
                   return "Car{" +
                           "model='" + model + '\'' +
                           '}';
               }
            }

            Output:
            
            [Car{model='Ferrari 360 Spider'}, Car{model='Bugatti Veyron'}, Car{model='Lamborghini Diablo'}]
            [Car{model='Ford Mondeo'}, Car{model='Ferrari 360 Spider'}, Car{model='Bugatti Veyron'}, Car{model='Lamborghini Diablo'}, Car{model='Fiat Ducato'}]

            peekFirst(), peekLast(): The methods return the first/last element in the list. They return null if the list is empty
            System.out.println(cars.peekFirst());
            System.out.println(cars.peekLast());

             pollFirst(), pollLast(): These methods return the first/last element in the list and remove it from the list. They return null if the list is empty
              public static void main(String[] args) {
                 LinkedList<Car> cars = new LinkedList<>();
                 Car ferrari = new Car("Ferrari 360 Spider");
                 Car bugatti = new Car("Bugatti Veyron");
                 Car lambo = new Car("Lamborghini Diablo");
              
                 cars.add(ferrari);
                 cars.add(bugatti);
                 cars.add(lambo);
                 System.out.println(cars.pollFirst());
                 System.out.println(cars.pollLast());
              
                 System.out.println ("What's on the list?");
                 System.out.println(cars);
              }

              Output:
              
              Car{model='Ferrari 360 Spider'}
              Car{model='Lamborghini Diablo'}
              What's left on the list?
              [Car{model='Bugatti Veyron'}]

              toArray(): This method returns an array containing the list items
              public static void main(String[] args) {
                 LinkedList<Car> cars = new LinkedList<>();
                 Car ferrari = new Car("Ferrari 360 Spider");
                 Car bugatti = new Car("Bugatti Veyron");
                 Car lambo = new Car("Lamborghini Diablo");
              
                 cars.add(ferrari);
                 cars.add(bugatti);
                 cars.add(lambo);
                 Car[] carsArray = cars.toArray(new Car[3]);
                 System.out.println(Arrays.toString(carsArray));
              }
            how LinkedList works and how its organization differs from ArrayList. What are the benefits of using LinkedList?
            Above all, we benefit when working in the middle of the list. Insertion and removal operations in the middle of a LinkedList are much simpler than in an 
            ArrayList. We simply update the links of neighboring elements, and the unwanted element "drops out" of the chain of links.
            
            But in an ArrayList, we must check whether there is enough space (when inserting) if not, then we create a new array and copy the data there (when inserting)
            we remove/insert the element, and move all the other elements to the right/left (depending on the type of operation). And the complexity of this process
            depends heavily on the size of the list. It's one thing to copy/move 10 elements, and quite another to do the same with a million elements.
            In other words, if insertion/removal operations in the middle of the list are most common in your program, LinkedList should be faster than ArrayList.

            
    
            Set:
            Set es un conjunto, un grupo de objetos no numerados. La característica principal de un Set es que solo contiene objetos únicos , es decir, cada elemento
            del conjunto es diferente . Aquí hay operaciones que puede realizar en un conjunto:

            Operación	                            Método
            Añadir elemento(s)	                  add(), addAll()
            Quitar elemento(s)	                  remove(), removeAll()
            Comprobar la presencia de elemento(s)	contains(), containsAll()

            Map:
            Map es un conjunto de pares. Es como un conjunto, excepto que es un conjunto de pares clave-valor en lugar de elementos únicos. La única limitación es que 
            cada « clave» debe ser única . Un map no puede contener dos pares con el mismas llaves 

            Operación	                                        Método
            Obtener un conjunto de todos los pares	          conjuntoentrada()
            Consigue un juego de todas las llaves	            juego de llaves()
            Obtener un conjunto de todos los valores	        valores()
            Añadir un par	                                    put (clave, valor)
            Obtener el valor de la clave especificada	        obtener la clave)
            Comprobar si la clave especificada está presente	contiene clave (clave)
            Comprobar si el valor especificado está presente	contieneValor(valor)
            Comprobar si el Mapa está vacío	                  isEmpty()
            Borrar el mapa	                                  clear()
            Eliminar el valor de la clave especificada	      eliminar (clave)

            Ejercicios:
            Buscar el String mas corto y si se repite en longitud mostrarlo.
            public class Solution {
              public static void main(String[] args) throws Exception {
                  ArrayList<String> list = new ArrayList();
                  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                  for(int i=0; i<5;i++){
                      String word = reader.readLine();
                      list.add(word);
                  }
                  String min = "aaaaaaaaaaaa";
                  int longitud =min.length();
                  for(int i=0; i<list.size();i++){
                      if(list.get(i).length()< longitud){
                          min = list.get(i);
                          longitud = list.get(i).length();
                      }
                  }
                  for(String show: list){
                      if(longitud == show.length() && min != show){
                          System.out.println(show);
                      }
                  }
                  System.out.println(min);
              }   
          }

          Agrega el ultimo elemento al principio y elimina el que se copio, un total de 13 veces
          public class Solution {
            public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list = new ArrayList();
                for(int i =0;i <5;i++){
                    String word= reader.readLine();
                    list.add(word);
                }
                for(int i=0; i< 13;i++){
                    String last =list.get(4);
                    list.add(0, last);
                    list.remove(5);
                }
                for(String show: list){
                    System.out.println(show);
                }
            }
        }

        El programa busca el string mas corto y el más largo de la lista y muestra el que aparece primero
        public class Solution {
          public static void main(String[] args) throws Exception {
              ArrayList<String> list = new ArrayList();
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              for(int i=0; i<10;i++){
                  String word= reader.readLine();
                  list.add(word);
              }
              String shorter = "";
              String longer ="";
              int iShorter=0;
              int iLonger=0;
              for(int i =0; i<10;i++){
                  if(i==0){
                      shorter = list.get(i);
                      longer = list.get(i);
                  }else{
                      if(shorter.length() > list.get(i).length() ){
                          shorter = list.get(i);
                          iShorter = i;
                      }
                      if(longer.length() < list.get(i).length() ){
                          longer = list.get(i);
                          iLonger = i;
                      }
                  }
                  
              }
              if(iShorter < iLonger){
                  System.out.println(list.get(iShorter));
              }else{
                  System.out.println(list.get(iLonger));
              }
              
          }
      }

      Genera 3 listas y guarda los numeros divisibles por 2, por 3 y los restantes en una lista:
      public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> div = new ArrayList();
            ArrayList<Integer> div3 = new ArrayList();
            ArrayList<Integer> div2 = new ArrayList();
            ArrayList<Integer> divBoth = new ArrayList();
            
            for(int i=0; i<20; i++){
                Integer number = Integer.parseInt(reader.readLine());
                div.add(number);
                if(number%2==0 || number%3==0){
                    if(number%3 ==0){
                        div3.add(number);
                    }
                    if(number%2==0){
                        div2.add(number);
                    }
                }else{
                    divBoth.add(number);
                }
            }
            
            printList(div3);
            printList(div2);
            printList(divBoth);
        }
        public static void printList(List<Integer> list) {
            for(Integer show : list){
                System.out.println(show);
            }
        }
    }

    Agregar palabras en el medio de un ArrayList:
    public class Solution {
      public static void main(String[] args) throws Exception {
          BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
          ArrayList<String> list = new ArrayList();
          list.add("Sam");
          list.add("I");
          list.add("Am");
          for(int i=1; i<=list.size();i+=2){
              list.add(i, "Ham");
          }
          for(String show : list){
              System.out.println(show);
          }
      }
  }

      Duplicar los elementos de una lista:
            public class Solution {
                public static void main(String[] args) throws Exception {
                    // Read strings from the console and declare an ArrayList here
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    ArrayList<String> list = new ArrayList();
                    for(int i=0; i<10;i++){
                        String word = reader.readLine();
                        list.add(word);
                    }
                    ArrayList<String> result = doubleValues(list);
                    for(String show : result){
                        System.out.println(show);
                    }
                }
                public static ArrayList<String> doubleValues(ArrayList<String> list) {
                    //ArrayList<String> doubleValues = new ArrayList();
                    for(int i=0; i<list.size(); i+=2){
                        list.add(i+1,list.get(i));
                    }
                    return list;
                }
            }

            after removing an element, move the elements to the front of the array to put the "hole" at the end:

              public static void main(String[] args) {
                 Cat[] cats = new Cat[4];
                 cats[0] = new Cat("Thomas");
                 cats[1] = new Cat("Behemoth");
                 cats[2] = new Cat("Lionel Messi");
                 cats[2] = new Cat("Fluffy");
                 cats[1] = null;
                 for (int i = 2; i < cats.length-1; i++) {
                     cats [i-1] = cats [i];// Move the elements to the front of the array, so the empty position is at the end
                 }
                 System.out.println(Arrays.toString(cats));
              }

              HashMap:
              Map. It is also known as an "associative array", but this term is used infrequently. More commonly, it is called a "dictionary" or "map"
              It is very easy to create:

              public static void main(String[] args) {
                 HashMap<Integer, String> passportsAndNames = new HashMap<>();
              }
              Adding a new pair to the HashMap looks like this:

              public class Main {
              
                 public static void main(String[] args) {
                     HashMap<Integer, String> passportsAndNames = new HashMap<>();
              
                     passportsAndNames.put (212133, "Bridget Logan");
                     passportsAndNames.put (162348, "Ivan the Great");
                     passportsAndNames.put(8082771, "Donald John Trump");
                     System.out.println(passportsAndNames);
                 }
              }
              
              We use the method put() for this. In addition, HashMap overrides the toString() method, so it can be displayed on the console. The output will look like this:
              Console output:
              {212133=Bridget Logan, 8082771=Donald John Trump, 162348=Ivan the Great}
              To get a value or remove a pair from the dictionary, we must pass to the get() and remove() the unique key that corresponds to the value. Unlike arrays and 
              lists, a HashMap in Java has no numeric indices: values are accessed using the key.
              
              The ArrayList and LinkedList classes let us check whether the list contains any particular element.

              Java HashMap lets us do this. What's more, we can do this for both members of the pair: This is what the containsKey() (checks for a key) and containsValue()
              (checks for a value) methods are for.
              
              public static void main(String[] args) {
                 HashMap<Integer, String> passportsAndNames = new HashMap<>();
              
                 passportsAndNames.put (212133, "Bridget Logan");
                 passportsAndNames.put (162348, "Ivan the Great");
                 passportsAndNames.put(8082771, "Donald John Trump");
              
                 System.out.println(passportsAndNames.containsKey(11111));
                 System.out.println(passportsAndNames.containsValue("Donald John Trump"));
              }
              
              Output:
              false
              true
              Another convenient feature of HashMap in Java is the fact that you can get separate lists of all the keys and all the values.

              This is accomplished with the keySet() and values() methods:
              
              public class Main {
                 public static void main(String[] args) {
                     HashMap<Integer, String> passportsAndNames = new HashMap<>();
                     passportsAndNames.put (212133, "Bridget Logan");
                     passportsAndNames.put (162348, "Ivan the Great");
                     passportsAndNames.put(8082771, "Donald John Trump");
                     Set keys = passportsAndNames.keySet();
                     System.out.println("Keys: " + keys);
                     ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
                     System.out.println("Values: " + values);
                 }
              }

              The keys are extracted into a Set, which we haven't covered yet. It is special in that it cannot contain repeating elements. Now the main thing is to
              remember that the list of all keys can be retrieved from a HashMap into a separate collection.
              
              In the example, we saved the values into an ordinary ArrayList.
              
              Console output:
              
              Keys: [212133, 8082771, 162348]
              Values: [Bridget Logan, Donald John Trump, Ivan the Great]
              The size() and clear() methods do exactly the same thing as in the previous structures we've discussed: the first returns the number of elements currently 
              in the dictionary, the second removes all the elements.

              public static void main(String[] args) {
                 HashMap<Integer, String> passportsAndNames = new HashMap<>();
              
                 passportsAndNames.put (212133, "Bridget Logan");
                 passportsAndNames.put (162348, "Ivan the Great");
                 passportsAndNames.put(8082771, "Donald John Trump");
              
                 System.out.println(passportsAndNames.size());
                 passportsAndNames.clear();
                 System.out.println(passportsAndNames);
              }
              
              Output:
              
              3
              {}

              To check if there is at least one element in our HashMap, we can use the isEmpty() method.
              Another interesting point is that two Maps can be combined into one. This accomplished using the putAll() method. We call it on the first HashMap, pass the
              second as an argument, and the elements from the second are added to the first:

              public static void main(String[] args) {
                 HashMap<Integer, String> passportsAndNames = new HashMap<>();
                 HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
                 passportsAndNames.put (212133, "Bridget Logan");
                 passportsAndNames.put (162348, "Ivan the Great");
                 passportsAndNames.put(8082771, "Donald John Trump");
                 passportsAndNames2.put(917352, "Clifford Patrick");
                 passportsAndNames2.put(925648, "Mitchell Salgado");
                 passportsAndNames.putAll(passportsAndNames2);
                 System.out.println(passportsAndNames);
              }

              Output:
              
              {917352=Clifford Patrick, 212133=Bridget Logan, 8082771=Donald John Trump, 925648=Mitchell Salgado, 162348=Ivan the Great}
              All the pairs in passportsAndNames2 have been copied to passportsAndNames.
              iterating over a HashMap in a loop.

              for (Map.Entry<Integer, String> entry: passportsAndNames.entrySet()) {
                 System.out.println(entry);
              }
              
              The Map.Entry class denotes the key-value pair inside the dictionary. The entrySet() method returns a list of all pairs in our HashMap. Because our map
              consists of these Map.Entry pairs, we're iterating over pairs, not separate keys or values.
              
              Output:
              
              212133=Bridget Logan
              8082771=Donald John Trump
              162348=Ivan the Great


              

    

---------------------------------------------------------------------------------------------------------------------------------------

#Herencia
   Es un mecanismo para definir una nueva clase a partir
  de una clase existente
   Permite agrupar clases relacionadas, de forma que
  puedan ser manejadas colectivamente
   Promueve el reúso
   Permite ocultar y sobreescribir métodos heredados
   Generalización, Especialización y Sobreescritura

Verificación de herencia
   Una clase puede heredar únicamente de una superclase
   Es importante utilizarla solamente si es válido e inevitable
   Frase “es un/a”
   Un Gerente “es un” Empleado
  class Manager extends Employee
  {
  int numberOfWorkers;
  //etcetera.
  }

Reglas de visibilidad
   Si la superclase define un miembro como privado, la subclase no podrá accederlo bajo ningún concepto. Las clases ajenas a la jerarquía, como es de esperar,
  tampoco.
   Si la superclase define un miembro como protegido, la subclase podrá accederlo como si fuera propio pero privado. Las clases ajenas a la jerarquía no podrán accederlo.
   Si la superclase define un miembro como público, la subclase lo poseerá con la misma visibilidad. Las clases ajenas a la jerarquía podrán acceder al mismo.

  1. Una variable declarada en un método existe (es visible) desde el inicio de su declaración hasta el final del método.

  2. Una variable declarada en un bloque de código existe hasta el final del bloque de código.

  3. Los parámetros de un método existen en todas partes dentro del método.

  4. Las variables en un objeto existen durante toda la vida útil del objeto que las contiene. Su visibilidad también está definida por modificadores de acceso especiales:
  
  5.  público y privado .

  6. Las variables estáticas (de clase) existen todo el tiempo que se ejecuta el programa. Su visibilidad también está definida por modificadores de acceso.
     
  Si una variable se declara estática, es decir, se marca con la palabra clave static , existe mientras exista su clase. La JVM generalmente carga una clase en la memoria
  en su primer uso. También es cuando se inicializan las variables estáticas
  Cuando llamas a un método usando <object> dot <method name> , en realidad estás llamando a un método de clase y pasando ese mismo objeto como primer argumento. Dentro 
  del método, el objeto se llama 'this' . Todas las operaciones en el se realizan en este objeto y sus datos
  
  \" – Escape sequence for double quote character.
  \\ – Escape sequence for a backslash (\) character.
  para obtener esto:
  This is a Windows path: "C:\Program Files\Java\jdk1.8.0_172\bin"
  This is a Java string: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"
  debemos escribir esto:
  System.out.println("This is a Windows path: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"");
  System.out.println("This is a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"");
  
  Otra forma de leer datos:
  InputStream inputStream = System.in;
  Reader inputStreamReader = new InputStreamReader(inputStream);
  BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
  String name = bufferedReader.readLine(); //Read a string from the keyboard
  String sAge = bufferedReader.readLine(); //Read a string from the keyboard
  int nAge = Integer.parseInt(sAge); //Convert the string to a number.
  
  Una versión más compacta del ejemplo anterior:
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
  String name = reader.readLine();
  String sAge = reader.readLine();
  int nAge = Integer.parseInt(sAge);
  
  Aún más compacto
  Scanner scanner = new Scanner(System.in);
  String name = scanner.nextLine();
  int age = scanner.nextInt();

  Cuando llamas a un método usando <object> dot <method name> , en realidad estás llamando a un método de clase y pasando ese mismo objeto como primer argumento. Dentro 
  del método, el objeto se llama 'this' . Todas las operaciones en el se realizan en este objeto y sus datos

    Objeto Date:
    Obtener la fecha actual:
    public static void main(String[] args) throws Exception
    {
         Date today = new Date();
         System.out.println("Current date: " + today);
    }
    Calcular la diferencia entre las dos fechas.
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();           // Get the current date and time
        Thread.sleep(3000);                      // Wait 3 seconds (3000 milliseconds)
        Date newTime = new Date();               // Get the new current time
    
        long msDelay = newTime.getTime() - currentTime.getTime(); // Calculate the difference
        System.out.println("Time difference is: " + msDelay + " in ms");
    }
    Compruebe si ha pasado una cierta cantidad de tiempo:
    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();
        long endTime = startTime.getTime() + 5000;  //    +5 seconds
        Date endDate = new Date(endTime);
        Thread.sleep(3000);              // Wait 3 seconds
        Date currentTime = new Date();
        if(currentTime.after(endDate))// Check whether currentTime is after endDate
        {
            System.out.println("End time!");
        }
    }
    Determine cuánto tiempo ha pasado desde el comienzo del día:
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();
        System.out.println("Time since midnight " + hours + ":" + mins + ":" + secs);
    }
    Determine cuántos días han pasado desde el comienzo del año:
    public static void main(String[] args) throws Exception
    {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);      // First day of the month
        yearStartTime.setMonth(0);     // January (the months are indexed from 0 to 11)
        Date currentTime = new Date();
        long msTimeDifference = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  // The number of milliseconds in 24 hours
        int dayCount = (int) (msTimeDifference/msDay); // The number of full days
        System.out.println("Days since the start of the year: " + dayCount);
    }

      El getTime()método devuelve el número de milisegundos almacenados en un objeto Date". El after()método verifica si la fecha en la que llamamos al método es 
      posterior a la fecha que se pasó al método. Los getHours(), getMinutes(), getSeconds()métodos devuelven la cantidad de horas, minutos y segundos, respectivamente,
      para el objeto en el que fueron llamados. Además, en el último ejemplo puede ver que puede cambiar la fecha/hora almacenada en un objeto Fecha . Obtenemos la hora 
      y la fecha actuales y luego restablecemos las horas, los minutos y los segundos a 0. También configuramos enero como el mes y 1 como el día del mes. Así, el
      yearStartTimeobjeto almacena la fecha 1 de enero del año en curso y la hora 00:00:00.
      Después de eso, obtenemos nuevamente la fecha actual ( currentTime), calculamos la diferencia entre las dos fechas en milisegundos y la almacenamos en
      msTimeDifference. Luego dividimos msTimeDifferencepor la cantidad de milisegundos en 24 horas para obtener la cantidad de días completos desde el comienzo del 
      año actual hasta hoy

      
  

---------------------------------------------------------------------------------------------------------------------------------------


#Spring:
  Es un framework, presenta un contenedor de Inversion de Control (IoC) usando Java Reflection para manipular clases en tiempo de ejecución. 
  Principio de Inversión de Dependencia: 
  -Los modulos de alto nivel no deben depender de los módulos de alto nivel.
  -Abstracciones sobre implementaciones
  -Nos ayuda a crear código desacoplado
  -El patrón IoC es una aplicación de este principio

  Inyección de Dependencias(DI):
  -Patrón de diseño de software
  -Subtipo de IoC
  -El objetivo es tener un código facil de mantener
  -Provee a los objetos de lo que necesita
    *Constructor
    *Propiedad(Set)
    *Servicio/ Interfaz

   Spring Core Container:
   -Es un IoC container
   -Gestiona ciclo de vida de los objetos(Beans)
     *Crearlos
     *Enlazarlos
     *Configurarlos
     *Destruirlos

   **Inyección de Dependencias:**

     La inyección de dependencias en Spring es un patrón de diseño y una caracteristica fundamental del framework Spring que se utiliza para administrar las relaciones 
     entre los componentes de una aplicación. Los elementos clave de la inyección de dependencias son:

       -Bean: Un Bean es un objeto gestionado por el contenedor de Spring. Puede ser una clase Java ordinaria o una instacia de una clase configurada por Spring.
       -Contenedor de Spring: El contenedor de Spring es responsable de administrar los beans. Puede ser una AplicationContext o un BeanFactory.
       -Inyección de dependencias: Proceso de proporcionar las dependencias (Objetos que un bean necesita para funcionar) aun bean en lugar de que el propio bean las cree.
         a- Por constructor: Las dependencias se pasan como argumentos al constructor del bean.
         b- Por Setter: Las dependencias se establecen a través de métodos setter en el bean.
       -Configuración: En Spring, la configuración de los beans y sus dependenciasse puede hacer mediante XML, anotaciones a código Java.
       -Anotaciones: Spring proporciona anotaciones como @Component, @Autowired, @Configuration y otras para simplificar la configuración de beans y la inyección de
       dependencias
  
       Ejemplo:
       public interface Servicio{
         void realizarServicio();}
         @Service 
         public class ServicioA implements Servicio{
           @Override
           public void realizarServicio(){}
         }
       Lista de anotaciones:
       @Component
       @Controller
       @Service
       @Repository
       @Autowired
       @Qualifier
       @Value
       @Configuration
       @Bean
       @Scope
       @RequestMapping
       @PathVariable
       @RequestParam
       @ResponseBody
       @ExceptionHandler
       @Async
       @Transactional
  

