package javapoo;

public class Raices {
    //3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
    //ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
    //y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
    //constructor. Luego, las operaciones que se podrán realizar son las siguientes:

    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;
    public Raices(int a, int b, int c){
        this.coeficienteA = a;
        this.coeficienteB = b;
        this.coeficienteC = c;
    }
    //• Método getDiscriminante(): devuelve el valor del discriminante (double). El
    //discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(){
        double formula =0.0;
        formula = (coeficienteB * coeficienteB) - 4 * coeficienteA * coeficienteC;
        return formula;
    }
    //• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    //que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(){
        boolean tiene = false;
        if(getDiscriminante()>=0){
            tiene=true;
        }
        return tiene;
    }
    //• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    //para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(){
        boolean tiene = false;
        if(getDiscriminante()==0){
            tiene=true;
        }
        return tiene;
    }
    //• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    //pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    //obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
    //caso de no existir solución, se mostrará un mensaje.
    //Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
    //delante de -b
    public void calcular(){
        double solucion=0.0;
        solucion = ((-1)* coeficienteB + Math.sqrt((coeficienteB*coeficienteB)- (4*coeficienteA*coeficienteC)))/ (2*coeficienteA);
        System.out.println(solucion);
        solucion = ((-1)* coeficienteB - Math.sqrt((coeficienteB*coeficienteB)- (4*coeficienteA*coeficienteC)))/ (2*coeficienteA);
        System.out.println(solucion);
    }
    //• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    //posibles soluciones.
    public void obtenerRaices(){
        if(tieneRaices()){
            calcular();
        }
    }
    //• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    //Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(){
        if(tieneRaiz()){
            calcular();
        }

    }
}
