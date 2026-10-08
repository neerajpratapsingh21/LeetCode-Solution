class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int maxlength=1;
        for(int i : set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                maxlength=Math.max(maxlength,count);
            }
        }
        return maxlength;
    }
}