public class Print_sum_of_n_natural_num_using_recursion {

    public static int printSumOfNNatural(int n){
        // base case
        if(n==1){
            return 1;
        }

        int fnm1 = printSumOfNNatural(n-1);

        int sum = n + fnm1;
        return sum;
    }
    public static void main(String args[]){
    
        System.out.println(printSumOfNNatural(5));
    
    
    }
}
