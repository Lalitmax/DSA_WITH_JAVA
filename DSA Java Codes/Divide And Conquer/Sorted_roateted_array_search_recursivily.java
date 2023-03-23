import java.util.*;
public class Sorted_roateted_array_search_recursivily {

    public static int search(int arr[], int key, int si, int ei){
        // base case 
        if(si>ei){
            return -1;
        }

        // work
        int mid = si + (ei-si)/2;
        // case found
        if(arr[mid]==key){
            return mid;
        }

        // Mid on l1
        if( arr[si]<=arr[mid]){
            // case  a: left
            if(arr[si]<=key && arr[mid]>=key){
                return search(arr,key,si, mid-1);

            }else{
                // case b : right
                return search (arr,key, mid+1, ei);
            }
        }
        // Mid on l2
        else{
            // case c : right
            if( arr[mid] <=key && arr[ei]>=key){
                return search(arr,key, mid+1, ei);
            }else{
                // case d : left
                return search(arr,key,si,mid-1);
            }


        }

        


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        int arr[] = {4,5,6,7,0,1,2};
       int index =search(arr,key,0,arr.length-1);
       System.out.print("index : "+index);

    }
}
