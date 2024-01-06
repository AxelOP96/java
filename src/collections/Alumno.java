package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();
    public Alumno(){}
    public Alumno(String nombre, ArrayList notas){
        this.nombre= nombre;
        this.notas= notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarNotas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las 3 notas del alumno");
        Integer numero1 = teclado.nextInt();
        notas.add(numero1);
        Integer numero2 = teclado.nextInt();
        notas.add(numero2);
        Integer numero3 = teclado.nextInt();
        notas.add(numero3);

    }
    public double calcularPromedio(){
        double resultado =0.0;
        for (Integer promedio: notas) {
            resultado += promedio;
        }
        resultado/=3;
        return resultado;
    }
}
