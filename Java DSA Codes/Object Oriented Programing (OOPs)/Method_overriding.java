/*
 Method overriding --> same function but different class
 */

public class Method_overriding {
    public static void main(String args[]) {
        Bear br = new Bear();
        br.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Eat enything");
    }
}

class Bear {
    void eat() {
        System.out.println("Eat grass");
    }
}
