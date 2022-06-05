import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total no of elements : ");
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }
        System.out.println(set);
        s.close();
    }
}
