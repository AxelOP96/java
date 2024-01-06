package javapoo;

public class Cadena {
    //8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
    //String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
    //una frase que puede ser una palabra o varias palabras separadas por un espacio en
    //blanco y a través de los métodos set, se guardará la frase y la longitud de manera
    //automática según la longitud de la frase ingresada. Deberá además implementar los
    //siguientes métodos:
    private String frase;
    private int longitud;
    private static int vocales =0;
    public Cadena(){}

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    //• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada.
    public int mostrarVocales(){
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                vocales++;
            }
        }

        return vocales;
    }
    //• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(){
        char auxiliar ;
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 1; j < frase.length()-1; j++) {
                frase.replace(frase.charAt(j), frase.charAt(i));
            }
        }
        return this.frase;
    }
    //• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    //y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido(char letra){
        int veces=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == (letra)){
                veces++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + veces + " veces");
        return veces;
    }
    //• Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(String frase){
        if(this.frase.length() < frase.length()){
            System.out.println("La frase ingresada es mas corta");
        }
        if(this.frase.length() == frase.length()){
            System.out.println("Las frases tienen la misma longitud");
        }
        if(this.frase.length() > frase.length()){
            System.out.println("La frase ingresada es mas larga");
        }
    }
    //• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrases(String frase){
        setFrase(getFrase()+ frase);
        return getFrase();
    }
    //• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.
    public String reemplazar(char letra){
        return this.frase.replace('a',  letra);
    }
    //• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(char letra){
        boolean contiene = false;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == (letra)){
                contiene= true;
            }
        }
        return contiene;
    }

}
