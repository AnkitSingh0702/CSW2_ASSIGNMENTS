import java.util.*;

public class Q6 {
    static void missingVal(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Maximum value : " + arr[arr.length - 1]);
        System.out.println("Maximum value : " + arr[0]);
        int v = arr[0];
        for (int i = 0; i < arr.length;) {
            if (v == arr[i]) {
                v++;
                i++;
            } else {
                System.out.println(v);
                v++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        missingVal(arr);
    }
}
