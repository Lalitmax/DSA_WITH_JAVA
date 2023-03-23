public class Counting_sort {
    public static void countingSort(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        // to find max value
        for (int i = 0; i < arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }

        // counting num
        int countngNum[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            countngNum[arr[i]]++;
        }

        // sorting method
        int j = 0;
        for (int i = 0; i < countngNum.length; i++) {
            while (countngNum[i] > 0) {
                arr[j] = i;
                j++;
                countngNum[i]--;
            }
        }

    }

    public static void printArray(int arr[]) {
        // printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int[] arr = {5,4,1,3,2};
        countingSort(arr);
        printArray(arr);

    }
}
