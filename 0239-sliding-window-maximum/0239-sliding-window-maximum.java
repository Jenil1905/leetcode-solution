class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k-1;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=left; i<=right; i++){
            if(nums[i]>max) max = nums[i];
        }
        ans.add(max);
        while(right<nums.length-1){
            left++;
            right++;
            if(nums[left-1]==max){
                max = findMax(nums,left,right);
                ans.add(max);
            }
            else if(nums[right]>max){
                max= nums[right];
                ans.add(max);
            }else{
                ans.add(max);
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    private int findMax(int[] nums, int left, int right){
        int max = Integer.MIN_VALUE;
        for(int i=left; i<=right; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}