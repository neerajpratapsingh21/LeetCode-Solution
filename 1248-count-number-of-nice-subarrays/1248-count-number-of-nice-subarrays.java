class Solution {
     public int atMost(int[] nums,int goal){
  int n = nums.length;
      int count =  0;
        int sum = 0;
        int i = 0;
        for(int j = 0; j < n; j++){
           sum += nums[j]%2;
           while(sum > goal && i <= j){
             sum -= nums[i]%2;
             i++;

           }
            count = count + j-i+1 ;
        }
      
        return count;
    }
    public int numberOfSubarrays(int[] nums, int goal) {
        
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
}