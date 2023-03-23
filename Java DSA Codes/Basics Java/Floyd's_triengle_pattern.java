import java.util.*;
public class Floyds_triengle_pattern {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        // outer loop
        int cnt=1;
        for(int i=1; i<=n; i++){
            /// inner loop
            for(int j=1; j<=i; j++){
                System.out.print(cnt++ +" ");
            }
            System.out.println();
        }

    
    
    }
}
