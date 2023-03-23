/*
 Encapsulation --> Encapsulation is defined as the wrapping up of data & methods under a
 single unit. it also implements data hiding.
 */

public class Encapsulation {
    public static void main(String args[]) {
        // creat object
        Profile pr = new Profile();
        pr.setUsername("lalitmax");
        pr.setCity("samastipur");
        pr.setState("Bihar");
        pr.setAge(20);

    }
}

class Profile {
    private String username;
    protected String city;
    public String state;
    private int age;

    void setUsername(String username){
        this.username = username;
    }

    void setCity(String city){
        this.city = city;
    }

    void setState(String state){
        this.state = state;
    }

    void setAge(int age){
        this.age = age;
    }



}