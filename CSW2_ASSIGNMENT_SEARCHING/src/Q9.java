import java.util.*;

public class Q9 {
    static int distinctSum(int arr[]) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum += arr[i];
            }
        }
        sum += arr[arr.length - 1];
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 5, 2, 5, 10 };
        System.out.println(distinctSum(arr));
    }
}
