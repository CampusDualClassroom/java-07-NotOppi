package com.campusdual.classroom;
import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {

        showFirstNaturalNumbers(5);
        sumFirstNaturalNumbers(6);
        positionInAList(4);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        for (int i = 10; i >= 1; i--){
            arreglo.add(i);
        }
        if (arreglo.contains(num))
            System.out.println("El elemento " + num + " se encuentra en la posición: " + arreglo.indexOf(num));
        else
            System.out.println("El elemento " + num + " no se encuentra en la lista.");

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            arreglo.add(i);
        }
        int sum = 0;
        for (int i = 0; i < num; i++){
            sum = sum + arreglo.get(i);
        }
        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            arreglo.add(i);
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arreglo.get(i));
        }
    }

}
