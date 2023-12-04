import java.util.*;
public class Largest_subarray_with_zero_sum {
    public static void main(String args[]){
        int nums[] = {2,8,-3,-5,2,-4,6,1,2,1-3,4};

        HashMap<Integer,Integer> hm = new HashMap<>();

        hm.put(0,-1);
        int currSum=0;
        int maxSubArr = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currSum +=nums[i];

            if(!hm.containsKey(currSum)){
                hm.put(currSum,i);
            }

            if(hm.containsKey(currSum)){
                int len = i-hm.get(currSum);

                maxSubArr = Math.max(maxSubArr,len);
            }

        }

        System.out.print(maxSubArr);

    }
}
