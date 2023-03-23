public class Convert_letter_upper_case {
    public static String upperCase(String str) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        // also like
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        //         sb.append(Character.toUpperCase(str.charAt(i)));
        //     } else {
        //         sb.append(str.charAt(i));
        //     }
        // }

        return sb.toString();
    }

    public static void main(String args[]) {

        String str = "hi, i am lalit";
        System.out.println(upperCase(str));

    }
}
