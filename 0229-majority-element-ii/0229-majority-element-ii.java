class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 0){
    return new ArrayList<>();
}
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int candidate1=0;
        int count1=0;
        int candidate2=0;
        int count2=0;
       for(int i=0;i<n;i++){
        if(count1==0 && candidate2 != nums[i]){
     candidate1=nums[i];
     count1++;
        }else if(count2==0 && candidate1 != nums[i]){
        candidate2=nums[i];
        count2++;
       }else if(candidate1==nums[i]){
        count1++;
       }else if(candidate2==nums[i]){
        count2++;
    }else{
        count2--;
        count1--;
       }
       }
       // Verifying candidates 
    int  occurrence1=0;
    int occurrence2=0;
       for(int i=0;i<n;i++){
         if(nums[i]==candidate1){
            occurrence1++;
         }else if(nums[i]==candidate2){
           occurrence2++;
         }
       }
       if(occurrence1>n/3){
        res.add(candidate1);
       }
       if(occurrence2>n/3){
        res.add(candidate2);
       }
       return res;
    }
}