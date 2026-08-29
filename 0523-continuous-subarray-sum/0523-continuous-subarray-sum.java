class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     HashMap<Integer , Integer> map = new HashMap<>();
     int[] ps = new int[nums.length];
     ps[0]=nums[0];
     for(int i=1; i<nums.length; i++){
        ps[i]=ps[i-1]+nums[i];
     }
     map.put(0,-1);
     for(int i=0; i<ps.length; i++){
        int remainder = ps[i]%k;
        if(map.containsKey(remainder)){
            if(i-map.get(remainder)>=2){
                return true;
            }
        }
        if(!map.containsKey(remainder)){
        map.put(remainder , i);
        }
     }
     return false;   
    }
}