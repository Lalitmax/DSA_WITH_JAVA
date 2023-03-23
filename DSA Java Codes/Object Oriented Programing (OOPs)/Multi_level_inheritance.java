/*
  Base class
    |
    |
  Derived class
    |
    |
  Derived class
  
 */
public class Multi_level_inheritance {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.color();
        dobby.hello(); 

        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// base class
class Animal {
    String skinColor;
    int fins;
    int legs;

    void color() {
        System.out.println("White");

    }

    void fins() {
        System.out.println("No");
    }

    void legs() {
        System.out.println(4);
    }
}

// base class
class Mammals extends Animal {
    int legs;

    void hello() {
        System.out.println("Hello Baby");
    }

}

class Dog extends Mammals {
    String breed;
}
