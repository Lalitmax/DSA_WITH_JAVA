public class Reverse_string_using_recursion_2_ {

    public static void reverseStr(String str, int indx) {
        // base case
        if (indx == 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        // again call
        reverseStr(str, indx - 1);
    }

    public static void main(String args[]) {

        String str = "abcd";
        reverseStr(str, str.length() - 1);

    }
}
