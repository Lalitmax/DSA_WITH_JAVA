public class Recursion_practice {
    public static void five(int n) {
        if (n == 0)
            return;
        System.out.print("Lalit ");
        five(n - 1);
    }

    public static void revArr(int arr[], int l, int r) {
        if (l > r)
            return;

        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
        revArr(arr, l + 1, r - 1);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        boolean rightPart = isSorted(arr, i + 1);

        return rightPart;
    }

    public static int xToThePowerN(int x, int n) {
        if (n == 0)
            return 1;

        int faith = xToThePowerN(x, n - 1);

        int xpn = x * faith;

        return xpn;
    }

    public static int xToThePowerNOptimized(int x, int n) {
        if (n == 0)
            return 1;

        int xtpSq = xToThePowerNOptimized(x, n / 2);
        int xtpMul = xtpSq * xtpSq;

        if (n % 2 != 0) {
            xtpMul = x * xtpMul;

        }

        return xtpMul;
    }

    public static int tilingProblem(int n) {
        if (n == 1 || n == 0)
            return n;

        int verticaly = tilingProblem(n - 1);
        int horizontaly = tilingProblem(n - 2);

        return verticaly + horizontaly;
    }

 

    public static void removeDuplicate(String str, int i, StringBuilder sb, boolean vis[]) {
        if(str.length()==i){
            System.out.println(sb.toString());
            return;
        }

        if(vis[str.charAt(i)-'a']){
            removeDuplicate(str, i+1, sb, vis);
        }else{
            vis[str.charAt(i)-'a']=true;
            sb.append(str.charAt(i));
            removeDuplicate(str, i+1, sb, vis);

        }


    }

    public static void main(String[] args) {

        // int arr[] = {5,4,3,2,1};
        // // revArr(arr,0,3);

        // // for(int num : arr){
        // // System.out.println(num+" ");
        // // }

        // System.out.println(isSorted(arr, 0));

        // System.out.println(xToThePowerN(2, 4));
        // System.out.println(xToThePowerNOptimized(2, 5));
        removeDuplicate("abcdcbaef", 0, new StringBuilder(""), new boolean[26]);

    }

}
