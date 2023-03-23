public class Multiple_inheritance_using_interfaces {
    public static void main(String args[]){
    
        
    Bear b = new Bear(); // object
    b.eatMeat();
    b.eatGrass();
    
    }
}

interface Harbivore {
    void eatGrass();
}

interface carnivore{
    void eatMeat();
}

class Bear implements Harbivore,carnivore{ // bear inherit both interface harbivore and carnivore

    public void eatGrass(){
        System.out.println("Eat  gass");

    }

    public void eatMeat(){
        System.out.println("Eat meat");

    }
}