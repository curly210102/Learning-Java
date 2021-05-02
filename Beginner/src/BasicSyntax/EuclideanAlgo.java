package BasicSyntax;

import java.util.Scanner;

public class EuclideanAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println(a);
        in.close();
    }
}
