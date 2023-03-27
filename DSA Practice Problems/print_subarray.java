

//User function Template for Java
import java.io.*;
import java.util.*;
class print_subarray {
     public static  int print2largest(int arr[], int n) {
        // code here
        
        int secLargest=0;
        Arrays.sort(arr);
        n = n-1;
        boolean check= false;
        while(n>0){
            if(arr[n]!=arr[n-1]){
                check = true;
                secLargest = arr[n-1];
                break;
            }
             n--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        
        if(check){
            return secLargest;
        }else{
            return -1;
        }

        
    }

    public static void main(String args[]){
        int arr[]  = {12, 35, 1, 10, 34, 1};
        int d = print2largest(arr,arr.length);
        System.out.println(d);

    }
}