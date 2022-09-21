class Solution {
    public int countPairs(int[] nums, int k) {
       int  count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            List<Integer> indexes = map.getOrDefault(nums[i], new ArrayList<>());
            
            for(int index : indexes) {
                if((index * i) % k == 0) {
                    count++;
                }
            }
            indexes.add(i);
            map.put(nums[i], indexes);
        }
        return count;
    }
}