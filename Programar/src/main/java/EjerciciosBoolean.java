public class EjerciciosBoolean {

    public static void main(String[] args) {
        int [] matriu = {3,40,8,1,3,6};

        System.out.println(indexMinimo(matriu));

    }

    public static double mitjaAritmetica (int [] matriu){

        double suma= 0;

        for (int i=0; i<matriu.length;i++){
            suma+= matriu[i];
        }

        return suma/matriu.length;
    }

    public static int valorMinimo (int [] matriu){
//{1,40,3,6,58,6}
        int vMinimo = matriu [0];

        for (int i=0 ; i<matriu.length;i++){
            if (matriu[i] < vMinimo){
                vMinimo = matriu[i];
            }
        }
        return vMinimo;
    }

    public static int indexMinimo (int [] matriu){

        int indexMinimo = matriu[0];

        for (int i=0 ; i < matriu.length;i++){
            if (i < indexMinimo){
                indexMinimo = i ;
            }
        }
        return indexMinimo;
    }

}