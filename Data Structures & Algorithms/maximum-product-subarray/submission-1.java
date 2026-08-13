class Solution {
    public int maxProduct(int[] nums) {
        int currentMax=nums[0];
        int currentMin=nums[0];
        int maxproduct=nums[0];

        int n = nums.length;
        for(int i=1;i<n;i++){
            int num=nums[i];

            int tempMax= Math.max(num , Math.max(currentMax*num, currentMin*num));
            int tempMin=Math.min(num,Math.min(currentMax*num,currentMin*num));

            currentMax=tempMax;
            currentMin=tempMin;

            maxproduct=Math.max(maxproduct,currentMax);
        } return maxproduct;
        
    }
}
