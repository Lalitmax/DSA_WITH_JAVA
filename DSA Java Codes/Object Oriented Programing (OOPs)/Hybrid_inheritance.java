public class Hybrid_inheritance {
    public static void main(String args[]){
    
        Fish fs = new Fish();
        fs.name();

        Tune tn = new Tune();
        tn.fish();
        Peacock pk = new Peacock();
        pk.name();

        Dog dg = new Dog();
        dg.name();

    
    
    }
}


class Animal {
    String color;

    void name(){
        System.err.println("animal");
    }
}

class Fish extends Animal{
    int age;
    void fish(){
        System.err.println("Fish");
    }
}

class Tune  extends Fish{
    void tune(){
        System.out.println("Tune");
    }
}

class Shark extends Fish {
    void shark(){
        System.out.println("shark");
    }
}

class Bird extends Animal {
    void bird(){
        System.out.println("bird");
    }
}

class Peacock extends Bird {
    void peacock(){
        System.out.println("peacock");
    }
}

class Mammal extends Animal {
    void mammal (){
        System.out.println("mammal");
    }
}

class Dog extends Mammal{
    void dog(){
        System.out.println("dog");
    }
}

class Cat extends Mammal {
    void cat(){
        System.out.println("cat");


    }
}

class Human extends Mammal {
    void human(){
        System.out.println("Human");
    }
}