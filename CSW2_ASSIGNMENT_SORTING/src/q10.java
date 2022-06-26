import java.util.*;

public class q10 {
    static int findMax(ArrayList<Integer> l) {
        if (l.size() == 0) {
            return 0;
        }
        return Collections.max(l);
    }

    static int findMin(ArrayList<Integer> l) {
        if (l.size() == 0) {
            return 0;
        }
        return Collections.min(l);
    }

    static double findMedian(ArrayList<Integer> l) {
        Collections.sort(l);
        if (l.size() % 2 != 0) {
            return l.get((l.size()) / 2);
        } else if (l.size() % 2 == 0) {
            return (l.get(l.size() / 2 - 1) + (l.get(l.size() / 2))) / 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(4);
        list.add(14);
        list.add(2);
        list.add(1); // 1 2 4 5 10 14 15

        System.out.println(findMax(list));
        System.out.println(findMin(list));
        System.out.println(findMedian(list));

    }
}