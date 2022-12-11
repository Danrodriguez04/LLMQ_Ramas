package org.example;

public class Examen {

    public static void main(String[] args) {
        int[] lista = {20, 50, 6, 3, 8, 11, 2};
        System.out.println(mediaAritmetica(lista));
        System.out.println(indexMaxim(lista));
    }

    //ejercicio1
    public static double mediaAritmetica(int[] lista) {
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return suma / lista.length;
    }

    //Ejercicio2
    public static int valorMinim(int[] lista) {
        int menorValor = lista[0];
//20,50,6,3,8,1,4
        for (int i = 0; i < lista.length; i++) {
            if (menorValor > lista[i]) {
                menorValor = lista[i];

            }
        }
        return menorValor;
    }
//Ejercicio3

    public static int indexminim(int[] lista) {
        int indexMenor = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[indexMenor] > lista[i]) {
                indexMenor = i;
            }

        }
        return indexMenor;
    }

    //Ejercicio 4
//20,50,6,3,8,1,4
    public static int valorMaximo (int[] lista) {
        int vm = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (vm < lista[i]){
                vm = lista[i];
            }

        }
        return vm;
    }

    //ejercicio5

    public static int indexMaxim (int [] lista) {
        int maximoIndex = 0 ;

        for (int i = 0; i < lista.length; i++) {
           if (lista[maximoIndex] < lista[i]){
               maximoIndex= i;
           }

        }return maximoIndex;
    }

    /*public static boolean ascendente (int [] lista) {
        int ascendente


    }*/

}
