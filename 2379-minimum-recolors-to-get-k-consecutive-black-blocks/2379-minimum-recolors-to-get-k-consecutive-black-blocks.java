class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i) == 'W')
                count++;
        }
        int min = count;
        for(int i=0;i<blocks.length()-k;i++)
        {
            if(blocks.charAt(i) == 'W')
                count--;
            if(blocks.charAt(k+i) == 'W')
                count++;
            min = Math.min(min, count);
        }
        return min;
    }
}