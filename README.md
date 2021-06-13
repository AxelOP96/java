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

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 5:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 6:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 7:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*Clase 8:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------