class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength = Integer.MIN_VALUE;
        while(right<s.length()){
            char ch = s.charAt(right);
            freq[ch-'A']++;
            if(freq[ch-'A']>maxFreq) maxFreq = freq[ch-'A'];
            int windowLength = right-left+1;
                while(left<s.length() && windowLength-maxFreq>k){
                    char c = s.charAt(left);
                    freq[c-'A']--;
                    left++;
                    windowLength = right-left+1;
                }
            
            int length = right-left+1;
            if(length>maxLength) maxLength = length;
            right++;
        }
        return maxLength;
    }
}