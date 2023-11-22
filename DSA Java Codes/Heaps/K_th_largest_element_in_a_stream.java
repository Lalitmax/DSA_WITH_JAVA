import java.util.*;
public class K_th_largest_element_in_a_stream {
 

    static PriorityQueue<Integer> pq;
    static int k;

    public static ArrayList<Integer> getAllKthNumber(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int val : arr){

            if(pq.size()<k){
                pq.add(val);
            }else{

                if(val>pq.peek()){
                    pq.poll();
                    pq.add(val);
                }
            }

            if(pq.size()>=k){
                ans.add(pq.peek());
            }else{
                ans.add(-1);
            }

        }

        return ans;



    }
    public static void main(String arg[]){
        int stream[] = {10,20,11,70,50,40,100,5};
        k=3;
        pq = new PriorityQueue<>();

        ArrayList<Integer> ans = getAllKthNumber(stream);

        for(int val :ans){
            System.out.print(val+" ");
        }
        
         
        
    }
        

}
