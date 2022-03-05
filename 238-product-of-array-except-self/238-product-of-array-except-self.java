class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int size = nums.length;
        int[] answer = new int[size];
        
        for(int num : nums){
            mul *= num;
        }
        
        for(int i=0;i<size;i++){
            if(nums[i] != 0)
                answer[i] = mul / nums[i];
            else{
                answer[i] = 1;
                for(int j=0;j<size;j++){
                    if(i != j)
                        answer[i] *= nums[j];
                }
            }
        }
        
        return answer;
    }
}