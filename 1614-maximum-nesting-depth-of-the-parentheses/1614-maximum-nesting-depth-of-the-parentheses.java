class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxLength = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            int size = stack.size();
            if(size>maxLength) maxLength = size;
            if(ch==')'){
                stack.pop();
            }
        }
        return maxLength;
    }
}