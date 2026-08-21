class Solution {
    public void moveZeroes(int[] nums) {
       int left = 0;
       while(left<nums.length){
        if(nums[left]==0){
            break;
        }
        left++;
       } 
       int right = left+1;
       while(right<nums.length){
        if(nums[right]==0){
            right++;
        }else{
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right++;
        }

       }
    }
}