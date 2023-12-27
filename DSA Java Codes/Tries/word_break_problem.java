public class word_break_problem {
    public static class TrieNode {
        TrieNode children[] = new TrieNode[26];
        boolean eow = false;

        public TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static TrieNode root = new TrieNode();

    public static void insert(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow==true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0) return true;

        for(int i=1; i<=key.length(); i++){

            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }

        }

        return false;
    }

    public static void main(String args[]) {

        String words[] = {"i","like","samsung","there","their"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        String key = "ilikesamsun";
        System.out.print(wordBreak(key));

    }
}
