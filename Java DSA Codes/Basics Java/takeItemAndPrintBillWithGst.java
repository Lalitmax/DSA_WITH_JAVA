import java.util.Scanner;

public class takeItemAndPrintBillWithGst {
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter cost of a pencil : ");
        float pencil=sc.nextFloat();

        System.out.print("Enter cost of pen : ");
        float pen=sc.nextFloat();

        System.out.print("Enter cost of eraser : ");
        float eraser=sc.nextFloat();
        float sum=(pencil+pen+eraser);

        float gst=(sum*18)/100;

        // calculate GST
        float bill= (sum)+gst;

        System.out.println("sum = "+pencil+"+"+pen+"+"+eraser+" = "+sum);
        System.out.println("GSt = "+gst);
        System.out.println("Total bill = "+bill);



    }
}
