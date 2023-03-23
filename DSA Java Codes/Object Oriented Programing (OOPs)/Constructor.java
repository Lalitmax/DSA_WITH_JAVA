/*
 Constructor --> Constructor is a special method which is
  invoked automatically at the time of object creation

  -Constructors have the same name as class or structur.
  -Constructors don't have a return type.(Not even void)
  -Constrcutors are only called once, at object creation.
  -Memory allocation happens when constructor is called.
 */

public class Constructor {
    public static void main(String args[]) {
        Student st = new Student("Lalit");
        System.out.println(st.name);
    }
}

class Student{
    String name;
    int roll;
    Student(String name){
        // this.name = name;
        System.out.println("Constructor is called");
    }
}