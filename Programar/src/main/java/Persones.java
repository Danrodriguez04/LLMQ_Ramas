import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persones {

    public static void main(String[] args) throws IOException {

        String persona;
        byte edad, edadMasDos;
        double estatura, estaturaMasDos;

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introducir nombre: ");
        persona=lector.readLine();

        System.out.println("Introducir edad: ");
        edad=Byte.parseByte(lector.readLine());

        System.out.println("Introducir estatura: ");
        estatura=Double.parseDouble(lector.readLine());

        edadMasDos =(byte) (edad+ 2);
        estaturaMasDos = estatura/2;

        System.out.println("edad mas 2 : " + edadMasDos + "  estatura dividido 2 :" + estaturaMasDos);


    }


}
