class Solution {
    int ans = -1;
    public int findMin(int[] nums) {
        sub(0,nums.length-1,nums);
        
        return ans;
    }
    
    public void sub(int a,int b,int[] nums){
        if(nums[a] <= nums[b]){
            ans = nums[a];
            return;
        }else{
            int mid = (a+b)/2;
            if(a == mid){   
                ans = nums[b];
                return;
            }
            if(nums[a] < nums[mid]){
                sub(mid+1,b,nums);
            }else{
                sub(a,mid,nums);
            }
        }
    }
}