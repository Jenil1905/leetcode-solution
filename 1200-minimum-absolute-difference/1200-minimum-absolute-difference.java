class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[0]-arr[1]);
        int j = 1;
        while(j<arr.length-1){
            int diff = Math.abs(arr[j]-arr[j+1]);
            if(diff<minDiff){
                minDiff=diff;
            }
            j++;
        }
        for(int i=0; i<arr.length-1; i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff==minDiff){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
        }
        return ans;
    }
}