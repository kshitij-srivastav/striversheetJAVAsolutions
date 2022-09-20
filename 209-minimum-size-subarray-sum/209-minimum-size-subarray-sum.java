class Solution {
    
    //  Time Complexity = O(N)
    //  Space Complexity = O(1)
    
    public int minSubArrayLen(int target, int[] nums) {
        //  Edge Case
        if (nums == null || nums.length == 0)
		    return 0;
        
		//  Two-Pointers, sum and min variables  
	    int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;
		
        //   
    	while (end < nums.length) {
	        sum += nums[end++];
		    
		    while (sum >= target) {
                min = Math.min(min, end - start);
		        sum -= nums[start++];
		    }
        }
		 
		return min == Integer.MAX_VALUE ? 0 : min;
    }
}