public class q5 {
    static int maxSubArray(int arr[]) {
        int maxsum = -Integer.MAX_VALUE;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum > maxsum) {
                maxsum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -8, 5, 2, 6, -10 };
        System.out.println("Maximum sum is " + maxSubArray(arr));
    }
}
