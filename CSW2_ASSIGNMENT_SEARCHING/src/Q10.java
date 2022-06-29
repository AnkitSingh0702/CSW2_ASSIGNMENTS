import java.util.Arrays;

public class Q10 {
    static void closeToZeroPair(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Length should be greater than 2");
            return;
        }
        Arrays.sort(arr);
        int min1 = 0;
        int min2 = arr.length - 1;
        int minSum = Math.abs(arr[min1] + arr[min2]);

        int l = 1;
        int r = arr.length - 2;
        int sum = 0;
        while (l < r) {
            sum = Math.abs(arr[l] + arr[r]);
            if (sum < minSum) {
                minSum = sum;
                min1 = l;
                min2 = r;
            }
            if (sum < 0) {
                l++;
            } else if (sum > 0) {
                r--;
            } else {
                break;
            }
        }
        System.out.println("Pair sum close to zero : (" + arr[min1] + "," + arr[min2] + ")");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -5, 2, 3, 4 };
        closeToZeroPair(arr);
    }
}
