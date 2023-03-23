/*
 Types of constructor

  1. Non-[arameterised
  2. Parameterised
  3. Copy constructor
  
 */

public class Types_of_constructor {
    public static void main(String args[]) {

        Student st1 = new Student(); // Non-parameterised constructor
        Student st2 = new Student("lalit max"); // parameterised constructor
        Student st3 = new Student(1848); // parameterised constructor
        // Student st3 = new Student(1848,"lalit"); // error n

    }
}

class Student {
    String name;
    int roll;

    Student() {
        // System.out.println();
        System.out.println("Constructor st1 called");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Constructor st2 called");
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println("Constructor st3 called");
    }
}