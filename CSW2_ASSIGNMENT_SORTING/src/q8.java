import java.util.Arrays;

public class q8 {
    static void sortTwoArr(int a[], int b[]) {
        int i = 0;
        while (i < a.length) {
            if (a[i] < b[0]) {
                i++;
            } else {
                int temp = b[0];
                b[0] = a[i];
                a[i] = temp;
                Arrays.sort(b);
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 9, 10, 15, 20 };
        int b[] = { 2, 3, 8, 13 };
        sortTwoArr(a, b);

    }
}
