class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length-1;
        int minIdx = sub(0,len,nums);
        
        if(nums[minIdx] == target) return minIdx;
        
        int left = binSearch(0,minIdx-1,target,nums);
        int right = binSearch(minIdx+1,len,target,nums);
        
        System.out.println(minIdx);
        System.out.println(left);
        System.out.println(right);
        
        if(left == right)   return -1;
        else return Math.max(left,right);
    }
    
    public int sub(int a,int b,int[] arr){
        if(arr[a] < arr[b]) return a;
        int mid = (a+b)/2;
        if(a == mid)    return b;
        if(arr[a] > arr[mid])   return sub(a,mid,arr);
        else    return sub(mid+1,b,arr);
    }
    
    public int binSearch(int left,int right,int target,int[] arr){
        if(left > right)
            return -1;
        int mid = (left + right) / 2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] < target)
            return binSearch(mid+1,right,target,arr);
        else
            return binSearch(left,mid-1,target,arr);
    }
}