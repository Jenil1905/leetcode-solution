class Solution {
    public String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        for(int i=0; i<s.length(); i++){
            int l = i;
            int r = i;
            int l1= i;
            int r1 = i+1;
            int oddLen = expand(s,l,r);
            int evenLen = expand(s,l1,r1);
            int currMax = Math.max(oddLen, evenLen);
            if(currMax>maxLength){
                maxLength = currMax;
                if(currMax==oddLen){
                    start = i-(oddLen/2);
                }else{
                    start = i-((evenLen-1)/2);
                }
            }
        }
        return s.substring(start, start+maxLength);
    }
    private int expand(String s , int l , int r){
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }else{
                break;
            }
        }
        return r-l-1;
    }
}