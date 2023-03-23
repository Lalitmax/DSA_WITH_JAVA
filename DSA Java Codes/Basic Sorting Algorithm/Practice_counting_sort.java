public class Practice_counting_sort {
    public static void cSort(int arr[]) {

        // find max value
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }

        // // count frequency
        int countFrequency[] = new int[maxNum + 1];
        for (int i = 0; i < arr.length; i++) {
            countFrequency[arr[i]]++;
        }

        // srting method
        int j = 0;
        for (int i = 0; i < countFrequency.length; i++) {
            while (countFrequency[i] > 0) {
                arr[j] = i;
                j++;
                countFrequency[i]--;
            }
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 4, 2, 8, 1 };
        cSort(arr);

    }
}
