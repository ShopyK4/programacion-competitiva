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

    public void chatRoom(String word) {
        int i = 0;
        int j = 0;
        char[] target = {'h', 'e', 'l', 'l', 'o'};

        int result = 0;
        while (i < word.length()) {

            if (word.charAt(i) == target[j]) {
                j++;
                result++;
                if (result == 5) {
                    System.out.println("SI");
                    break;
                }
            }
            i++;
        }
        if (result < 5) {
            System.out.println("NO");
        }
    }

    public void cinema(int[] arr) {
        int devuelta = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 25) {
                devuelta += 25;
            }
            if (arr[i] == 50) {
                if (devuelta >= 25) {
                    devuelta -= 25;
                }
                else {
                    System.out.println("no hay devuelta");
                    devuelta = -1;
                    break;
                }
            }
            if (arr[i] == 100) {
                if (devuelta >= 75) {
                    devuelta += 25;
                    devuelta -= 75;
                }
                else {
                    System.out.println("no hay devuelta");
                    devuelta = -1;
                    break;
                }
            }
        }
        if (devuelta >= 0) {
            System.out.println("YES");
        }
    }
}
