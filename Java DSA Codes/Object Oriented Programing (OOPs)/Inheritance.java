/* 
  Inheritance --> Inheritance is when properties & methods of base class are passed on to a derived class.

  Types of class

  1. base class
  2. derived class
  
*/

public class Inheritance {
    public static void main(String args[]) {

        Fish tuna = new Fish();
        tuna.eat();
        tuna.swim();

    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}