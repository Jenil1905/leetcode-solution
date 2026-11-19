class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        for(int x: set){
            int curr = x;
            if(!set.contains(curr-1)){
                int count = 1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
            maxCount = Math.max(count , maxCount);
            }
        }
        return maxCount;
    }
}