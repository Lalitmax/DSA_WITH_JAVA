import java.util.*;
public class Minimum_operation_to_halve_array_sum {

    public static int halveSum(int arr[]){

        int cnt=0;
        double sum = 0;
         PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            pq.add((double)arr[i]);
        }

        double target = sum/2;
       

        while(sum>target){
            cnt++;
            double maxEle  = pq.poll();
            double halfValue = (maxEle)/2;
            sum -= halfValue;
            pq.add(halfValue);
        }

    


        return cnt;
    }
    public static void  main(String arg[]){
        int arr[] = {1,5,8,19};
        System.out.println(halveSum(arr));

    }
}
