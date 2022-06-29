public class Q16 {
    static void findTriplet(int arr[], int t) {
        for (int i = 0; i < (arr.length - 2); i++) {
            for (int j = i + 1; j < (arr.length - 1); j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == t) {
                        System.out.println("Triplet :: (" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                        return;
                    }
                }
            }
        }
        System.out.println("Pair doesn't exists");

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 3, -1, 0, 1, -1 - 2 };
        findTriplet(arr, 9);
    }
}
