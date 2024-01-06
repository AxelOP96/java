package javapoo;

public class Matematica {
    //9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
    //con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
    //un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
    //usará el Math.random para generar los dos números y se guardaran en el objeto con
    //su respectivos set. Deberá además implementar los siguientes métodos:

    private int numero1;
    private int numero2;
    public Matematica(){}
    public Matematica(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
    //valor

    public int devolverMayor(){
        if(numero1 < numero2){
            return numero2;
        }
        if(numero1 > numero2){
            return numero1;
        }
        else{
            System.out.println("Tienen el mismo valor");
            return 0;
        }
    }

}
