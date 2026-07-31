class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int n =heights.length;
        int left=0;
        int right= n-1;
        while(left<right){
        int width=right - left ;
        int currentHeight=  Math.min(heights[left] , heights[right]);
          int currentArea=  currentHeight*width;
          maxArea=Math.max(currentArea,maxArea);
          if(heights[left]<heights[right]){
            left++;
          } else 
          right--;
        }
     return maxArea;
    }
}