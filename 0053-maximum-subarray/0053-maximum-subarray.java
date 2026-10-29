class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int maxSum=nums[0];
        int sum = 0;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
                left=right+1;
            }
        }
        return maxSum;
    }
}