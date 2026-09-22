class Solution {
    public int[] sortArray(int[] nums) {
        int left = 0 , right = nums.length-1;
        mergeSort(nums,left,right);
        return nums;
    }
    private void mergeSort(int[] arr, int left , int right){
        if(left>=right){
            return;
        }
        int middle = left+(right-left)/2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle+1, right);
        merge(arr, left , middle , right);
    }
    private void merge(int[] arr , int left , int mid , int right){
        int i = left;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[right-left+1];
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
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
            arr[x+left]=temp[x];
        }
    }
}