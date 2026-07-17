class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod = 1;
        for(int i=nums.length-1; i>=nums.length-3; i--){
            prod*=nums[i];
        }
        int tempProd = nums[0]*nums[1]*nums[nums.length-1];
        if(tempProd>prod) return tempProd;
        return prod;
    }
}