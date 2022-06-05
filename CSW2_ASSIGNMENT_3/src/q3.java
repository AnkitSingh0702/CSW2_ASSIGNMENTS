import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int n = 12;
        Stack<Integer> stk = new Stack<Integer>();

        while (n != 0) {
            stk.push(n % 2);
            n /= 2;
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
    }
}
