import java.util.*;
public class Print_inverted_rotated_half_pyramid_pattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
