package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Hello world!");

        double saldo;
        saldo = (double) 4/8*2;
        System.out.println(saldo);

        int m=7, n=5;
        m/= n+2;
        System.out.println(m);*/

        double numeroReal=0;
        int numeroEntero=0;
        double division;
        int modulo;

        BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("introducir numero real: ");
        numeroReal=Double.parseDouble(lector.readLine());

        System.out.println("introducir numero entero: ");
        numeroEntero=Integer.parseInt(lector.readLine());

        division= numeroReal / numeroEntero;
        modulo= (int) division / numeroEntero;

        System.out.println("division: " + division + "el modulo: " + modulo);





    }



}