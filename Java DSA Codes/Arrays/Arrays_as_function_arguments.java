public class Arrays_as_function_arguments {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 90, 88, 99 };
        update(marks); // array always pass by reference but any integer number can't pass by
                       // reference. its rule
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
