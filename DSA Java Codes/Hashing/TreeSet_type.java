import java.util.*;
public class TreeSet_type{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(2);
        ts.add(9);
        ts.add(1);

        System.out.println(ts);

        // Iterator loop
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
            
        }
        System.out.println();
        // Enhanced for loop
        for(Integer num : ts){
            System.out.print(num+" ");
        }

    }
}