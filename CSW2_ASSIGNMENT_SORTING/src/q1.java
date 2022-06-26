import java.util.*;

public class q1 {
    static int sort01(int arr[], int start, int end) {
        int c = 0;
        while (start < end) {
            while (arr[start] != 1) {
                start++;
            }
            while (arr[end] != 0) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                c++;
            }
        }
        return c;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 1, 0, 1 };
        int c = sort01(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        System.out.println("Total swaps : " + c);
    }

}