class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
                continue;
            }else if(!stack.empty()){
                char stackCurr = stack.peek();
                if((curr == ')' && stackCurr == '(') || (curr == '}' && stackCurr == '{') || (curr == ']' && stackCurr == '[')){
                    stack.pop();  
                    continue;
                }
            }
            return false;
        }
        return stack.empty();
    }
}