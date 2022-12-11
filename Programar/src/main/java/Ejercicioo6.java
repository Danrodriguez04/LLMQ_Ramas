import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicioo6 {
    public static void main(String[] args) throws IOException {

        String nombrePersona ;

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre de usuario: ");
        nombrePersona=lector.readLine();

        System.out.println("Hola " + nombrePersona);

    }

}