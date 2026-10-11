class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length; 
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(n%(i+1)==0){
                list.add(nums[i]);
            }
        }
        long sum = 0;
        for(int i=0; i<list.size(); i++){
            sum+=(long)(list.get(i)*list.get(i));
        }
        return (int)sum;
    }
}