class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        int i=0, j=0;
        while(j<nums.length){
            while( j<nums.length && nums[i]==nums[j]){
                j++;
            }
            int count = j-i;
            if(count>2){
                tempList.add(nums[i]);
                tempList.add(nums[i]);
            }else{
                for(int k=0; k<count; k++){
                    tempList.add(nums[i]);
                }
            }
            i=j;
        }
        for(int k=0; k<tempList.size(); k++){
            nums[k]=tempList.get(k);
        }
        return tempList.size();
    }
}