class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']==1){
                ans = i;
                return ans;
            }
        }
        return ans;
    }
}