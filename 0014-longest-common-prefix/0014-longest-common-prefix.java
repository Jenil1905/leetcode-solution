class Solution {

    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    TrieNode root = new TrieNode();

    public String longestCommonPrefix(String[] strs) {

        for(String word: strs){
            insert(word);
        }
        StringBuilder ans = new StringBuilder();
        TrieNode current = root;
        while(!current.isEnd){
            int childCount = 0;
            int childIdx = -1;
            for(int i=0; i<26; i++){
                if(current.children[i]!=null){
                    childCount++;
                    childIdx = i;
                }
            }
            if(childCount!=1){
                break;
            }
            ans.append((char)('a'+childIdx));
            current = current.children[childIdx];
        }
        return ans.toString();
    }
    private void insert(String word){
        TrieNode current = root;
        for(char ch: word.toCharArray()){
            int idx = ch-'a';
            if(current.children[idx]==null){
                current.children[idx]=new TrieNode();
            }
            current = current.children[idx];
        }
        current.isEnd = true;
    }
}