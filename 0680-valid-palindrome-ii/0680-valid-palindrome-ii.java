class Solution {
    public boolean validPalindrome(String s) {
        int left = 0 , right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                boolean r1 = isPalindrome(s,left+1,right);
                boolean r2 = isPalindrome(s, left , right-1);
                if(r1||r2){
                    return true;
                }else{
                    return false;
                }
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean isPalindrome(String s , int left , int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}