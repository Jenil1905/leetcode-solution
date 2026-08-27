class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int multi = 1;
        if(k<=1) return 0;
        while(right<nums.length){
           multi = multi*nums[right];
           if(multi<k){
            count+=right-left+1;
            right++;
           }else{
            while(multi>=k){
                multi = multi/nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
           }
        }
        return count;
    }
}