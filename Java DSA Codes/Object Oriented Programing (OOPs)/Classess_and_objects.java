/*
  Class --> class is a collection of object and does,t take any space 
  memory,class is also called as blueprint/ logical entity

  Object --> object is an instance of class that  executes the class. 
  once the object is created , it takes up space like other variable in 
  memory
 */

public class Classess_and_objects {
    public static void main(String args[]) {

        Pen p1 = new Pen(); // created pen object called p1
        p1.setColor("yello");
        System.out.println(p1.color);

        p1.setTip(45);
        System.out.println(p1.tip);
        // p1.setColor("Blue");
        p1.color = "green";
        System.out.println(p1.color);

    }
}

// class 1
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// class 2
class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}