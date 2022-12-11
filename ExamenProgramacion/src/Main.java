public class Main {
    public static void main(String[] args) {


        System.out.println(primersMenorOigualsque(n));

    }

    public static boolean[] erastotenes (int n) {
        boolean[] primers = new boolean[n + 1];

        for (int i = 0; i < primers.length; i++)
            primers[i] = true;
        primers[0] = false;
        primers[1] = false;

        for (int k = 2; k < primers.length; k++) {
            if (primers[k]) {
                for (int j = 2; j * k < primers.length; j++)
                    primers[j * k] = false;
            }
        }
        return primers;

    }

    public static int [] primersMenorOigualsque (int n) {
        boolean [] r = erastotenes(n);
        int [] primos = new int[n];

        for (int i = 2; i < erastotenes(n).length; i++){
            if (r[i]){

            }
        }
        return primos;
    }

    public static void imprimirPrimosBoolean (boolean [] primers) {

    }

    public static void imprimirPrimos (int [] primos){

    }





}