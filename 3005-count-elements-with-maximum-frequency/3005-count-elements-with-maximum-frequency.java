class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int maxfreq = 0;
        for(int i=1;i<101;i++){
           maxfreq = Math.max(maxfreq , freq[i]);
        }
       int total = 0;
       for(int i= 1;i<101;i++){
        if(freq[i] == maxfreq) total+=freq[i];
       }
       return total;
    }
}