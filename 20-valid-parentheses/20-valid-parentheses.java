class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                stack.push(ch);
                continue;
            }
            else if(!stack.isEmpty()){
                char sc=stack.peek();
                if((sc=='('&&ch==')')||(sc=='{'&&ch=='}')||(sc=='['&&ch==']')){
                    stack.pop();
                    continue;
                }
            }
            return false;
        }
        return stack.empty();
    }
}