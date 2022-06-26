import java.util.*;

public class q5 {
    public static void sortAccToA(int[] a, int n, int b[], int n2) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (ht.containsKey(a[i])) {
                value = ht.get(a[i]);
                ht.put(a[i], value + 1);
            } else {
                ht.put(a[i], 1);
            }
        }
        for (int j = 0; j < n2; j++) {
            if (ht.containsKey(b[j])) {
                value = ht.get(b[j]);
                for (int k = 0; k < value; k++) {
                    System.out.print(b[j] + " ");
                }
                ht.remove(b[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (ht.containsKey(a[i])) {
                value = ht.get(a[i]);
                for (int k = 0; k < value; k++) {
                    System.out.print(a[i] + " ");
                }
                ht.remove(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int b[] = { 2, 1, 8, 3 };
        sortAccToA(a, a.length, b, b.length);
    }

}
