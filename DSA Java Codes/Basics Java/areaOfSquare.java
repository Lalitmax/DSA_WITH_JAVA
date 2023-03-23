import java.util.Scanner;

public class areaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        float side=sc.nextFloat();
        float ans = side*side;
        System.out.println("The area of square is : "+ans);
    }
}
