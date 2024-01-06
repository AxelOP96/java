package herencia;

import java.util.ArrayList;

public class Ejercicio02Extra {
    public static void main(String[] args) {
        //Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
        //contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
        //y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
        //deberá mostrar la superficie y el volumen de cada edificio.
        //Además de esto, para la clase Polideportivo nos interesa saber cuantos
        //polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
        //deberemos llamar al método cantPersonas() y mostrar los resultados de cada
        //edificio de oficinas.
        ArrayList<Edificio> edificios = new ArrayList<Edificio>();
        //Polideportivo(double alto, double ancho, double largo, String nombre, String tipoDeInstalacion)
        Polideportivo poli1 = new Polideportivo(20.0, 5, 5, "poli1", "Techado");
        Polideportivo poli2 = new Polideportivo(18.0, 5, 5, "poli2", "Abierto");
        //EdificioDeOficinas(double ancho, double alto, double largo, Integer numeroDeOficinas, Integer cantidadDePersonas, Integer numeroDePisos)
        EdificioDeOficinas edi1 = new EdificioDeOficinas(6, 50, 5, 10, 40, 48);
        EdificioDeOficinas edi2 = new EdificioDeOficinas(6, 100, 5, 10, 30, 60);

        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edi1);
        edificios.add(edi2);
        Integer contadorTechado =0;
        Integer contadorAbierto=0;
        for (Edificio mostrado: edificios
             ) {
            System.out.println("la superficie es " + mostrado.calcularSuperficie());
            System.out.println("el volumen es " + mostrado.calcularVolumen());
            if(mostrado instanceof Polideportivo){
                if(((Polideportivo) mostrado).getTipoDeInstalacion().equals("Techado")){
                    contadorTechado++;
                }else{
                    contadorAbierto++;
                }
            }
            if(mostrado instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) mostrado).cantPersonas();
            }
        }
        System.out.println("Hay " + contadorTechado + " Edificios techados");
        System.out.println("Hay " + contadorAbierto + " Edificios abiertos");
    }
}
