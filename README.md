# java
#Practicas de Java de la universidad con sus explicaciones y actividades

*Clase 1:
  **Que es la programacion? Hacer que la maquina haga lo que querramos. Ayudan a resolver problemas y facilitar otras. Se espera un resultado consistente, repetible y confiable.
  **Programa: es un grupo de ordenes que realizan un algoritmo para resolver un problema. 
  **Datos: representan objetos sobre los que operamos.
  **Informacion: datos procesados entre si que tiene un significado propio.
  **Procedimiento: todo lo que pasa entre medio del paso del dato a la informacion.
  **Los datos entran al procesador y en la salida se transforman en resultados esperados. El proccesador es quien ejecuta el programa y hace visible el resultado esperado del programa. El procesador interpreta las instrucciones como codigo binario, es decir unos y ceros, es el lenguaje del procesador. Este es un lenguaje de bajo nivel, cuando esta mas cerca del lenguaje humano es de alto nivel(por ejemplo: java, python, cobol, etc).
  **Caracteristicas:
  La mayoria de los lenguajes son capaces de realizar operaciones aritmeticas, manipulacion y analisis de texto, loops, condicionales, entrada/ salida, funciones y procedimientos para manipular los datos, utilizar librerias de funciones y procedimientos prefabricados, y organizar programas combinando estructuras simples para formar otras complejas. 
  **El codigo fuente:
   Es el documento de texto que contiene las instrucciones del lenguaje correspondiente. Es un lenguaje de alto nivel y contiene las instrucciones de nuestro algoritmo. el codigo fuente contiene el programa en un formato legible, en el lenguaje de alto nivel correspondiente. el interprete convierte las lineas a unos y ceros y se ejecutan los unos y ceros y asi con cada linea hasta que finaliza el programa. En la compilacion agarra todas las instrucciones y genera un programa objeto(.exe). el momento de deteccion de error cambia segun si sea compilado o interpretado ya que este sera en la ejecucion o en el momento de la compilacion. En java escribimos nuestro codigo fuente(.java), el siguiente paso compila (javac), esta compilacion genera un  bytecode(.class) un codigo intermedio, este bytecode es interpretado por la java virtual machine y ejecuta linea por linea, para otros compiladores se cra un ejecutable o sea un exe para el caso de Java se crea un bytecode, o sea un archivo intermedio que va a ser el alimento de la maquina virtual en Java. Ahi pasa a ser traducido por la maquina. Por cada modificacion que haga en el codigo fuente debo compilar y creo un nuevo Bytecode y luego interpretarlo.
 **Ciclo de vida del software: diseñar, escribir el codigo fuente y generar el objetivo ejecutable, ejecutar la solucion y verificar el resultado y el debug(busqueda de errores).
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *Clase 2:
**Eclipse es un editor de texto para poder escribir codigo fuente en la maquina. Es un IDE(interface developer environment).
 El compilador toma todo el codigo fuente y busca errores de sintaxis, ejecuta todo y lo compila. En el lenguaje interpretado el interprete convierte la linea a codigo maquina linea por linea, cuando ejecuto un compilado ya esta traducido, en los interpretes los tipos de datos pueden cambiar, el error aparece cuando lo ejecuto. Desde el bytecode puedo convertirlo para que funcione en windows, linux e ios, esto se hace desde el compilador. Para correrlo se necesita la java virtual machine que corra en el sistema operativo que desee. 
 Primero que todo se diseña el algoritmo, es la estrategia para resolver un problema, este puede tener una mayor o menor cantidad de pasos.
 Una variable es un espacio en memoria.
 Los elementos presentes en la mayoria de los lenguajes de programacion: variables, loops, condicionales, entrada/ salida y subrutinas y funciones.
  **Enfoques:
  Estructuradas: refinamiento progresivo; dividir y conquistar; y reducir la complejidad utilizando una estructura de bloques mas simples y manejables.
  Orientadas a objetos: modelar el problema basados en objetos reales; asignarle a cada objeto un comportamiento; y resolver mediante colaboracion e interaccion entre objetos. 
   **Estructuras añadidas: Primero es la secuencia, luego la iteracion y por ultimo la decision.
   **manejo de errores: pueden detectarse como cualquier otra condicion o manejarse como una excepcion para permitir separar el manejo de errores y excepciones del flujo normal del programa.
   **Procedimientos y funciones: son bloques o grupos de instrucciones que producen un resultado especifico; imprescindible para la buena organizacion del codigo; idealmente trabajan con parametros, no afectan variables globales.
   **practica: revisar codigo fuente y reconocer metodos, procedimientos, bloques y funciones.
   **Interfaz de usuario: todo aquello con lo que interactua el usuario. la interaccion con el usuario puede realizarse a traves de distintos mecanismos como el monitor, impresora, fax, etc.
   **Tipos de interfaz: interfaz textual que era el modo predominante antes de la difusion masiva de las pc y las macintosh. puede estar orientado a la linea de comando y toda la interaccion se produce en la ultima linea el resto es historia previa; el orientado a pantalla la interaccion se realiza enviando y recibiendo la pantalla completa como un solo bloque. la interfaz grafica(gui), es la estandar, posee mayor riqueza visual, una mayor productividad, facilidad de uso y ergonomia.
   **Almacenamiento: siempre necesitamos contar con datos: datos de referencia permanentes, movimientos y transacciones, resultados de un proceso y resultados intermedios pasando de un programa a otro. Como la memoria de la maquina es volatil necesitamos mecanismos de almacenamiento como archivos planos, bases de datos(jerarquica o relacional.)
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *Clase 3:
Java es un conjunto de componentes y caracteristicas que nos brindan las herramientas necesarias para construir software moderno en diferentes ambientes. La tecnologia Jva contiene: un entorno de programacion(es un entorno de programacion porque nos ofrece una sintaxis a traves de la cual se puede escribir cualquier tipo de aplicacion), un entorno de desarrollo(nos provee de una amplia gama de herramientas para el desarrollo de aplicaciones como ser un compilador, javac, un interprete, jvm, un generador de documentacion, javadoc, una herramienta de paquetes de archivos, jar), un entorno de aplicacion, como entorno de despliegue java nos ofrece una herramienta(jre), el cual se encarga de brindar todo lo necesario para que las aplicaciones escritas con java funcionen de manera correcta.
**objetivos: El lenguaje de programcion java fue diseñado para ser: orientado a objetos; distribuido; simple; multihilo(dividir el proceso en subprocesos para descomponer y mejorar la performance, se usa para correr varios procesos al mismo tiempo); seguro; e independiente de la plataforma.
**Orientado a objetos: para escribir cualquier progrma en java es necesario definir los objetos que en el dben intervenir. Esta caracteristica nos da la posibilidad de representar de manera clara la realidad y los problemas que debemos resolver.
**Caracteristicas: cuenta con la java virtual machine, la java runtime environment, el garbage collector, y el java development kit. La jvm es un programa especial que interpreta el archivo intermedio bytecode. la jre esta conformada por las bibliotecas de clase y la jvm, las bibliotecas de clases java (tambien llamadas api) son bibliotecas de codigo previamente escrito que pueden ser combinadas con el codigo que nosotros escribamos para aplicaciones robustas. El garbage collector se encarga de la simpleza, ya que recorre constantemente la tabla de referemcias a objetos y cuando un objeto no es referenciado desde ningun otro objeto o funcion este es eliminado y en consecuencia liberada la porcion de memoria en la que estaba almacenado. el jdk contiene todo lo necesario para construir aplicaciones java. 
** Una clase :
public class Prueba {
  prueba es el nombre de la clase. java tiene un metodo particular llamado main que es la ejecucion del progrma principal.

  public static void main (String[] args) {
todo lo que escriba aca va a pertenecer a este metodo. dentro de los metodos se escriben sentencias.
System.out.println("Hola Mundo"); es para imprimir por pantalla.
  }
}

comandos: dir muestra el contendiso de un directorio; cd cambia directorio; cd .. vuelvo al directorio anterior; cd \ va al raiz; letra selecciona el disco rigido;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 4:
**tipos de datos primitivos en Java: byte con un tamaño de 8 bits, short con un tamaño de 16 bits, int con un tamaño de 32 bits, long con un tamaño de 64 bits, char con un tamaño de 16 bits, float con un tamaño de 32 bits, double con un tamaño de 64 bits y boolean que solo puede ser true o false. el byte va desde -128 a 127; el short ;
Los tipos no primitivos correponden a objetos creados a partir de una clase y por ser objetos asume como valor por defecto null. Es importante destacar la diferencia que existe entre realizar una operacion de asignacion entre variables del tipo objeto y variables de tipo primitivo. En el caso del tipo primitivo esta operacion implica que el dato contenido en una variable se copia en otra. En el caso en que se trate de un tipo objeto debemos recordar que lo que se esta copiando es una referencia al objeto, no el objeto. de esta manera no tenemos dos copias del objeto sino un unico objeto referenciado por dos variables. Java es un lenguaje fuertemente tipado o sea estricto a la hora de asignar valores a las variables. El compilador solo admite asignar a una variable un dato del tipo declarado en una variable, aunque permite realizar conversiones para almacenar en una variable un dato de tipo diferente al declarado. Las conversiones se pueden realizar de dos maneras: de forma implicita o explicita.
**Conversiones implicitas: se realizan en forma automaticas a traves del compilador, antes de almacenarlo en una variable. ejemplo:
int i;
byte b = 30;
i = b;
**Conversiones explicitas: para convertir explicitamente le debo pedir que cambie al tipo que quiero: Ejemplo:
promedio = (float)suma/3; variable_destino=(tipo_destino)data_origen; con esta expresion se le indica al compilador que convierta dato_origen a tipo_destino para que pueda ser almacenado en la variable destino. A esta operacion se la denomina casting o estrechamineto ya que al convertir un dato de un tipo en otro de tipo inferior se realiza una reduccion, un estrechamineto que en algunos casos puede llevar a una perdida de datos o precision, pero que evitaria posibles errores de ejecucion.
un String es una cadena de caracteres que va entre "";
si intento sumar tipos distintos se convierte en el mas grande. Si sumara enteros y char el char aumentaria ya que este representa caracteres ASCII.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 5:
operadores relacionales: <; >; <=; >=; ==; !=;
operadores logicos: &&(solo se cumple si las dos condiciones son verdaderas); || (se cumple si al menos una de las opciones es verdadera); !(niega si es verdadero y lo convierte a falso y viceversa).
Todos los operadores relacionales terminan dando un boolean ya que comparan y retornan si es true o false la relacion.  
 tipoDato xxxx = tipoDato (el tipo de dato tiene que ser igual o menor). En los operadores lógicos se usan booleans y se 
comparan.  Primero se resuelven los ||. Comparo cada uno como si fueran cálculos combinados CLASE. 
x++: llamado post incremento, este operador primero realiza la operacion luego le añade uno a la variable. 
++x:llamado pre incremento, este operador suma uno a la variable antes de realizar la operacion y luego realiza la operacion.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 6:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 7:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 8:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
