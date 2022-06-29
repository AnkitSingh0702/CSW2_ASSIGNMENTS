public class Q5 {
    static int findElement(int[] arr, int n) {
        int xorsum = 0;
        for (int i = 1; i <= n; i++) {
            xorsum ^= i;
        }
        for (int i = 0; i < arr.length; i++) {
            xorsum ^= arr[i];
        }
        return xorsum;
    }

    public static void main(String[] args) {
        int n = 8;
        int arr[] = { 1, 2, 3, 8, 7, 6, 4 };
        System.out.println(findElement(arr, n));
    }
}
