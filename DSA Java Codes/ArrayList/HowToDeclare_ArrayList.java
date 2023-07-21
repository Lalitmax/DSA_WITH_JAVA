// import java.util.ArrayList;
import java.util.*;
public class HowToDeclare_ArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> str = new ArrayList<>();
    // ArrayList<Float> flt = new ArrayList<>();
    // ArrayList<Character> chr = new ArrayList<>();
    // ArrayList<Boolean> bool = new ArrayList<>();

    //add element TC=0(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);

    // get element TC=0(1)

    // int ans = list.get(2);
    // System.out.println(ans);

    // remove element TC= 0(n)

    // list.remove(2);
    // System.out.println(list);

    // set element TC= 0(n)

    // list.set(4,55);
    // System.out.println(list);

    // contains element TC= 0(n)

    // boolean str = list.contains(5);
    // System.out.println(str);
    
    // boolean str2 = list.contains(23);
    // System.out.println(str2);

    // !important add ele TC=0(n)
    list.add(0,345);
    System.out.println(list);
    
   



    
    }
}
