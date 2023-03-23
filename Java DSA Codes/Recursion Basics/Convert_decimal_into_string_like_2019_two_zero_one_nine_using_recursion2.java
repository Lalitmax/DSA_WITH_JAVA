
public class Convert_decimal_into_string_like_2019_two_zero_one_nine_using_recursion2 {
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigitsIntoString(int n){

        if(n==0){
            return;
        }
        int lastDigit=n%10;

        n=n/10;
        printDigitsIntoString(n);
        System.out.print(digits[lastDigit]+" ");
       
        
    }

    public static void main(String args[]){
    
        printDigitsIntoString(1947);
    
    
    }
}
