package BasicSyntax;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial = 1;
        int n;

        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
        in.close();
    }
}
