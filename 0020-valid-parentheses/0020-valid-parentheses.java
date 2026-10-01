class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(validPair(stack.peek(), ch)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public boolean validPair(char a , char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
}