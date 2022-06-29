import java.util.Arrays;

public class Q11 {
    static void findPairEqualToSum(int arr[], int target) {
        if (arr.length < 2) {
            System.out.println("Pair doesn't exists");
            return;
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (target == sum) {
                System.out.println("Found Pair (" + arr[start] + "," + arr[end] + ")");
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
        int arr[] = { 1, 2, 5, 6, 9, 7, 4, 5 };
        findPairEqualToSum(arr, 11);
    }
}
