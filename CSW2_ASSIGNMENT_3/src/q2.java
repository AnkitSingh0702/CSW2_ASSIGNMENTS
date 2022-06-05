import java.util.*;

class student {
    String name;
    int age;
    int mark;
    static int count = 0;

    student(String str, int a, int m) {
        name = str;
        age = a;
        mark = m;
        count++;
    }
}

public class q2 {
    public static void main(String[] args) {
        LinkedList<student> l = new LinkedList<>();
        l.add(new student("pavitra", 19, 95));
        l.add(new student("Dezzy", 100, 100));

        student st = new student("Dezzy", 100, 100);

        for (student s : l) {
            System.out.println("Name : " + s.name);
            System.out.println("Age : " + s.age);
            System.out.println("Mark : " + s.mark);
            if (s.name.equals(st.name) && s.age == st.age && st.mark == s.mark) {
                System.out.println("Dezzy is in the list");
                l.remove(s);
            }
        }
        for (student s : l) {
            System.out.println("Name : " + s.name);
            System.out.println("Age : " + s.age);
            System.out.println("Mark : " + s.mark);
        }
        System.out.println("total objects " + st.count);
    }
}
