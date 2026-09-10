class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq_order = new int[26];
        int[] freq_s = new int[26];
        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);
            freq_order[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq_s[ch-'a']++;
        }
        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);
            if(freq_s[ch-'a']>0){
                while(freq_s[ch-'a']>0){
                    sb.append(ch);
                    freq_s[ch-'a']--;
                }
            }
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq_s[ch-'a']!=0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}