class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length+1];
        ps[0]=0;
        for(int i=1; i<ps.length; i++){
            ps[i]=ps[i-1]+nums[i-1];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i=1; i<ps.length; i++){
            int diff = ps[i]-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(ps[i],map.getOrDefault(ps[i],0)+1);
        }
        return count;
    }
}