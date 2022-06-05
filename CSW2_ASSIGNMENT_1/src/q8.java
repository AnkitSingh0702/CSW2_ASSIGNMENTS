import java.util.*;

public class q8 {
    static void makeMaxMin(int arr[]) {
        int ans[] = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        while (i < j) {
            ans[k++] = arr[j];
            ans[k++] = arr[i];
            i++;
            j--;

        }
        ans[arr.length - 1] = arr[(arr.length - 1) / 2];
        for (int k2 = 0; k2 < ans.length; k2++) {
            arr[k2] = ans[k2];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7 };
        makeMaxMin(arr);
        System.out.println(Arrays.toString(arr));
    }
}
