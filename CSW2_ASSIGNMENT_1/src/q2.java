public class q2 {
    static int findMax(int arr[]) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 15, 8, 9 };
        int max = findMax(arr);

        System.out.println("Maximum element : " + arr[max]);
        System.out.println("After deleting that elemnt array..");
        for (int i = max; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
