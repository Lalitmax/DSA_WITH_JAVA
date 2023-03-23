public class Find_the_all_accurrences_in_array_and_print_using_recursion {
    public static void printAllOccurrence_key(int arr[], int i,int key){
        // base case
        if(i==arr.length){
            return;
        }
        // work
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printAllOccurrence_key(arr,i+1,key);
    }
    public static void main(String args[]){
    
    int arr[] = {3,2,4,5,6,2,7,2,2};
    int key=2;
    printAllOccurrence_key(arr,0,key);
    
    }
}
