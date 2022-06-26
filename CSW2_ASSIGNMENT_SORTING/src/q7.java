import java.util.Arrays;

public class q7 {
    static void reductionLeft(int arr[]) {
        Arrays.sort(arr);
        int redc = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - redc) > 0) {
                System.out.println("no of element after reduction " + (arr.length - i));
                redc = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 1, 1, 2, 3, 5 };
        reductionLeft(arr);
    }
}
