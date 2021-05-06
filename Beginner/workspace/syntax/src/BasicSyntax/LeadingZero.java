import java.util.Scanner;

public class LeadingZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;

        if (number < 0) {
            count = 32;
        } else {
            while (number != 0 && count < 32) {
                number = (int) number / 2;
                count++;
            }
        }

        System.out.println(32 - count);
        in.close();
    }
}
