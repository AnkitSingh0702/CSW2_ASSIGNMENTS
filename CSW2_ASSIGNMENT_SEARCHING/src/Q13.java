import java.util.*;

public class Q13 {
    static int minDifference(int arr[]) {
        Arrays.sort(arr);

        int mindif = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) < mindif) {
                mindif = arr[i] - arr[i - 1];
                num1 = arr[i];
                num2 = arr[i - 1];
            }
        }
        System.out.println("Pair -> (" + num1 + "," + num2 + ")");
        return mindif;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 10, 2, 10, -1, 5 };
        System.out.println("Minimum difference : " + minDifference(arr));
    }
}
