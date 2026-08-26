class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = k-1;
        int sum = 0;
        for(int i=left; i<=right; i++){
            sum+= nums[i];   
        }
        if(sum>maxSum) maxSum = sum;

        while(right<nums.length-1){
            sum= sum-nums[left];
            left++;
            right++;
            sum = sum+nums[right];
            if(sum>maxSum) maxSum = sum;
        }
        return (double)maxSum/k;
    }
}