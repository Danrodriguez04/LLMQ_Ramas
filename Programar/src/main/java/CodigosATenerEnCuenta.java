public class CodigosATenerEnCuenta {


    public static void main(String[] args) {

        char c = 'M';
        int m =0;
        boolean x = true ;
        do {
            if (! x ){
                c = 'm';
            }
            do {
                m = m *2+1;
            } while (m <2);
            x = false ;
        } while ( c != 'm' );
        System . out . println ( m );

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
