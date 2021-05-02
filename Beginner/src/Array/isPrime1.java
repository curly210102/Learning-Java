package Array;

import java.util.Scanner;

public class isPrime1 {
    public static void main(String[] args) {
        // [2 - x-1) enumeration
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
        in.close();
    }
}
