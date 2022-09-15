class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int flipped=0;
        int i =0;
        int j =0;
        while(j<nums.length){
            if(nums[j]==0)
                flipped++;
            while(flipped>k){
                if(nums[i]==0){
                    flipped--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}