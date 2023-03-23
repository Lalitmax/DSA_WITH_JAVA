import java.util.*;

public class Print_table_of_n {
    public static void main(String args[]) {

        Scanner ss = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = ss.nextInt();
        
        //Print_table_of_n
        for(int i=1; i<=10; i++){
            System.out.print(n*i+" ");
        }

    }
}
