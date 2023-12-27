public class Search_in_a_trie {
    static class Node{
        Node[] children = new Node[26];
        boolean eow=false;
        public Node(){

            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }

    public static Node root= new Node();

    public static void insert(String str){
        Node currNode= root;

        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i)-'a';
            if(currNode.children[idx]==null){
                currNode.children[idx] = new Node();
            }
            currNode = currNode.children[idx];
        }

        currNode.eow=true;
    }

    public static boolean search(String str){

        Node curr = root;
        for(int i=0; i<str.length(); i++){
             int idx = str.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr =curr.children[idx];
        }



        return curr.eow==true;

    }

    public static void main(String srgs[]){
        String words[] = {"the","a","any","there","their"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.print(search("an"));
    }
}
