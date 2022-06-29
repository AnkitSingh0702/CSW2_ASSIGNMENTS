import java.util.*;

public class Q2 {
    static void printDuplicate(int ar[]) {
        Arrays.sort(ar);
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == ar[i - 1]) {
                System.out.println(ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 1, 5, 8, 6, 3, 5, 8 };
        printDuplicate(ar);
    }
}
