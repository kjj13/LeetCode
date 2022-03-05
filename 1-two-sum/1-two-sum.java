import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /*처음 코드*/
        // int[] result = new int[2];
        // boolean check = false;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             result[0] = i;
        //             result[1] = j;
        //             check = true;
        //             break;
        //         }
        //     }
        //     if(check) break;
        // }
        // return result;
        
        /*개선한 코드*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}