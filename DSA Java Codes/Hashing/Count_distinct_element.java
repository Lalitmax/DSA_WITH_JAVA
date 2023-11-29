import java.util.*;
public class Count_distinct_element {
    public static void main(String arf[]){
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs  = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        System.out.print(hs.size());
        
    }
}
