import java.util.*;

public class Q14 {
    static int minDifference(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int mindif = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        int i = 0;
        int j = 0;
        int dif = 0;
        while (i < a.length && j < b.length) {
            dif = Math.abs(a[i] - b[j]);
            if (mindif > dif) {
                mindif = dif;
                num1 = a[i];
                num2 = b[i];
            }
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Pair -> (" + num1 + "," + num2 + ")");
        return mindif;
    }

    public static void main(String[] args) {
        int a[] = { 1, 8, 7, 10 };
        int b[] = { 2, 10, -1, 5 };
        System.out.println("Minimum difference : " + minDifference(a, b));
    }
}
