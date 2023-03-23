/*
  Hierarchial inheritance ---> A inheritance which contaion only one super class 
  and multiple sub class and all sub class directly extends super class called hierarchial inheritance
 */
public class Hierarchial_inheritance {
    public static void main(String args[]) {

        Fish fs = new Fish();
        fs.name();

        Dog dg = new Dog();
        dg.name();
    }
}

class Animal {
    String name;

    void name() {
        System.err.println("Animal");
    }
}

class Dog extends Animal{

    void dog() {
        System.err.println("Dog");
    }
}

class Fish extends Animal{
    void fish(){
        System.err.println("Fish");
    }
}