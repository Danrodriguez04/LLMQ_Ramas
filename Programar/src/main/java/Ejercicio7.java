import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        int quarters, dimes, nickels, pennies;
        double dolares;

        Scanner lector = new Scanner(System.in);

        System.out.println("quarters:");
        quarters=lector.nextInt() ;
        System.out.println("dimes:");
        dimes=lector.nextInt();
        System.out.println("nickles:");
        nickels=lector.nextInt();
        System.out.println("pennies:");
        pennies=lector.nextInt();

        dolares=0.5*quarters+0.10*dimes+0.05*nickels+0.01*pennies;

        System.out.println("dolares= " +dolares);
    }



}
