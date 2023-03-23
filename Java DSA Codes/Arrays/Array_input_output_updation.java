import java.util.*;

import javax.swing.text.MaskFormatter;

public class Array_input_output_updation {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math
        System.out.println("Your entered marks");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        marks[2] = 88; // updation
        System.out.println(marks[2]);

        System.out.println("Array of length = " + marks.length); // to get length of array

    }
}
