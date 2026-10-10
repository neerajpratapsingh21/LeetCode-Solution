class Solution {
    public int maxScore(int[] nums, int k) {
    int n=nums.length;
    int sum = 0;
    int leftsum=0;
    int left=0;
    while(left != k){
    leftsum += nums[left];
     left++;
       }
     left--;
       int rightsum=0;
       int right=n-1;
       sum = leftsum+rightsum;
       while(right != n-k-1){
      leftsum-=nums[left];
      rightsum+=nums[right];
      sum = (int)Math.max(leftsum+rightsum,sum);
      left--;
      right--;
       }
       return sum;
}
}