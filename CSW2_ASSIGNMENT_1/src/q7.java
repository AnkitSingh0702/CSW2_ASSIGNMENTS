public class q7 {
    static int findNum(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= n) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 6, 1, 9, };
        int n = arr.length;
        System.out.println("Missing element is " + findNum(arr, n));
    }
}
