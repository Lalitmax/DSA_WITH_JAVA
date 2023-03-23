public class Continue_statement {
    public static void main(String args[]) {

        // print 1 to 10 number skip 3
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
