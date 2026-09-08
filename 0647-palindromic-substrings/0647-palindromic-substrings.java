class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int l = i , r=i , l1=i, r1=i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    count++;
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            while(l1>=0 && r1<s.length()){
                if(s.charAt(l1)==s.charAt(r1)){
                    count++;
                    l1--;
                    r1++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}