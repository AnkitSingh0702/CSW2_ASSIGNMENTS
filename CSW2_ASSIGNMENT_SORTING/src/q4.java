import java.util.*;

public class q4 {
    static int qpart(int arr[], int start, int end, int p) {
        int c = 0;
        while (start < end) {
            while (arr[start] < p) {
                start++;
            }
            while (arr[end] > p) {
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
        int arr[] = { 1, 8, 6, 2, 3 };
        int c = qpart(arr, 0, arr.length - 1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total swaps : " + c);
    }
}
