class Solution {
    public void findPermutation(int ind, int[] mark,int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(ind == nums.length ){
              if(!ans.contains(ds)){
            ans.add(new ArrayList<>(ds));
           }
             return ;
        }
        for(int i=0;i<nums.length;i++){
            if(mark[i]==0){
                mark[i]=1;
                ds.add(nums[i]);
                findPermutation(ind+1,mark,nums,ds,ans);
                ds.removeLast();
                mark[i]=0;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] mark = new int[nums.length];
        findPermutation(0,mark,nums,ds,ans);
        return ans;
    }
}