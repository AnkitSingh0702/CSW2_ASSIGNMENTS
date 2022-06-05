import java.util.*;
import java.util.Map.*;

class Address {
    int plotno;
    String city;

    Address(int plotno, String city) {
        this.plotno = plotno;
        this.city = city;
    }
}

public class q2 {
    public static void main(String[] args) {
        TreeMap<String, Address> tm = new TreeMap<String, Address>();
        tm.put("Pavitra", new Address(401, "BBSR"));
        tm.put("Ankit", new Address(85, "Ranchi"));
        tm.put("Kunal", new Address(520, "Jharsuguda"));
        for (Entry<String, Address> e : tm.entrySet()) {
            System.out.println(e.getKey() + ", " + e.getValue().plotno + ", " + e.getValue().city);
        }
    }
}
