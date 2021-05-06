package BasicSyntax;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int result = 0;
        int number;
        Scanner in = new Scanner(System.in);

        number = in.nextInt();
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            result = result * 10 + digit;
        }

        System.out.println(result);
        in.close();
    }
}
