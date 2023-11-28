import java.util.TreeMap;
public class TreeMap_type {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("India", 140);
        tm.put("China", 138);
        tm.put("US", 89);
        tm.put("Canada", 99);
        tm.put("Indonesia",120);
        tm.put("D",4);
        tm.put("B",4);

        System.out.println(tm);   // sorted kyes in str
        
    }
}
