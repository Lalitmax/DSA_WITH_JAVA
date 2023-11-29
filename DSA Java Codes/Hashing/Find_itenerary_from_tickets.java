import java.util.*;
public class Find_itenerary_from_tickets {
    public static String findStart(HashMap<String,String> tickets){
        HashMap<String,String> revTickets = new HashMap<>();

        for(String key:tickets.keySet()){
            revTickets.put(tickets.get(key),key);
        }

        for(String key : tickets.keySet()){
            if(!revTickets.containsKey(key)){
                return key; // start
            }
        }

        return null;
    }
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = findStart(tickets);
        System.out.print(start);

        for(String key : tickets.keySet()){
            System.out.print("-> "+tickets.get(start));
            start = tickets.get(start);
        }


    }
}
