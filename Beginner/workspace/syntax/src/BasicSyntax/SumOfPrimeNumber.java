package BasicSyntax;

import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int count = 0;
        int number = 2;
        int sum = 0;

        while (count < m) {
            if (isPrime(number)) {
                count++;
                if (count >= n && count <= m) {
                    sum += number;
                }
            }
            number++;
        }
        System.out.println(sum);
        in.close();
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
