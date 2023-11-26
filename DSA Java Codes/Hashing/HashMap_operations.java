import java.util.HashMap;
public class HashMap_operations {
    public static void main(String[] args) {
        //Creat
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",140);
        hm.put("China",138);
        hm.put("US",80);

        System.out.println(hm);

        // Get -O(1)
        int population = hm.get("India");
        System.out.println(population);  // 140


        System.out.println(hm.get("Indonesia")); // null

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        // remove - O(1)
        System.out.println(hm.remove("India")); // 140
        System.out.println(hm);  //   {China=138, US=80}

        System.out.println(hm.remove("Indonesia")); // null

        // size
        System.out.println(hm.size());  //2
        
        // isEmpty
        System.out.println(hm.isEmpty());  // false
        
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());   // true 

    }  
}
