import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    /*Sentencias de seleccion 1.
    public static void main(String [] args) throws IOException {


        //
        // BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));
        double n1, n2;


        System.out.println("escribir numero 1: ");
        n1=Double.parseDouble(lector.readLine());

        System.out.println("escribir numero 2: ");
        n2=Double.parseDouble(lector.readLine());

        n1= Double.parseDouble(args[0]);
        n2= Double.parseDouble(args[1]);



        if (n1 > n2) {
            System.out.println("El numero mayor es:" + n1);

        } else if ( n2 > n1) {
            System.out.println("El numero mayor es: " + n2);

        } else {
            System.out.println("Los dos numeros son iguales ");
        }

    }*/

    /*Sentencias de seleccion 2
    public static void main(String[] args) throws IOException {


        BufferedReader lector = new BufferedReader( new InputStreamReader(System.in));
        float r1, r2;
        int p = 2;

        System.out.println("Escriba el primer numero");

        r1=Float.parseFloat(lector.readLine());

        System.out.println("Escriba el primer numero");
        r2=Float.parseFloat(lector.readLine());


        if ( Math . abs ( r1 - r2 ) <= p ) {
            System . out . println ( " Se consideran iguales " );
        } else {
            System . out . println ( " Se consideran distintos " );
        }
    }*/

    /*//Calcular la frecuencia de osilacion de un pendulo
    public static void main(String[] args) {
        // la masa se calcula en kg
        //la longitud se calcula en cm
        double m=0.15 , l=12, frecuencia;
        final double g = 9.8;

        //tener en cuenta que la masa debe ser menor a 1kg
        if (m<1.0) {

            frecuencia=Math.sqrt(g/l);
            frecuencia /= (2.0*Math.PI);

            System.out.println("la frecuencia de oscilacion del pendulo es: " + frecuencia);

        }else {
            System.out.println("se rompera el hilo ");
        }

    }*/

    /*//suma de cuadrados
    public static void main(String[] args) {

        int n=5, n2=0;

        int i =0;
        while (i<= n){
            n2+=i*i;
            i++;

        }
        System.out.println("la suma de los cuadrados es : " + n2);
    }*/

    public static void main(String[] args) {

        double contador = 0 ;
        double puntuacion;


        double [] notas= {2.5,3.4,8.9,5,1};
        System.out.println(notaMaxima(notas));

    }

    public static double notaMaxima (double [] notas) {
        double  maxima =notas [0];

        for (int i = 0; i < notas.length; i++) {
            if (maxima < notas[i]) {
                maxima = notas[i];
            }
        }
        return maxima;
    }

    public static  double media (double [] notas) {
        double suma = 0 ;

        for (int i= 0 ; i < notas.length; i++) {
            suma +=  notas[i];
        }
        return suma;
    }
}