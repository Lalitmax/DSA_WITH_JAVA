public class merge_sort_an_array_of_strings {
    public static void mergeSort(String arr[], int si, int ei) {

        // ibase case
        if (si >= ei) {
            return;
        }
        // work
        int mid = si + (ei - si) / 2;
        // left part
        mergeSort(arr, si, mid);
        // right part
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        
        // sort left part and right part
        while (i <= mid && j <= ei) {
            if (isSmaller(arr[i],arr[j])) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // bacha hua left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // bacha hua right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static boolean isSmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]) {

        String arr[] = { "sun", "earth", "mars", "murcury" };
        mergeSort(arr ,0,arr.length-1);

        // System.out.println(arr[0].charAt(1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
