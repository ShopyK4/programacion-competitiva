import java.util.*;
import bronze.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static BronzeExcercises bronce = new BronzeExcercises();

    public static void main(String[] args) {
        System.out.println("Ingrese la cadena de texto");
        String secuence = sc.nextLine();
        sc.close();

        bronce.footBall(secuence);

    }
}
