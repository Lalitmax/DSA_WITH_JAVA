class Backtracking_on_arrays{

    public static void backtrackingOnArray(int arr[], int i, int num){
        // base case
        if(i==arr.length){
            return;
        }
        arr[i]=num;
        // recursive call
        backtrackingOnArray(arr,i+1,num+1);
        arr[i]=num-2; // backtracking step

    }
    public static void main(String args[]){
        System.out.println("Hellow World");
        int arr[] = new int[5];
        int num=1;
        backtrackingOnArray(arr,0,num);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}