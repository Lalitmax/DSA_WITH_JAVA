/*
   Shallow --> reference (change reflect)
   Deep --> new marks create (change not reflect)
 */

public class Shallo_and_deep_copy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "lalit";
        s1.marks[0] = 99;
        s1.marks[1] = 88;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s1.marks[1] = 5432;
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int age;
    int marks[] = new int[3];

    // deep copy constructor (Not reflect both array)
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
        // this.marks=s1.marks;
        for(int i=0; i<marks.length; i++){
            this.marks[i] =s1.marks[i]; 
        }
    }

        // shallo copy constructor (reflect both array)
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    Student(){
        System.out.println("helllooooooooooooo");
    }
}