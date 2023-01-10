import java.util.Arrays;

public class EjerciciosBoolean {

    public static void main(String[] args) {
        int[] matriu = {4, 7, 550, 5, 5, 3};
        int[][] A = new int[3][5];
        //A [0] [0] =
        int[][] B = new int[3][5];

        //imprimir un array
        System.out.println(Arrays.toString(matrizAlreves(matriu)));


    }


    public static double mitjaAritmetica(int[] matriu) {

        double suma = 0;

        for (int i = 0; i < matriu.length; i++) {
            suma += matriu[i];
        }

        return suma / matriu.length;
    }
    public static int valorMinimo(int[] matriu) {
//{1,40,3,6,58,6}
        int vMinimo = matriu[0];

        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i] < vMinimo) {
                vMinimo = matriu[i];
            }
        }
        return vMinimo;
    }

    public static int indexMinimo(int[] matriu) {

        int indexMinimo = matriu[0];

        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i] < matriu[indexMinimo]) {
                indexMinimo = i;
            }
        }
        return indexMinimo;
    }
    public static int valorMaximo(int[] matriu) {
//{1,40,3,6,58,6}
        int valorMaxim = matriu[0];

        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i] > valorMaxim) {
                valorMaxim = matriu[i];
            }
        }
        return valorMaxim;
    }
    public static int indexMaxim(int[] matriu) {
        int indiceMaximo = matriu[0];
//4,60,100,500,1,200
        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i] > matriu[indiceMaximo]) {
                indiceMaximo = i;
            }
        }
        return indiceMaximo;
    }
    public static boolean ascendente(int[] matriu ) {
        //4,60,100,500,50,1000

        for (int i = 0; i < matriu.length-1; i++) {
            if (matriu[i] > matriu[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean imparDescendente (int [] matriu) {

        for (int i = 1; i < matriu.length-2; i+=2){
            if (!(matriu[i] > matriu[i+2]))
                return false;
        }
        return true;
    }
    public static int [] matrizAlreves (int [] matriu){
        //creamos un array con la longitud del array existente
        int [] matriuReves = new int[matriu.length];
        int inicio =0 ;

        //-1 es para iniciar desde el final del array
        for (int i = matriu.length-1 ; i >= 0; i--){

            //asignacion de valores
            matriuReves[inicio] = matriu[i];

            //selecciona el siguiente lugar de la matriz para asignarle un valor
            inicio++;
        }
        return matriuReves;
    }

    

    public static int[][] matrizMultiplicable(int[][] A, int[][] B) {
        int[][] R;

        int ample_A = A[0].length;
        int alt_A = A.length;
        int ample_B = B[0].length;
        int alt_B = B.length;

        if (ample_A != alt_B) {
            System.out.println("Les matrius NO son multipicables");
            return null;
        }
        R = new int[alt_A][ample_B];

        for (int fila = 0; fila < alt_A; fila++) {
            for (int col = 0; col < ample_B; col++) {

                for (int k = 0; k < ample_A; k++) {
                    R[fila][col] += A[fila][k] * B[k][col];
                }
            }
        }
        return R;
    }


}