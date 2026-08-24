class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            long tempTarget = target-nums[i];
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                long tempTarget1 = tempTarget-nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = nums[left]+nums[right];
                    if(sum==tempTarget1){
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[left]);
                        tempList.add(nums[right]);
                        ans.add(tempList);
                        left++;
                        right--;
                        //check for duplicate
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }else if(sum>tempTarget1){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}