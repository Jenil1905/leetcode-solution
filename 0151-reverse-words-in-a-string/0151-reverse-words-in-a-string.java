class Solution {
    public String reverseWords(String s) {
        String clearedString = s.strip().replaceAll("\\s+", " ");
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int i = clearedString.length()-1;
        while(i>=0 ){
            if(clearedString.charAt(i)!=' '){
                sb.append(clearedString.charAt(i));
            }else{
                ans.append(sb.reverse());
                ans.append(' ');
                sb.setLength(0);
            }
            if(i==0){
                ans.append(sb.reverse());
            }
            i--;
        }
       return ans.toString();
    }
}