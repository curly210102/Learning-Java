package Array;

import java.util.Scanner;

public class isPrime2 {
    public static void main(String[] args) {
        // even
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        boolean isPrime = true;
        if (x == 1 || x % 2 == 0 && x != 0) {
            isPrime = false;
        } else {
            for (int i = 3; i < x; i++) {
                if (x % i == 0) {
                    isPrime = true;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
