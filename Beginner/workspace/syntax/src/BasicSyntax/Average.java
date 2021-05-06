package BasicSyntax;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        int number;
        int sum = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);
        while ((number = in.nextInt()) != -1) {
            count += 1;
            sum += number;
        }

        if (count > 0) {
            System.out.println((double) sum / count);
        }
        in.close();

    }
}
