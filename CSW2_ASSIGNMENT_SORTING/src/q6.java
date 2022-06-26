import java.util.*;

public class q6 {
    static void sortEvenOdd(int arr[], int start, int end) {
        while (start <= end) {
            while (arr[start] % 2 == 0) {
                start++;
            }
            while (arr[end] % 2 == 1) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sortEvenOdd(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
