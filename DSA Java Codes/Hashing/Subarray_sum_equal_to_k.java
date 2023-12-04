import java.util.*;

public class Subarray_sum_equal_to_k {
    public static void main(String args[]){

        int  arr[] = {1,2,3};
        int k=3;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if(hm.containsKey(sum-k)){
                cnt +=hm.get(sum-k);
                 
            } 
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            

        }
        System.out.println(cnt);
         

    }}
