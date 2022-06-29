import java.util.*;

public class Q4 {
    static Set<Integer> removeDuplicate(List<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (!set.contains(l.get(i))) {
                set.add(l.get(i));
            }
        }
        return set;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(5);
        System.out.println(removeDuplicate(l));
    }
}
