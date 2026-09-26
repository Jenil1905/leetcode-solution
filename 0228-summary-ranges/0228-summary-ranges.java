class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        int prev = 0;
        int curr = prev+1;
        while(curr<nums.length){
            if(nums[curr]==nums[curr-1]+1){
                curr++;
            }else{
                    StringBuilder sb = new StringBuilder();
                if(nums[prev]==nums[curr-1]){
                    sb.append(nums[prev]);
                }else{
                    sb.append(nums[prev]);
                    sb.append("->");
                    sb.append(nums[curr-1]);
                }
                ans.add(sb.toString());
                prev = curr;
                curr++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(prev == nums.length-1){
            sb.append(nums[prev]);
        }else if(curr==nums.length){
            sb.append(nums[prev]);
            sb.append("->");
            sb.append(nums[curr-1]);
        }
        ans.add(sb.toString());
        return ans;
    }
}