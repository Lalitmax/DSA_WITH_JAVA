public class Move_all_x_to_the_end_of_the_string_using_recursion {

    public static void moveX(String str, int cnt, int i, StringBuilder sb) {

        // base case
        if (i == str.length()) {
            for (int j = 1; j <= cnt; j++) {
                sb.append('x');
            }
            System.out.println(sb);
            return;
        }

        // work
        if (str.charAt(i) == 'x') {
            cnt++;
        } else {
            sb.append(str.charAt(i));
        }
        moveX(str, cnt, i + 1, sb);
    }

    //    Time Coplexity 
    //     O(n)

    public static void main(String args[]) {

        String str = "axbcxxmdnjfxxjxnjdxfjd";
        moveX(str, 0, 0, new StringBuilder(""));

    }
}
