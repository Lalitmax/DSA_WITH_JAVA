import java.util.*;
public class SizeOf_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        int sz = list.size();
        System.out.println(sz);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
    
}
