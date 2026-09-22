class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0 , high = nums.length-1;
        quickSort(nums, low , high);
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        return ans;
    }
    private int partition(int[] arr , int low , int high){
        int randomIdx = low + (int)(Math.random() * (high - low + 1));

    int temp = arr[randomIdx];
    arr[randomIdx] = arr[high];
    arr[high] = temp;
        int pivot = arr[high];
        int i = low-1;
        for(int j=low ; j<high; j++){
            if(arr[j]<pivot){
                i++;
                 temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
         temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    private void quickSort(int[] arr , int low , int high){
        if(low<high){
            int pivotIdx = partition(arr, low , high);
            quickSort(arr, low , pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }
}