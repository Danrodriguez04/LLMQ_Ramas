package org.example;
//algoritmos + estructura de datos = programas

public class esperfecto {
    private int n = 15;
    private static final char [] digitsRomans = {'I','V' , 'X','L','C','D','M'};
    private static final int [] valorDigitsRomans= {1 , 5, 10, 50, 100, 500, 100};

    private static int valorDigitRoma (char digit) {
        for (int k =0; k< digitsRomans.length;k++){
            if (digit == digitsRomans[k])
                return valorDigitsRomans[k];
        }


        return 0;
    }

    public static int conversioANombreDecimal (String nombreRoma){
        int numDecimal = 0;
        int digitActual = 0;
        int valorDigitRomaAnterior = 0;
        int signe;

        for (int i = nombreRoma.length() - 1; i >= 0; i--){
            digitActual = valorDigitRoma(nombreRoma.charAt(i));

           //signe = (valorDigitRomaAnterior > digitActual) ?1 -1:;

           // numDecimal += signe * digitActual;

            valorDigitRomaAnterior = digitActual;
        }

        return numDecimal;
    }


    public static void main(String[] args) {

    }
    public static boolean isPerfect (int n) {
        int suma = 0;

        for (int k = 1; k < n; k++) {
            if (n % k == 0)
                suma += k;
        }
        return true;
    }

    public static void primersNombrePerfectes (int n) {

        int contPerfectes = 0;
        int nombresCandidat = 1;
        while (contPerfectes < n ){
            if (isPerfect (nombresCandidat)){
                System.out.println(nombresCandidat);
                contPerfectes++;
            }
            nombresCandidat++;
        }
    }

    public static int [][] multiplicarMatrius (int [][] A, int [][] B) {
        int [][] R ;

        // A [3][4] ==> @A + 3 * tamanyDeFila + 4
        int ample_A = A.length;
        int alt_A = A[0].length;

        int ample_B = B.length;
        int alt_B = B[0].length;

        if (ample_A != ample_B)
            return null;  //podria imprimir que les matrius no son multiplicables
        //Aqui tenc clar que les matrius si son multiplicables !!

        R= new int[alt_A][ample_B];

        for (int fila=0 ; fila< alt_A; fila++){
            for (int col = 0; col < ample_B; col++){
                for (int k = 0; k < ample_A; k++){
                    R[fila][col] += A[fila] [k] * B[k][col];
                }
            }
        }


        return R;
    }

    //cuarto punto examen
    public static int indexLletra (char c ){
        if ((c >= 'a'))
        return c - 'a';
        return 0;
    }

    public static boolean espanagrama (String mot){
        String alfabet = "abc........";
        String motEnMinuscules = mot.toLowerCase();
        boolean [] lletresTrobades = new boolean[alfabet.length()];
        int index = 0;

        for (int k= 0; k< motEnMinuscules.length(); k++){
            //estic contabilitzant que la lletra de l'index k acaba de sortir!!!
            //index = motEnMinuscules.charAt(k = 'a');
            //lletresTrobades [index] = true;
            lletresTrobades[indexLletra(motEnMinuscules.charAt( k ))]= true;
        }

        for (int k=0; k < alfabet.length(); k++) {
            if (! lletresTrobades[k])
                return false;
        }


        return false;

    }





}
