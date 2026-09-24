class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight: weights){
            low = Math.max(low , weight);
            high += weight;
        }
        while(low<high){
            int mid = low +(high-low)/2;
            int daysNeeded = 1;
            int currWeight = 0;
            for(int weight: weights){
                if(currWeight+weight>mid){
                    daysNeeded++;
                    currWeight=0;
                }
                currWeight+=weight;
            }
            if(daysNeeded<=days){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}