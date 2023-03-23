public class Super_keyword {
    public static void main(String args[]){
    Horse h = new Horse();
    System.out.println(h.color);
        
    
    
    }
}

class Animal{
    String color; // to use Animal ka color
    Animal(){
        System.out.println("Animal contructor called");
    }

}

class Horse extends Animal{

    Horse(){
        super.color="brown";
        System.out.println("Horse contructor called");
    }
}