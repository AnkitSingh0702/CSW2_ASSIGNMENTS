import java.util.*;

public class q9 {
    static void unionIntersection(int a[], int b[], int n1, int n2) {
        Arrays.sort(a);
        Arrays.sort(b);

        int[] union = new int[n1 + n2];
        int[] intersection = new int[Math.min(n1, n2)];
        int i = 0;
        int j = 0;
        int arri = 0;
        int arrj = 0;

        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                union[arri++] = a[i];
                intersection[arrj++] = a[i];
                i++;
                j++;
            } else if (a[i] < b[j]) {
                union[arri++] = a[i];
                i++;
            } else {
                union[arri++] = b[j];
                j++;
            }
        }
        while (i < n1) {
            union[arri++] = a[i];
            i++;
        }
        while (j < n2) {
            union[arri++] = b[j];
            j++;
        }

        System.out.println("Union of arrays");
        for (int k = 0; k < arri; k++) {
            System.out.print(union[k] + " ");
        }
        System.out.println("Intersection of arrays");

        for (int k = 0; k < arrj; k++) {
            System.out.print(intersection[k] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 5, 6, 8 };
        int b[] = { 3, 5, 6, 7, 10, 11, 12 };
        unionIntersection(a, b, a.length, b.length);
    }
}
