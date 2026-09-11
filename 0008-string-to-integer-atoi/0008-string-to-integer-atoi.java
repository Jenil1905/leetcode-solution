class Solution {
    public int myAtoi(String s) {
        //step 1
        int pointer = 0;
        while(pointer<s.length() && s.charAt(pointer)==' '){
            pointer++;
        }
        //step 2
        boolean isNegative = false;
        if(pointer<s.length() && s.charAt(pointer)=='-'){
            isNegative = true;
            pointer++;
        }else if(pointer<s.length() && s.charAt(pointer)=='+'){
            pointer++;
        }
        //step 3
        int num = 0;
        while(pointer<s.length() && Character.isDigit(s.charAt(pointer))){
            int digit = s.charAt(pointer)-'0';
            if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && digit>7){
                if(isNegative){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
            num = num*10+digit;
            pointer++;
        }
        if(isNegative){
            return -num;
        }
        return num;
    }
}