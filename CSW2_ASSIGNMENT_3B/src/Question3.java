import java.util.*;
public class Question3 {
    public static void main(String [] args) {
        TreeMap<Integer , String> tm = new  TreeMap<Integer , String>();
        tm.put(8, "p1");
        tm.put(6, "p3");
        tm.put(4, "p2");
        tm.put(1, "p5");
        tm.put(2, "p4");

        for(Integer k : tm.keySet()){
            System.out.println(tm.get(k));
        }
    }
}
