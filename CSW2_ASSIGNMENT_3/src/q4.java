import java.util.*;

public class q4 {
    static int postfix(String exp) {
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stk.push(c - '0');
            } else {
                int x = stk.pop();
                int y = stk.pop();

                switch (c) {
                    case '+':
                        stk.push(x + y);
                        break;
                    case '-':
                        stk.push(x - y);
                        break;
                    case '/':
                        stk.push(x / y);
                        break;
                    case '*':
                        stk.push(x * y);
                        break;
                }
            }
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        String exp = "236*+";
        System.out.println(postfix(exp));
    }
}
