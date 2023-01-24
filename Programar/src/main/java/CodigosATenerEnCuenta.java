
public class CodigosATenerEnCuenta {


    public static void main ( String  [] args ) {

        double n1=5 , n2=8 ;
        n1 = Double . parseDouble ( args [0]);
        n2 = Double . parseDouble ( args [1]);
        if ( n1 > n2 ) {
            System . out . println ( n1 );
        } else {
            if ( n1 < n2 ){
                System . out . println ( n2 );
            } else {
                System . out . println ( " Los dos numeros son iguales " );
            }
        }
    }

    /*public static int[] invertirUnaMatriz() {

        int[] array = {5, 1, 12, -5, 16};
        int tmp =0;

        //Imprimeix l'array amb els numeros invertits

        for (int i = 0; i < array.length/2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
            System.out.print(array[i] + " ");
        }
        return array;
    }*/


}
