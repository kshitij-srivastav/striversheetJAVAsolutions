class Solution {
    public int countPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            List<Integer> indexes= hm.getOrDefault(nums[i],new ArrayList<>());
            for( int index:indexes){
                if(index*i%k==0)
                    count++;
            }
            indexes.add(i);
            hm.put(nums[i],indexes);
        }
        return count;
    }
}