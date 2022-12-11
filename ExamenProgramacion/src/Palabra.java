public class Palabra {
    public static void main(String[] args) {


    }



    // "papapatxin papapatxin Visca Sant Antoni Glorios"
    //  01234567890123456789012345678901234567890123456789
    public static boolean tectConteStringAlaPosicion (String text, String paraulaAcercar, int pos) {
        if ((pos< 0) || (pos>=text.length()))
            return false;
        if (pos + paraulaAcercar.length() > text.length())
            return false;
        for (int r= 0 ; r<paraulaAcercar.length();r++){
            if (paraulaAcercar.charAt(r) != text.charAt(r+pos)) {
                return false;
            }
        }
        //contarNombreOcurrenciesParaulesDinsText (...) ==> int [0....n]
        return true;
    }

}
