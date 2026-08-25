class Solution {
    public boolean isPalindrome(String s) {
       String temp = s.toLowerCase();
       List<Character> charList = new ArrayList<>();
       for(int i=0; i<temp.length(); i++){
        if (!Character.isLetterOrDigit(temp.charAt(i))) {
    continue;
      }
        charList.add(temp.charAt(i));
       }
       StringBuilder front = new StringBuilder();
       for(int i=0; i<charList.size(); i++){
        front.append(charList.get(i));
       }
       StringBuilder end = new StringBuilder();
       for(int i= charList.size()-1; i>=0; i--){
        end.append(charList.get(i));
       }
       if(end.toString().equals(front.toString())){
        return true;
       }
       return false;
    }
}