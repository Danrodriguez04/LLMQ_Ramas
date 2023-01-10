import java.util.Arrays;

public class AnalisiText {

    public static char [] delimitadores = {' ', '-', ',', '.', '!', '?', '\''};
    public static String provaExecucio = "TEXzTO' SUPER lARGO ?que solo acpeta bvalores en una rraaas";
    static char [] arrayLetras = frase();
    public static int posicion = 7;


    public static void main(String[] args) {



        System.out.println(Arrays.toString(frase()));// imprimir un metodo

        //System.out.println(array);// ejemplo creando un nuevo array que tenga los valores del resutado de un metodo

        AnalisiText.imprimirArray();


        //ejercicio 4
        System.out.println("Es un delimitador ?" + delimitadoresDefinidos());
        //Ejercicio 5
        System.out.println("Es comienzo de palabra ?" +comienzoPalabra());
    }




    //punto 2
    public static char [] frase() {

        char[] letrasFrase = new char[provaExecucio.length()];

        for (char n = 0; n < provaExecucio.length(); n++) {
            letrasFrase[n] = provaExecucio.toLowerCase().charAt(n);
        }
        return letrasFrase;
    }

    //punto 3
    public static void imprimirArray () {
        System.out.println(Arrays.toString(delimitadores));
    }

    //punto 4
    public static boolean delimitadoresDefinidos() {

        for (int k = 0; k < delimitadores.length; k++) {
            if (arrayLetras[posicion] == delimitadores[k]) {
                return true;
            }
        }
        return false;
    }


    //5
    public static boolean comienzoPalabra() {

        if (delimitadoresDefinidos()) {
            return false;
        }
        if (posicion == 0) {
            return true;
        }
        if (posicion-1 == delimitadores.length){
            return true;
        }
        return false;
        }














    /*public static String analizarTexto (String palabra){
        char [] caracteres = {' ', '?', '-', ',', '.','!', '\''};

        for (char i= 0; i < caracteres.length; i++ ) {
            for (int n= 0; n<palabra.length(); n++){
                char prueba= palabra.charAt(n);
                if (!(prueba == caracteres [i])){
                    return palabra;
                }else {
                    System.out.println("No se puede escribir el texto");
                }

            }
        }
        return palabra;*/


//System.out.println("caracteres = " + "[" +  caracteres[i] +"]");


}
