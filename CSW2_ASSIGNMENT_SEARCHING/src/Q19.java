import java.util.Arrays;

public class Q19 {
    static int findMid(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 32, 89, 8, 4 };
        System.out.println(findMid(arr));
    }
}
