public class Insert_in_a_trie {
    static class Node{
        Node[] children = new Node[26];
        boolean endOfWord = false;
        public Node(){
            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }

    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int  idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]  = new Node();

            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;

    }
    public static void main(String er[]){
       String words[]  = {"the","a","there", "their", "any","thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
