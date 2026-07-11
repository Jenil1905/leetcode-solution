class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r= nums.length-1;
        int[] result = new int[nums.length];
        int k = nums.length-1;
        while(l<=r){
            int left = Math.abs(nums[l]);
            int right = Math.abs(nums[r]);
            if(left<right){
                result[k]=right*right;
                r--;
            }else{
                result[k]=left*left;
                l++;
            }
            k--;
        }
        return result;
    }
}