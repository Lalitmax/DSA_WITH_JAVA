import java.util.*;

public class Union_and_intersection_of_two_arrays {
    public static void main(String arf[]) {

        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> hs = new HashSet<>();
        // Union
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        System.out.print("Union= " + hs.size()   + hs);

        ArrayList<Integer> al = new ArrayList<>();



        hs = new HashSet<>();
        // InterSection
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            hs.add(num);
        }
         
        for(int i=0; i<arr2.length; i++){
            int num = arr2[i];

            if(hs.contains(num)){
                al.add(num);
                 hs.remove(num);
            }
        }
        System.out.println();
        System.out.print("InterSection= " + al.size()+ al);
    }
}
