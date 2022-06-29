public class Q20 {
    static int BinarySearch(int[] arr, int i, int max, int value, boolean b) {
        int start = i;
        int end = max;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                if (b)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (b)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public static int FindMaxBitonicArray(int[] arr, int size) {
        int start = 0, end = size - 1, mid;
        if (size < 3) {
            System.out.println("error");
            return -1;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                break;
            }
        }
        System.out.println("error");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 9, 18, 20, 17, 5, 1 };
        int size = arr.length;
        int max = FindMaxBitonicArray(arr, size);
        int k = BinarySearch(arr, 0, max, 1, true);
        if (k != -1) {
            System.out.println(k);
        } else {
            System.out.println(BinarySearch(arr, max + 1, size - 1, 1, false));
        }
    }

}
