import java.util.*;

public class q2 {
    static void sort01(int arr[], int start, int end) {
        int i = start;
        while (i <= end) {
            if (arr[i] == 0) {
                swap(arr, i, start);
                i++;
                start++;
            } else if (arr[i] == 2) {
                swap(arr, i, end);
                end--;
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 2, 1, 2 };
        sort01(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
