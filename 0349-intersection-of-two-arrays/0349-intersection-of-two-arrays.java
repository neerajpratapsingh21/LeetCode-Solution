class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

      Set<Integer> seen = new HashSet<>();
      for(int i=0; i<nums1.length; i++){
        seen.add(nums1[i]);
      }
     List<Integer> ans = new ArrayList<>();
      for(int i=0;i<nums2.length;i++){
        if(seen.contains(nums2[i]) && !ans.contains(nums2[i])){
            ans.add(nums2[i]);
        }
      }
       return ans.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();

    }
}