class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans  = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int l = 0;
        int r = 10;
        
        while( r <= s.length()){
            String curr = s.substring(l, r);
            if(set.contains(curr) && !ans.contains(curr)){
                ans.add(curr);
            }
            set.add(curr);
            r++;
            l++;
        }

        return ans;
    }
}