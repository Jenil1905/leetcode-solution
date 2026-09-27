class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            while(i<s.length() && ch!=')'){
                stack.push(ch);
                i++;
                if(i<s.length()){
                 ch = s.charAt(i);
                }
            }
            if(i<s.length() && ch==')'){
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty() && stack.peek()!='('){
                sb.append(stack.pop());
            }
            if(!stack.isEmpty() && stack.peek()=='('){
            stack.pop();
            }
            for(int j=0; j<sb.length(); j++){
                stack.push(sb.charAt(j));
            }
              i++;
           }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}