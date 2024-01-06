package excepciones;

public class ErrorArray {
    //2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    //generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
    //fuera de rango).
    private int[] conjuntoNumeros =new int[20];
    public void llenarArray(){
        try {
            for (int i = 0; i <= conjuntoNumeros.length; i++) {
                conjuntoNumeros[i] = i;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera del limite");
        }
    }

    public static void main(String[] args) {
        ErrorArray nuevoArray = new ErrorArray();
        nuevoArray.llenarArray();
    }
}
