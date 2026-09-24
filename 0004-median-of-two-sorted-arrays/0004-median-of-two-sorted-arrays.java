class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        if((list.size())%2==1){
            int n=(list.size()-1)/2;
            return (double)list.get(n);
        } else{
            int m=(list.size()-1)/2;
            double k=((double)list.get(m)+list.get(m+1))/2;
            return (double)k;
        }
    }
}