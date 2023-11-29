import java.util.*;
public class LinkedHashSet_type {
    public static void main(String args[]){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("India");
        lhs.add("Canada");
        lhs.add("US");

        System.out.println(lhs); // print in ordered
        

        // Iterator
        Iterator it = lhs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
         System.out.println( ); 

        // Enhanced for loop
        for(String s : lhs){
            System.out.print(s+" ");
        }
    }
}
