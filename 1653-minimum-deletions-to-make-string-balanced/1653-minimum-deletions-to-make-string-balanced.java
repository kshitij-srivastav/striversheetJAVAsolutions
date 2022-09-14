class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int countA = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch == 'a'){
                countA++;
            }
        }
        int countB = 0;
        int ans = countA;
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch == 'a'){
                countA--;
            } else{
                countB++;
            }
            int count = countA + countB;
            ans = Math.min(ans, count);
        }
        return ans;
    }
}