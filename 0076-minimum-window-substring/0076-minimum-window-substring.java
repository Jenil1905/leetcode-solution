class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int[] freqT = new int[256];
        int minLength = Integer.MAX_VALUE;
        int startIdx = 0;
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqT[ch-0]++;
        }
        int left = 0;
        int right = t.length()-1;
        int[] freqS = new int[256];
        for(int i=left; i<=right; i++){
            char ch = s.charAt(i);
            freqS[ch-0]++;
        }
        while(right<s.length()){
            boolean equal = true;
            for(int i=0; i<256; i++){
                if(freqS[i]<freqT[i]){
                    equal = false;
                    break;
                }
            }
            if(equal){
                int length = right-left+1;
                if(length<minLength){
                    minLength = length;
                    startIdx = left;
                }
                freqS[s.charAt(left)-0]--;
                left++;
            }else{
                right++;
                if(right<s.length()){
                freqS[s.charAt(right)-0]++;
                }
            }
            
        }
        if(minLength == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(startIdx,startIdx+minLength);
    }
}