class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[i]);
                    ans.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) { j++; }
    while (j < k && nums[k] == nums[k + 1]) {
        k--;
    }
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}