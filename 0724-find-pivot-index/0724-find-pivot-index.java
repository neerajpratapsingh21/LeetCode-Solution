class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int totalsum=0;
       for(int i=0;i<n;i++){
        totalsum += nums[i];
       }
       int leftsum=0;
       for(int i=0;i<n;i++){
        if(i>0) leftsum += nums[i-1];
         int rightsum=totalsum - leftsum - nums[i];
          if(leftsum == rightsum ) return i;
       }
       return -1;
    }
}