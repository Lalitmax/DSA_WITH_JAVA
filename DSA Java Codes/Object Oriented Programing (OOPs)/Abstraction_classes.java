public class Abstraction_classes {
    public static void main(String args[]) {

        // Horse h = new Horse();
        chicken c = new chicken();
        // c.eat();
        // c.walk();

    }
}

abstract class Animal{

    Animal(){
        System.out.println("animal constructor called");

    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // only gives idea 
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");

    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Horse {

    chicken(){
        System.out.println("chicken constructor called");

    }
    void walk() {
        System.out.println("Walks on 2 legs");

    }
}