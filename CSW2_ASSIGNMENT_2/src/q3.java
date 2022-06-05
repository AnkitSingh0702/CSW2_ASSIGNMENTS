public class q3 {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 9286;
        System.out.println("Reversed number : " + reverse(n));
    }
}
