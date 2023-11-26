import java.util.HashMap;
import java.util.*;

public class Iteration_on_hashmap {
    public static void main(String[] args) {
        //Creat
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",140);
        hm.put("China",138);
        hm.put("US",80);

        Set<String> keys =  hm.keySet();
        System.out.println(keys);

        // Iteration
        for (String k : keys) {
            System.out.println(k +"->"+ hm.get(k)+" ");
            
        }
        


    }
}
