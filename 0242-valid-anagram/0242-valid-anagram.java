class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqS[ch-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqT[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freqS[i]!=freqT[i]){
                return false;
            }
        }
        return true;
    }
}