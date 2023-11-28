import java.util.LinkedList;
import java.util.ArrayList;
public class HashMap_implementation {
    static class HashMap<K,V>{  // generic
        private class Node{

            V value;
            K key;
    
            public  Node(K key, V value ){

                this.value = value;
                this.key = key;
            }
        }

        private int n;  //n  total no of nodes
        private int N; // size of array List
        private LinkedList<Node> buckets[]; // N= buckets.length
        @SuppressWarnings("unchecked")

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];   
            for(int i=0; i<4; i++){
                buckets[i] = new LinkedList<>();
            }

            
        }

        public int hashFunction(K key){

            int hc = key.hashCode(); // may gives -> 1234567 or -1234567 
            // So That make (0 to 3)
            return Math.abs(hc)% N;

        }
        public int searchinLL(K key, int bi){
            LinkedList<Node>  ll = buckets[bi];
            int di=0; // --> data index
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }

            return -1;
        }
         @SuppressWarnings("unchecked")
        public void reHash(){
            LinkedList<Node> oldBuck[] = buckets;

            buckets = new LinkedList[N*2];
            N = N*2;
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];

                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){ // O(lamda) - > O(1)
            int bi = hashFunction(key); // bi -> bucket index
            int di = searchinLL(key,bi);  // di -> data index || if found give index otherwise -1
            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lamda= (double)n/N;

            if(lamda>2.0){
                reHash();
            }
        }

        public boolean containsKey(K key){  // O(1)
            int bi = hashFunction(key); // bi -> bucket index
            int di = searchinLL(key,bi); // di -> data index || if found give index otherwise -1

            if(di!=-1){
                return true;

            }else{
                return false;
            }

        }
        public V remove(K key){ // O(1)
             int bi = hashFunction(key); // bi -> bucket index
            int di = searchinLL(key,bi);  // di -> data index || if found give index otherwise -1
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }

        }

        public V get(K key){ // O(1)
            int bi = hashFunction(key); // bi -> bucket index
            int di = searchinLL(key,bi);  // di -> data index || if found give index otherwise -1
            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }

        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++ ){
                LinkedList<Node> ll =buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 140);
        hm.put("china", 138);
        hm.put("US", 100);
        
        ArrayList<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println(hm.get(k));
        }
        System.out.println(hm.containsKey("India") );
    }
}
