public class Static_keyword {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.schoolName = "Sk_college_thatia";

        // System.out.println(s1.schoolName);

        Student s2 = new Student();
        // System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC"; // yaha par ham school name ko change kar diya to ab sabhi ke liye ABC hi show
                               // karega
        System.out.println(s2.schoolName);

    }
}

class Student {
    static int returnPrecentage(int math, int phy, int chem) { // ab isko sabhi use kar sakte hai or change kar sakte
                                                               // hai
        return (math + phy + chem) / 3;
    }

    String name;
    int rollno;

    static String schoolName;

    void setNmae(String name) {
        this.name = name;
    }

    String getNmae() {
        return this.name;
    }

}