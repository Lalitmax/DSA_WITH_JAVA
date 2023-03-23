public class First_occurrance_find_using_recursion {
    
    public static int firstOccurance(int arr[],int i, int key){

        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static void main(String args[]){
        
        int arr[] = {8,3,6,9,5,1,0,2,5,3};
        int key=5;
        System.out.println(firstOccurance(arr,0,key));

    
    
    }
}
