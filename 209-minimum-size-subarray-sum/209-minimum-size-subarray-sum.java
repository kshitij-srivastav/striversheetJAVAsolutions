class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int l =0,r=0,min=Integer.MAX_VALUE;int sum=0;
        while(r<nums.length){
            sum+=nums[r++];
            if(sum>=target){
                while(sum>=target)
                {
                    sum-=nums[l++];
                }
                min=Math.min(min,r-l+1);
            }
        }
        return min==Integer.MAX_VALUE? 0:min;
    }
}