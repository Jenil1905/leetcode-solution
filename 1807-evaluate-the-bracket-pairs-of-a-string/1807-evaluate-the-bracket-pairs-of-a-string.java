class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        HashMap<String , String> map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='('){
                int k = i+1;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(k)!=')'){
                    sb.append(s.charAt(k));
                    k++;
                }
                boolean found = false;
               if(map.containsKey(sb.toString())){
                ans.append(map.get(sb.toString()));
                found = true;
               }
                if(found==false){
                    ans.append('?');
                }
                i=k+1;
            }else{
               ans.append(ch);
               i++;
            }
        }
        return ans.toString();
    }
}