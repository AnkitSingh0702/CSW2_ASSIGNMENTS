import java.util.*;

public class q1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(45);
        ts.add(12);
        ts.add(55);
        System.out.println(ts);
        System.out.println("TreeSet contains 55 ? " + ts.contains(55));
        ts.remove(12);
        System.out.println(ts);
    }
}
