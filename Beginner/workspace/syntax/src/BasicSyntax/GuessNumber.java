package BasicSyntax;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100 + 1);
        int number;
        int count = 0;

        Scanner in = new Scanner(System.in);

        do {
            number = in.nextInt();
            count++;
            if (number < target) {
                System.out.println("Less than target");
            } else if (number > target) {
                System.out.println("Bigger than target");
            }
        } while (number != target);

        System.out.println("Bingo!");
        System.out.println("The number is:" + target);
        System.out.println("Guess Time:" + count);
        in.close();
    }
}
