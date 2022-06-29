public class Q17 {
    static int noOfTriangles(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] > arr[j2]) {
                        c++;
                    }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 50, 60, 80, 100 };
        System.out.println(noOfTriangles(arr));

    }
}
