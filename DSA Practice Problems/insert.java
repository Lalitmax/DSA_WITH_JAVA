import java.util.*;
public class insert {   
    public static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last
            arr.add(data);
   
            int x = arr.size()-1; // child index
            int par = (x-1)/2; // parent index
   
            while(arr.get(x)>arr.get(par)){
               // swap
               int temp =arr.get(x);
               arr.set(x,arr.get(par));
               arr.set(par,temp);
               x=par;
               par = (x-1)/2;
            }
         }

        public void print(){
            System.out.print(arr);

        }
    }


    public static void main(String args[]){
        int arr[] = {6,2,3,8};

        Heap h = new Heap();

        for(int i=0; i<arr.length; i++){
            h.add(arr[i]);
        }

        h.print();


    }
}
