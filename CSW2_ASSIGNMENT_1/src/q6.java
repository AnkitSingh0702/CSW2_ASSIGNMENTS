import java.util.*;

public class q6 {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void makeWave(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 6, 7, 3, 4 };
        makeWave(arr);
        System.out.println(Arrays.toString(arr));
    }
}
