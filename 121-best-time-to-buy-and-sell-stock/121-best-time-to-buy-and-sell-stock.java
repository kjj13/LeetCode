import java.util.*;

class Solution {
    /*day 0305*/
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int num : prices){
            if(min < num){
                max = Math.max(max,num-min);
            }else{
                min = num;
            }
        }
        
        return max;
    }
}