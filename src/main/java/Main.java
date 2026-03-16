import java.util.*;
import bronze.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static BronzeExcercises bronce = new BronzeExcercises();

    public static void main(String[] args) {

        cinema();

    }

    public void footBall() {
        System.out.println("Ingrese la cadena de texto");
        String secuence = sc.nextLine();
        sc.close();
        bronce.footBall(secuence);
    }

    public static void chatRoom() {
        System.out.println("ingrese la cadena de texto");
        String word = sc.nextLine();
        sc.close();
        bronce.chatRoom(word);
    }

    public static void cinema() {
        int n = sc.nextInt();

        int[] cine = new int[n];
        for (int i = 0; i < n; i++) {
            cine[i] = sc.nextInt();
        }

        bronce.cinema(cine);


    }
}
