public class Reverse_array {
    public static void reverArray(int arr[]) {

        int length = arr.length;

        // for (int i = 0; i < length/2; i++) {
        //     int temp = arr[i];
        //     arr[i]=arr[length-1-i];
        //     arr[length-1-i]=temp;

        // }

        int start,end;
        start=0;
        end=length-1;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
            // start++;
            // end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60 ,70};

        reverArray(arr);
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }

}
