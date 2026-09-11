class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = map.get(s.charAt(s.length() - 1));
       int current = s.length()-2 , prev = s.length()-1;
       while(current>=0){
        if(map.get(s.charAt(current))>=map.get(s.charAt(prev))){
            ans+=map.get(s.charAt(current));
        }else {
            ans = ans-map.get(s.charAt(current));
        }
            current--;
            prev--;
       }
        return ans;
    }
}