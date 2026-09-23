class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points , (a,b)->Integer.compare(a[0],b[0]));
        int overlapping = 1;
        int start = points[0][0];
        int end = points[0][1];
        for(int i=1; i<points.length; i++){
            int nextStart = points[i][0];
            int nextEnd = points[i][1];
            if(nextStart<=end){
                start = Math.max(start, nextStart);
                end = Math.min(end , nextEnd);
            }else{
                overlapping++;
                start = nextStart;
                end = nextEnd;
            }
        }
        return overlapping;
    }
}