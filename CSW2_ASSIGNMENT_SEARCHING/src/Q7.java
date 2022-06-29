public class Q7 {
    static int OddCountElement(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 5 };
        System.out.println(OddCountElement(arr));
    }
}
