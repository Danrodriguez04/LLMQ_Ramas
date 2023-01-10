public class fibonnacci {

    public int fibonnacciiterativo (int n) {
        int t1=1;
        int t2=1;
        int actual=0;

        for (int i= 2; i <= n ; i++){
            actual = t1;
            t2 += t1;
            t1=actual;
        }
        return n;
    }

    public static void main(String[] args) {

        System.out
        fibonnacci iterativo = new fibonnacci();

        iterativo.fibonnacciiterativo(4);

    }

}
