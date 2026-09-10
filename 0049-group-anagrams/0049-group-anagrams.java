class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String word: strs){
            int[] freq = new int[26];
            for(char ch: word.toCharArray()){
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);
            if(map.containsKey(key)){
                List<String> temp = map.get(key);
                temp.add(word);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(key,temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}