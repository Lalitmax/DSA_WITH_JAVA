public class Math_inbuilt_function {
    public static void main(String args[]) {

        int a = 3;
        int b = 6;
        int ans = Math.min(a, b);
        System.out.println("min="+ans);

        ans=Math.max(a,b);
        System.out.println("max="+ans);

        double x = 36;
        double ans2 = Math.sqrt(x);
        System.out.println("sqrt="+ans);

        ans2=Math.pow(2,3);
        System.out.println("2^3="+ans2);

        ans2=Math.abs(-7);
        System.out.println("Abs="+ans2);
        ans2=Math.abs(-7.8);
        System.out.println("Abs="+ans2);


    }
}
