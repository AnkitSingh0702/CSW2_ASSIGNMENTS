import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(4);
        l.add(2);
        l.add(8);
        System.out.println(l);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        System.out.println(n + " is in the list ? " + l.contains(n));
        l.remove(n);
        System.out.println(l);
        if (l.size() <= 0) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
        s.close();
    }
}
