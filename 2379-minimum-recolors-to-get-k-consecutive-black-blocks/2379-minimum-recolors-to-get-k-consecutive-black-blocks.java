class Solution {
    public int minimumRecolors(String blocks, int k) {
        int max=0;
        int n=0;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i)=='B'){ n++; }
        }
        max=Math.max(n,max);
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i)=='B'){ n++; }
            if(blocks.charAt(i-k)=='B'){ n--; }
            max=Math.max(n,max);
        }
        return k-max;
    }
}