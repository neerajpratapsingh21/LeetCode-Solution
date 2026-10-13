class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=Math.abs(nums[i]);
        }
        Arrays.sort(temp);
      int left=0;
      int right=n-1;
      long score=0;
      while(left<right){
      score += (temp[right]*temp[right])-(temp[left]*temp[left]);
      left++;
      right--;
      }
      if(left == right) return score + (temp[left]*temp[left]);
       return score;
    }
}