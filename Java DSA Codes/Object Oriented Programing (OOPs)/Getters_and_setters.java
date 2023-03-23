/*
  Get --> return the value
  Set --> to modify the value

  this --> this keyword is used to refer to the current object
 */
public class Getters_and_setters {
    public static void main(String args[]){
    
        Pen pen = new Pen();
        //Pen p1 = new Pen();
        pen.setColor("yello");
        System.out.println(pen.getColor());

        pen.setTip(78);
        System.out.println(pen.getTip());

    
    
    }
   }

class Pen{
   private String color;
   private int tip;

    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){  
        this.tip = tip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}
