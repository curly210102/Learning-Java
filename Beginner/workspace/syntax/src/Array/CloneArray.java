package Array;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 100, 89, 12, 301 };
        int[] b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
    }
}
