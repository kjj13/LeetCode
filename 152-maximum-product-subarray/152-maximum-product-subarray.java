class Solution {
    public int maxProduct(int[] nums) {
        int size = nums.length;
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        
        for(int i=1;i<size;i++){
            int now = nums[i];
            int a = now * max;
            int b = now * min;
            max = Math.max(now,Math.max(a,b));
            min = Math.min(now,Math.min(a,b));
            
            ans = Math.max(ans, max);
        }
        
        return ans;
    }
}