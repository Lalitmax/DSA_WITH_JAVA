public class Lenear_search {

    public static int lenearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 2, 3, 4, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = lenearSearch(marks, key);
        if (index == -1) {
            System.out.println("Key not present");
        } else {
            System.out.println("Key present at index " + index);
        }
    }
}
