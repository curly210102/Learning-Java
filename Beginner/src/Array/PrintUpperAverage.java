package Array;

import java.util.Scanner;

public class PrintUpperAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] numbers = new int[cnt];

        if (cnt > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }

            double average = sum / cnt;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(average);
        }
        in.close();
    }
}
