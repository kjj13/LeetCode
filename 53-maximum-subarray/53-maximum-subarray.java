class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int[] DP = new int[size];
        int max = nums[0];
        DP[0] = nums[0];
        
        for(int i=1;i<size;i++){
            DP[i] = Math.max(nums[i] + DP[i-1], nums[i]);
            max = Math.max(max,DP[i]);
        }
        
        return max;
    }
}