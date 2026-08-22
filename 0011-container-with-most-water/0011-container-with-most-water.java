class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int b = right-left;
            int area = h*b;
            if(area>maxArea) maxArea= area;
            if(h==height[left]){
                left++;
            }else if(h==height[right]){
                right--;
            }
        }
        return maxArea;
    }
}