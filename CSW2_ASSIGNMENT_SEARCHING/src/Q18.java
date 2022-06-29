import java.util.Arrays;

public class Q18 {
    static int secondLarge(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int arr[] = { 20, 65, 82, 10, 45, 100 };
        System.out.println(secondLarge(arr));
    }
}
