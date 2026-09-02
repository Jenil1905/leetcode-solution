class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] freqP = new int[26];
        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            freqP[ch-'a']++;
        }
        int[] freqS = new int[26];
        int left = 0;
        int right = p.length()-1;
        for(int i=left; i<=right; i++){
            char ch = s.charAt(i);
            freqS[ch-'a']++;
        }
        while(true){
            boolean equal = true;
            for(int i=0; i<26; i++){
                if(freqP[i] != freqS[i]){
                    equal = false;
                    break;
                }
            }
            if(equal){
                ans.add(left);
            }
            if(right==s.length()-1){
                break;
            }
            freqS[s.charAt(left)-'a']--;
            left++;
            right++;
            freqS[s.charAt(right)-'a']++;
        }
        return ans;
    }
}