class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        while(right<nums.length){
           sum +=nums[right];
           if(sum<target){
            right++;
           }else{
            while(sum>=target){
                int length = right-left+1;
                if(length<minLength) minLength=length;
                sum-=nums[left];
                left++;
            }
            right++;
           }
        }
        if(minLength!=Integer.MAX_VALUE) return minLength;
        return 0;
    }
}