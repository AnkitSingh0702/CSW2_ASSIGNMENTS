import java.util.*;

public class Q12 {
    static void findPairEqualToSum(int a[], int b[], int target) {
        if (a.length < 2) {
            System.out.println("Pair doesn't exists");
            return;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int start = 0;
        int end = a.length - 1;
        int sum = 0;
        while (start < end) {
            sum = a[start] + b[end];
            if (target == sum) {
                System.out.println("Found Pair (" + a[start] + "," + b[end] + ")");
                return;
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println("Pair doesn't exists");
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5 };
        int b[] = { 2, 5, 4, 6 };
        findPairEqualToSum(a, b, 9);
    }
}
