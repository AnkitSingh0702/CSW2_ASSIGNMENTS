import java.util.*;

public class q9 {
    static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k++] = a[i++];

            } else {
                ans[k++] = b[j++];
            }
        }

        while (i < a.length) {
            ans[k++] = a[i++];
        }
        while (j < b.length) {
            ans[k++] = b[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7 };
        int b[] = { 2, 4, 6 };

        System.out.println(Arrays.toString(merge(a, b)));
    }
}
