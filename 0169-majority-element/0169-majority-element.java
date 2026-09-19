class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int freq = n/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i=0; i<n; i++){
            int val = map.get(nums[i]);
            if(val>freq){
                return nums[i];
            }
        }
        return -1;
    }
}