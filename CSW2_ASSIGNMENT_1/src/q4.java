public class q4 {
    static int binarySearch(int arr[], int t) {
        int start = 0;
        int end = arr.length - 1;

        boolean acc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == t) {
                return mid;
            }
            if (acc) {
                if (arr[mid] < t) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < t) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 2, 1 };
        int index = binarySearch(arr, 2);
        if (index >= 0) {
            System.out.println("Index : " + index);
        } else {
            System.out.println("Element doesn't exists.");
        }
    }
}
