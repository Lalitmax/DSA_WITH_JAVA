import java.util.*;
public class Majority_element2_method2 {
    public static void main(String arhs[]){
        int nums[] = {2,2,2,4,4,5,5,5};
        int n=nums.length;
        int nBy3 = n/3;


        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        Set<Integer> keys = hm.keySet();
        /* why i use Integer rather than int, Because keys is Set<Integer> are of 
        type Integer, so the loop variable key should also be 
        of type Integer. you can use int but that is not correct, it may run
         */
         
        for(Integer key : keys){ 
            if(hm.get(key)>nBy3){
                System.out.println(key);
            }
        }
           
    }
}
