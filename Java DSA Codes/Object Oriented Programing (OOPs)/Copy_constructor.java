// import javax.swing.text.MaskFormatter;

// import org.jcp.xml.dsig.internal.MacOutputStream;

// copy constructor
public class Copy_constructor {
    public static void main(String args[]) {
        Student st1 = new Student();
        st1.name = "lalit max";
        st1.age = 20;
        st1.fname = "ram sewak yadav";
        // array pass in referecnce
        st1.marks[0] = 100;
        st1.marks[1] = 98;
        st1.marks[2] = 88;

        Student st2 = new Student(st1); // copy constructor
        st1.marks[2] = 555;
        // kyuki marks ka reference aata ha isiliye dono jagah ak hi ko point karta hai

        for (int i = 0; i < 3; i++) {
            System.out.println(st2.marks[i]);
        }

    }
}

class Student {
    String name;
    int age;
    String fname;
    int marks[] = new int[3];

    Student(Student st1) { // copy constructor

        this.name = st1.name;
        this.fname = st1.fname;
        this.age = st1.age;
        this.marks = st1.marks;

    }

    Student() {
        // System.out.println("nekk");
    }
}