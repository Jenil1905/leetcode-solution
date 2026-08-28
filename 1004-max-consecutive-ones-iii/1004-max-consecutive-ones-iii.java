class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxLength = Integer.MIN_VALUE;
        while(right<nums.length){
            if(nums[right]==0){
                zeros++;
            }
            right++;
            if(zeros>k){
                while(zeros>k){
                    if(nums[left]==0){
                        zeros--;
                    }
                    left++;
                }
            }
                if(right-left>maxLength) maxLength = right-left;
        }
        return maxLength;
    }
}