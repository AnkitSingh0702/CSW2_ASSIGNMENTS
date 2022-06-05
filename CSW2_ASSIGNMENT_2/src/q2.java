public class q2 {
    static String convertToBinary(int n) {
        String temp = "";
        while (n != 0) {
            temp += n % 2;
            n /= 2;
        }
        String ans = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            ans += temp.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Binary - " + convertToBinary(n));
    }
}
