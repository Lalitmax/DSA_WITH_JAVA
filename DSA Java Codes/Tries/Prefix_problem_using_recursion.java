
public class Prefix_problem_using_recursion {
    public static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean eow = false;
        int freq = 0;

        public TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static TrieNode root = new TrieNode();

    public static void insert(String str) {
        TrieNode curr = root;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
            curr.freq++;
        }
        curr.eow = true;
    }


    public static void findPrefix(TrieNode root, String ans){

        if(root==null) return;

        if(root.freq==1){
            System.out.print(ans+", ");
            return;
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String srgs[]) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        TrieNode node = root;
        findPrefix(root,"");


    }
}
