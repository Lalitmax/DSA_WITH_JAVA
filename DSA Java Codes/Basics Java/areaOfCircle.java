import java.util.Scanner;

public class areaOfCircle {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        float rad = sc.nextFloat();
        float area=3.14f * rad * rad;
        System.out.println(area);
    }
}
