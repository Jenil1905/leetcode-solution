class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ps = new int[nums.length];
        ps[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            ps[i]=ps[i-1]+nums[i];
        }
        map.put(0,1);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int remainder = ((ps[i] % k) + k) % k;
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder , map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}