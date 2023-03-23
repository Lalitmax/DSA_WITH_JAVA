public class Last_occurrance_find_using_recursion {

    public static int lastOccurrence(int arr[],int i,int key){

        if(i==arr.length-1){
            return -1;
        }
        // right last index
        int Rlastindex=lastOccurrence(arr,i+1,key);

        if(Rlastindex==-1){
            // check it self
            if(arr[i]==key){
                return i;
            }else{
                return -1;
            }
        }else{
            return Rlastindex;
        }
    }
    public static void main(String args[]){
    
        int arr[] = {2,3,6,9,3,5};
        int key = 3;
        System.out.println(lastOccurrence(arr,0,key));
    
    
    }
}
