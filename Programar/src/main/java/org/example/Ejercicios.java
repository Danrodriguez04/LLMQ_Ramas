package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios {

    public static void main(String[] args) throws IOException {

        int numero =0;

        BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("escribir numero: ");
        numero=Integer.parseInt(lector.readLine());

        System.out.println(esPrimo(numero));
        System.out.println(matrizBolean(numero));

    }


    public static boolean esPrimo (int numero) {

        for (int i = 2; i < numero; i++){
            if (numero%2==0){
                return false;
            }
        }return true;
    }
    public static boolean [] matrizBolean (int numero){

        boolean [] matriz = new boolean [numero] ;

        for (int i = 2 ; i < matriz.length; i++ ){

            if (esPrimo(i)){
                matriz[i]= true;
            }
        }

        return matriz;
    }

    /*public static int [] matrizNumerica (boolean [] matriz) {

        int comienzo = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]) {
                comienzo++;
            }

        }

    }*/

}
