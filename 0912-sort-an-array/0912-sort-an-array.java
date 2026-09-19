class Solution {
    public int[] sortArray(int[] nums) {
        int left = 0 , right = nums.length-1;
        mergeSort(nums, left , right);
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        return ans;
    }
    private void mergeSort(int[] arr , int left , int right){
        if(left>=right){
            return ;
        }
        int mid = left+(right-left)/2;
        mergeSort(arr , left , mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left , mid , right);
    }
    private void merge(int[] arr , int left , int mid , int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int x=0; x<temp.length; x++){
            arr[x+left]= temp[x];
        }
    }
}