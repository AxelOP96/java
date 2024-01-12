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
  prueba es el nombre de la clase. java tiene un metodo particular llamado main que es la ejecucion del progrma principal.

  public static void main (String[] args) {
todo lo que escriba aca va a pertenecer a este metodo. dentro de los metodos se escriben sentencias.
System.out.println("Hola Mundo"); es para imprimir por pantalla.
  }
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

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
  

