import java.util.*;

public class Swap_In_ArrayList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String srf[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(131);
        list.add(12);
        list.add(1322);
        list.add(14);
        list.add(115);

        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.print(list);

    }
    
}
