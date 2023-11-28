import java.util.*;

public class LinkedHashMap_type {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 140);
        lhm.put("China", 138);
        lhm.put("US", 89);
        lhm.put("Canada", 99);

        

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 140);
        hm.put("China", 138);
        hm.put("US", 89);
        hm.put("Canada", 99);

         System.out.println(lhm);
         System.out.println(hm);
    }
}
