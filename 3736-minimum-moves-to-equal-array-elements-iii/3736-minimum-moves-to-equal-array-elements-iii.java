class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int num: nums){
            max = Math.max(num,max);
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count+=max-nums[i];
        }
        return count;
    }
}