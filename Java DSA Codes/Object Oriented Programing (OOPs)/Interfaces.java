public class Interfaces {
    public static void main(String args[]){
    
        Queen  q=new  Queen(); // object
        q.moves(); 
    
    
    }
}

interface ChessPlayer {
    void moves(); // made public (interface hamesha public banata hai)
}

class Queen implements ChessPlayer {

    public void moves() { // to hame yaha bhi public likhna parega
        System.out.println("Up,down,left,right,diagonal (in all 4 directions)");
    }

}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up,down,left,right");

    }
}