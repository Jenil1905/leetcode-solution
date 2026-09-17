class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        int prev = 0;
        int right = 1;
        while(right < nums.length){

            if(nums[right] == nums[right - 1] + 1){
                right++;
            }else{

                StringBuilder sb = new StringBuilder();

                if(nums[right - 1] == nums[prev]){
                    sb.append(nums[prev]);
                }else{
                    sb.append(nums[prev]);
                    sb.append("->");
                    sb.append(nums[right - 1]);
                }

                ans.add(sb.toString());

                prev = right;
                right++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(nums[prev] == nums[nums.length - 1]){
            sb.append(nums[prev]);
        }else{
            sb.append(nums[prev]);
            sb.append("->");
            sb.append(nums[nums.length - 1]);
        }
        ans.add(sb.toString());
        return ans;
    }
}

