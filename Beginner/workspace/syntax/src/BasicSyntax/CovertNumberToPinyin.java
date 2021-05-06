package BasicSyntax;

import java.util.Scanner;

public class CovertNumberToPinyin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 0) {
            System.out.print("fu ");
        }

        int m = 100000;
        boolean isPrinting = false;
        while (m > 0) {
            int digit = Math.abs(n / m);
            if (isPrinting) {
                System.out.print(" ");
            }
            if (!isPrinting && digit > 0) {
                isPrinting = true;
            }
            if (isPrinting) {
                switch (digit) {
                    case 0:
                        System.out.print("ling");
                        break;
                    case 1:
                        System.out.print("yi");
                        break;
                    case 2:
                        System.out.print("er");
                        break;
                    case 3:
                        System.out.print("san");
                        break;
                    case 4:
                        System.out.print("si");
                        break;
                    case 5:
                        System.out.print("wu");
                        break;
                    case 6:
                        System.out.print("liu");
                        break;
                    case 7:
                        System.out.print("qi");
                        break;
                    case 8:
                        System.out.print("ba");
                        break;
                    case 9:
                        System.out.print("jiu");
                        break;
                }
            }
            n -= digit * m;
            m /= 10;
        }
        System.out.println();
        in.close();
    }
}
