class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        boolean ans = false;
        int[] freqS1 = new int[26];
        for(int i=0; i<s1.length(); i++){
          char ch = s1.charAt(i);
          freqS1[ch-'a']++;  
        }
        int left = 0 , right = s1.length()-1;
        int[] freqS2 = new int[26];
        for(int i=left; i<=right; i++){
            char ch = s2.charAt(i);
            freqS2[ch-'a']++;
        }
        while(true){
            boolean equals = true;
            for(int i = left; i<=right; i++){
                char ch = s2.charAt(i);
                if(freqS1[ch-'a']!=freqS2[ch-'a']){
                    equals = false;
                    break;
                }
            }
            if(equals){
                ans = true;
                return ans;
            }
            if(right==s2.length()-1){
                break;
            }
            freqS2[s2.charAt(left)-'a']--;
            left++;
            right++;
            freqS2[s2.charAt(right)-'a']++;
        }
        return ans;
    }
}