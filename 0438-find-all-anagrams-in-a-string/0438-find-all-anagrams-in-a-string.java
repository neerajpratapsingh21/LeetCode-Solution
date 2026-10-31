class Solution {
    private boolean isEqual(int[] a, int[] b) {
    for(int i = 0; i < 26; i++) {
        if(a[i] != b[i]) return false;
    }
    return true;
}
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
           int n = s.length();
        int k = p.length();
        if( n < k) return ans;
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i = 0; i < k; i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
     if(isEqual(a, b)) ans.add(0);
        int l = 0;
        int r = k;
        while( r < n ){
            b[s.charAt(r)-'a']++;
            b[s.charAt(l)-'a']--;
            if(isEqual(a, b)) ans.add(l+1);
            r++;
            l++;
        }
        return ans;
    }
}