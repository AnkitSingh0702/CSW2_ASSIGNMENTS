public class Q8 {
    static void OddCountElement2(int arr[]) {
        int xorsum1 = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xorsum1 ^= arr[i];
        }

        int setbit = xorsum1 & ~(xorsum1 - 1);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & setbit) != 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2 };
        OddCountElement2(arr);
    }
}
