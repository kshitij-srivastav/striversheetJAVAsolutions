class Solution {
    public String removeDuplicates(String S) {
        // code here
        char[] stack= new char[S.length()];
        int n=S.length();
        int i =0;
        for(int j =0;j<n;j++){
            char curr_char=S.charAt(j);
            if(i>0&& stack[i-1]==curr_char){
                i--;
            }
            else{
                stack[i]=curr_char;
                i++;
            }
        }
        return new String(stack, 0, i);
    }
}