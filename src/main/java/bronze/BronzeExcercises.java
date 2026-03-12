package bronze;

public class BronzeExcercises {

    public void footBall(String secuence) {
        int counter1 = 0;
        int counter0 = 0;
        int i = 0;

        while (i < secuence.length()) {
            if (secuence.charAt(i) == '1') {
                counter1++;
                counter0 = 0;
            }
            if (secuence.charAt(i) == '0') {
                counter0++;
                counter1 = 0;
            }
            if (counter1 == 7 || counter0 == 7) {
                System.out.println("YES");
                break;
            }
            i++;
        }
        if (counter1 < 7 && counter0 < 7) {
            System.out.println("NO");
        }
    }
}
