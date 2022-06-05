public class q3 {
    static int linearSearch(int arr[], int t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 5, 3, 2, 10, 11, 95 };
        int index = linearSearch(arr, 2);
        if (index >= 0) {
            System.out.println("Index :" + index);
        } else {
            System.out.println("Element doesn't exists.");
        }
    }
}
