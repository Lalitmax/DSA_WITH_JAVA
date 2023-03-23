/*
 Single level inheritance
 */

public class Single_level_inheritance {
    public static void main(String args[]) {

        Dogs dg = new Dogs();
        dg.color();
        dg.name();
        dg.legs();
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

// derived class
class Dogs extends Animal {
    String name;

    void name() {
        System.out.println("Baby");
    }
}