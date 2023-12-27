public class Prefix_problem {
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

    public static void search(String str) {
        TrieNode curr = root;

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            sb.append(str.charAt(i));
            if (curr.children[idx].freq == 1) {
                System.out.print(sb+" ");
                break;
            }  

           
            
            curr = curr.children[idx];
        }

    }

    public static void main(String srgs[]) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
         for (int i = 0; i < words.length; i++) {
            search(words[i]);
        }
         
         
    }
}
