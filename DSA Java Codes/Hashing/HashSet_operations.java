import java.util.*;
public class HashSet_operations {

    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(3);
        hs.add(5);
        hs.add(3);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);

        //remove
        hs.remove(3);
        System.out.println(hs);

        // clear
        hs.clear();
        System.out.println(hs);

    }
    
}
