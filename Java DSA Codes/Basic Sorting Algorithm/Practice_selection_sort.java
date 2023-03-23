public class Practice_selection_sort {

    public static void sSort(int arr[]) {
        // selection sort
        for (int i = 0; i < arr.length; i++) {
            int minnipos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minnipos] > arr[j]) {
                    minnipos = j;
                }
            }
            // assign minimum value i position
            int temp = arr[i];
            arr[i] = arr[minnipos];
            arr[minnipos] = temp;
        }
        // swap
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 6, 3, 4, 2, 8, 1 };
        sSort(arr);

    }
}
