package Array;

import java.util.Scanner;

public class VoteCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] votes = new int[10];
        int number;

        while ((number = in.nextInt()) != -1) {
            if (number >= 0 && number <= 9) {
                votes[number]++;
            }
        }

        for (int i = 0; i < votes.length; i++) {
            System.out.println(i + ":" + votes[i]);
        }
        in.close();
    }
}
