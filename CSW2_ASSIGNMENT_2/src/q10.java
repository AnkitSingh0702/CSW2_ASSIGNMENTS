public class q10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static void main(String[] args) {
        int x = 5;
        int y = 55;
        System.out.println("GCD(5,55) = " + gcd(x, y));
    }
}
