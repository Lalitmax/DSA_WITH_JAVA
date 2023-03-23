public class Find_length_of_string_using_recursion {

    public static int findLength(String str2) {

        if (str2.length() == 0) {
            return 0;
        }

        // int cnt = 1;
        // cnt += findLength(str2.substring(1));
        // return cnt;

        return findLength(str2.substring(1))+1;

    }

    public static void main(String args[]) {

        String str = "lalitkumar";
        System.out.println(findLength(str));

    }
}
